package io.conceptive.netplan.model.satellite.events;

import io.conceptive.netplan.model.satellite.events.data.AuthenticateEventData;
import io.conceptive.netplan.model.websocket.WebsocketEvent;

/**
 * Contains all events for the communication between satellite and backend
 *
 * @author w.glanzer, 13.11.2020
 */
public class SatelliteWebSocketEvents
{

  /**
   * Contains the communication version.
   * It has to be increased, if something changed and is not compatible with older satellites.
   * This requires the user to update its satellite!
   */
  public static final int COMM_VERSION = 1;

  /**
   * Event that will be sent by a single satellite to authenticate.
   * It gets sent initially and interval based, to "re-login"
   */
  public static final WebsocketEvent<AuthenticateEventData> AUTHENTICATE = new WebsocketEvent<>("authenticate");

}
