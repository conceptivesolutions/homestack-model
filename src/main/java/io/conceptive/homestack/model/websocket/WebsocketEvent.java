package io.conceptive.homestack.model.websocket;

import org.jetbrains.annotations.*;

import java.util.Objects;

/**
 * Represents a single event for a websocket communication
 *
 * @author w.glanzer, 13.11.2020
 */
public class WebsocketEvent<T>
{

  /**
   * Type of the event
   */
  String type;

  /**
   * Data
   */
  T payload;

  public WebsocketEvent()
  {
  }

  public WebsocketEvent(@NotNull String pType)
  {
    type = pType;
  }

  /**
   * Creates a copy of the event and specifies the payload
   */
  @NotNull
  public <T1 extends T> WebsocketEvent<T1> payload(@Nullable T1 pPayload)
  {
    WebsocketEvent<T1> event = new WebsocketEvent<>();
    event.type = type;
    event.payload = pPayload;
    return event;
  }

  /**
   * Determines, if both events got the same type
   *
   * @param pEvent Event to check
   * @return true, if this and their event got the same type
   */
  public boolean equalType(@NotNull WebsocketEvent<?> pEvent)
  {
    return Objects.equals(type, pEvent.type);
  }

  /**
   * Extracts the payload of this event, with the type of the given websocket event
   *
   * @param pEvent Event to determine the payload type
   * @return the payload
   */
  @NotNull
  public T payloadOf(@NotNull WebsocketEvent<?> pEvent)
  {
    if (equalType(pEvent))
      //noinspection unchecked
      return (T) pEvent.payload;

    throw new UnsupportedOperationException(pEvent + " could not be cast to " + this);
  }

  @Override
  public boolean equals(Object pO)
  {
    if (this == pO) return true;
    if (pO == null || getClass() != pO.getClass())
      return false;
    WebsocketEvent<?> that = (WebsocketEvent<?>) pO;
    return Objects.equals(type, that.type) && Objects.equals(payload, that.payload);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(type, payload);
  }
}
