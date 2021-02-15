package io.conceptive.homestack.model.data.device;

import io.conceptive.homestack.model.data.ScreenLocationDataModel;
import io.conceptive.homestack.model.data.metric.MetricDataModel;
import lombok.*;

import java.util.List;

/**
 * @author w.glanzer, 13.09.2020
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeviceDataModel
{

  /**
   * Unique ID of the device
   */
  @NonNull
  public String id;

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

  /**
   * All available metrics
   */
  public List<MetricDataModel> metrics;

}
