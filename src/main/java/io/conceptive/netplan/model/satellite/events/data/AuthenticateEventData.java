package io.conceptive.netplan.model.satellite.events.data;

import io.conceptive.netplan.model.satellite.events.SatelliteWebSocketEvents;
import org.jetbrains.annotations.NotNull;

/**
 * Data for AUTHENTICATE event
 *
 * @author w.glanzer, 13.11.2020
 */
public class AuthenticateEventData
{
  /**
   * ID of the satellite
   */
  public String id;

  /**
   * Version of the satellite
   */
  public String version;

  /**
   * Communication Version
   */
  public int commVersion;

  /**
   * JWT to authenticate / authorize
   */
  public String token;

  public AuthenticateEventData()
  {
  }

  public AuthenticateEventData(@NotNull String pId, @NotNull String pVersion, @NotNull String pToken)
  {
    id = pId;
    version = pVersion;
    commVersion = SatelliteWebSocketEvents.COMM_VERSION;
    token = pToken;
  }
}
