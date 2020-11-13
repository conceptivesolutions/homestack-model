package io.conceptive.netplan.model.websocket;

import io.vertx.core.json.*;

import javax.websocket.*;
import javax.websocket.DecodeException;
import javax.websocket.EncodeException;

/**
 * Coder for Websockets
 *
 * @see WebsocketEvent
 * @author w.glanzer, 13.11.2020
 */
public class WebsocketEventCoder implements Decoder.Text<WebsocketEvent<?>>, Encoder.Text<WebsocketEvent<?>>
{

  private static final String _PREFIX = "WSE::";

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
    if(pString == null)
      return null;

    try
    {
      pString = pString.substring(_PREFIX.length());
      return Json.decodeValue(pString, WebsocketEvent.class);
    }
    catch(Exception e)
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
    if(pEvent == null)
      return null;

    try
    {
      return _PREFIX + Json.encode(pEvent);
    }
    catch(Exception e)
    {
      throw new EncodeException(pEvent, "Failed to encode websocket event", e);
    }
  }
}
