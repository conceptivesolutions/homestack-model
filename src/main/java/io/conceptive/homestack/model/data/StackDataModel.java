package io.conceptive.homestack.model.data;

import io.conceptive.homestack.model.data.device.DeviceDataModel;
import io.conceptive.homestack.model.data.satellite.SatelliteDataModel;
import lombok.*;

import java.util.List;

/**
 * POJO for a single stack
 *
 * @author w.glanzer, 15.10.2020
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public final class StackDataModel
{

  /**
   * ID of the stack
   */
  @NonNull
  public String id;

  /**
   * Displayable String
   */
  public String displayName;

  /**
   * Devices in this stack
   */
  public List<DeviceDataModel> devices;

  /**
   * Satellites in this stack
   */
  public List<SatelliteDataModel> satellites;

}
