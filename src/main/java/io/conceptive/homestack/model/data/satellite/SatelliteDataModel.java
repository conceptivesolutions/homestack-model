package io.conceptive.homestack.model.data.satellite;

import lombok.*;

/**
 * Model for a single satellite
 *
 * @author w.glanzer, 30.11.2020
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class SatelliteDataModel
{

  /**
   * ID of the satellite
   */
  @NonNull
  public String id;

  /**
   * ID of the stack this satellite belongs to
   */
  @NonNull
  public String stackID;

}
