package io.conceptive.homestack.model.satellite.events;

import io.conceptive.homestack.model.satellite.SatelliteConfigurationDataModel;
import lombok.*;

/**
 * Event that gets send to satellite, if the satellite configuration was renewed
 *
 * @author w.glanzer, 05.03.2021
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class RenewConfigurationEventData
{

  public static final String TYPE = "renewSatelliteConfiguration";

  /**
   * Contains the new config
   */
  @NonNull
  public SatelliteConfigurationDataModel config;

}
