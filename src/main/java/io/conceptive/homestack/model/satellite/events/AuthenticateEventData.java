package io.conceptive.homestack.model.satellite.events;

import lombok.*;

/**
 * Data for AUTHENTICATE event
 *
 * @author w.glanzer, 13.11.2020
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AuthenticateEventData
{

  public static final String TYPE = "authenticate";

  /**
   * ID of the lease to use for this satellite
   */
  @NonNull
  public String leaseID;

  /**
   * Token that matches the lease ID
   */
  @NonNull
  public String leaseToken;

  /**
   * Version of the satellite
   */
  @NonNull
  public String version;

  /**
   * Communication Version
   */
  @NonNull
  public int commVersion = 1; //todo replace with build version

}
