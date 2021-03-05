package io.conceptive.homestack.model.data.device;

import io.conceptive.homestack.model.data.ScreenLocationDataModel;
import lombok.*;

import java.util.List;

/**
 * @author w.glanzer, 13.09.2020
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class DeviceDataModel
{

  /**
   * Unique ID of the device
   */
  @NonNull
  public String id;

  /**
   * ID of the stack this device belongs to
   */
  @NonNull
  public String stackID;

  /**
   * Name of the icon for this device (mainly present in gui)
   */
  public String icon;

  /**
   * Address (IP or Hostname) of the device
   */
  public String address;

  /**
   * Determines, where this device is located
   */
  public ScreenLocationDataModel location;

  /**
   * Contains all available slots with "row" and "column" coordinates
   */
  public List<List<NetworkSlotDataModel>> slots;

}
