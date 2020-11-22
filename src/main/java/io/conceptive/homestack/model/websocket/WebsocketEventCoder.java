package io.conceptive.homestack.model.websocket;

import io.vertx.core.json.Json;

import javax.websocket.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * Coder for Websockets
 *
 * @author w.glanzer, 13.11.2020
 * @see WebsocketEvent
 */
public class WebsocketEventCoder implements Decoder.Text<WebsocketEvent<?>>, Encoder.Text<WebsocketEvent<?>>
{

  private static final String _SEPARATOR = "::";
  private static final String _PREFIX = "WSE";

  @Override
  public void init(EndpointConfig config)
  {
  }

  @Override
  public void destroy()
  {
  }

  @Override
  public WebsocketEvent<?> decode(String pString) throws DecodeException
  {
    if (pString == null)
      return null;

    try
    {
      StringTokenizer tokenizer = new StringTokenizer(pString, _SEPARATOR);
      String prefix = tokenizer.nextToken(); // ignore
      String type = new String(Base64.getUrlDecoder().decode(tokenizer.nextToken()), StandardCharsets.UTF_8);
      String payloadClass = new String(Base64.getUrlDecoder().decode(tokenizer.nextToken()), StandardCharsets.UTF_8);
      String payload = new String(Base64.getUrlDecoder().decode(tokenizer.nextToken()), StandardCharsets.UTF_8);

      WebsocketEvent<Object> event = new WebsocketEvent<>();
      event.type = type;
      event.payload = Json.decodeValue(payload, Class.forName(payloadClass));
      return event;
    }
    catch (Exception e)
    {
      throw new DecodeException(pString, "Not an instance of websocket event", e);
    }
  }

  @Override
  public boolean willDecode(String pString)
  {
    return pString != null && pString.startsWith(_PREFIX);
  }

  @Override
  public String encode(WebsocketEvent<?> pEvent) throws EncodeException
  {
    if (pEvent == null)
      return null;

    try
    {
      return _PREFIX +
          _SEPARATOR + Base64.getUrlEncoder().encodeToString(pEvent.type.getBytes(StandardCharsets.UTF_8)) +
          _SEPARATOR + (pEvent.payload == null ? null : Base64.getUrlEncoder().encodeToString(pEvent.payload.getClass().getName().getBytes(StandardCharsets.UTF_8))) +
          _SEPARATOR + (pEvent.payload == null ? null : Base64.getUrlEncoder().encodeToString(Json.encode(pEvent.payload).getBytes(StandardCharsets.UTF_8)));
    }
    catch (Exception e)
    {
      throw new EncodeException(pEvent, "Failed to encode websocket event", e);
    }
  }
}
