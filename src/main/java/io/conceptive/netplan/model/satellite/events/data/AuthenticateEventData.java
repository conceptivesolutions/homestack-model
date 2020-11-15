package io.conceptive.netplan.model.satellite.events.data;

import io.conceptive.netplan.model.satellite.events.SatelliteWebSocketEvents;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

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

  @Override
  public boolean equals(Object pO)
  {
    if (this == pO)
      return true;
    if (pO == null || getClass() != pO.getClass())
      return false;
    AuthenticateEventData that = (AuthenticateEventData) pO;
    return commVersion == that.commVersion && Objects.equals(id, that.id) &&
        Objects.equals(version, that.version) && Objects.equals(token, that.token);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, version, commVersion, token);
  }
}
