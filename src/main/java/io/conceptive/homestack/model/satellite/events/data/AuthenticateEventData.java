package io.conceptive.homestack.model.satellite.events.data;

import io.conceptive.homestack.model.satellite.events.SatelliteWebSocketEvents;

import java.util.Objects;

/**
 * Data for AUTHENTICATE event
 *
 * @author w.glanzer, 13.11.2020
 */
public class AuthenticateEventData
{
  /**
   * ID of the lease to use for this satellite
   */
  public String leaseID;

  /**
   * Token that matches the lease ID
   */
  public String leaseToken;

  /**
   * Version of the satellite
   */
  public String version;

  /**
   * Communication Version
   */
  public int commVersion = SatelliteWebSocketEvents.COMM_VERSION;

  @Override
  public boolean equals(Object pO)
  {
    if (this == pO)
      return true;
    if (pO == null || getClass() != pO.getClass())
      return false;
    AuthenticateEventData that = (AuthenticateEventData) pO;
    return commVersion == that.commVersion &&
        Objects.equals(leaseID, that.leaseID) &&
        Objects.equals(leaseToken, that.leaseToken) &&
        Objects.equals(version, that.version);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(leaseID, leaseToken, version, commVersion);
  }
}
