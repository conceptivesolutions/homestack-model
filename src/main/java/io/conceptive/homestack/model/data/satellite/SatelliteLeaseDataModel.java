package io.conceptive.homestack.model.data.satellite;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

import java.util.Date;

/**
 * A model for a single satellite lease
 *
 * @author w.glanzer, 29.11.2020
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@RegisterForReflection
public class SatelliteLeaseDataModel
{

  /**
   * ID of the lease
   */
  @NonNull
  public String id;

  /**
   * ID of the satellite this lease belongs to
   */
  @NonNull
  public String satelliteID;

  /**
   * ID of the user, who owns this lease
   */
  public String userID;

  /**
   * Date, when this lease was revoked by user
   */
  public Date revokedDate;

  /**
   * Token for the satellite
   */
  public String token;

}
