package io.conceptive.homestack.model.satellite.events;

import io.conceptive.homestack.model.satellite.SatelliteConfigurationDataModel;
import io.conceptive.homestack.model.satellite.events.data.*;
import io.conceptive.homestack.model.websocket.WebsocketEvent;

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

  /**
   * Event that will send the config to use by a single satellite
   */
  public static final WebsocketEvent<SatelliteConfigurationDataModel> CONFIG = new WebsocketEvent<>("config");

  /**
   * Event to inform the cloud, that new records are available
   */
  public static final WebsocketEvent<MetricRecordsEventData> RECORDS = new WebsocketEvent<>("records");

}
