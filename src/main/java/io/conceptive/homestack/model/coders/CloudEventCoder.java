package io.conceptive.homestack.model.coders;

import io.cloudevents.CloudEvent;
import io.cloudevents.core.format.EventFormat;
import io.cloudevents.core.provider.EventFormatProvider;
import io.cloudevents.jackson.JsonFormat;

import javax.websocket.*;
import java.nio.ByteBuffer;
import java.util.Objects;

/**
 * Coder for CloudEvents
 *
 * @author w.glanzer, 13.11.2020
 */
public class CloudEventCoder implements Decoder.Binary<CloudEvent>, Encoder.Binary<CloudEvent>
{

  private final EventFormat format = Objects.requireNonNull(EventFormatProvider.getInstance().resolveFormat(JsonFormat.CONTENT_TYPE));

  @Override
  public void init(EndpointConfig config)
  {
  }

  @Override
  public void destroy()
  {
  }

  @Override
  public boolean willDecode(ByteBuffer pByteBuffer)
  {
    return true;
  }

  @Override
  public CloudEvent decode(ByteBuffer pByteBuffer)
  {
    return format.deserialize(pByteBuffer.array());
  }

  @Override
  public ByteBuffer encode(CloudEvent pCloudEvent)
  {
    return ByteBuffer.wrap(format.serialize(pCloudEvent));
  }

}
