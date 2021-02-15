package io.conceptive.homestack.model.data.satellite;

import lombok.*;

import java.util.List;

/**
 * Model for a single satellite
 *
 * @author w.glanzer, 30.11.2020
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SatelliteDataModel
{

  /**
   * ID of the satellite
   */
  @NonNull
  public String id;

  /**
   * Leases
   */
  public List<SatelliteLeaseDataModel> leases;

}
