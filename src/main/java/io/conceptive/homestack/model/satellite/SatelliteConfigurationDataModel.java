package io.conceptive.homestack.model.satellite;

import io.conceptive.homestack.model.data.device.DeviceDataModel;
import io.conceptive.homestack.model.data.metric.MetricDataModel;
import lombok.*;

import java.util.List;

/**
 * Model, that a single satellite retrieves from the cloud, to get its configuration.
 *
 * @author w.glanzer, 10.11.2020
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class SatelliteConfigurationDataModel
{

  /**
   * Contains all known devices
   */
  public List<DeviceDataModel> devices;

  /**
   * Contains all metrics, that should be executed.
   * It can contain metric types, that this satellite is not able to execute (specified by enabledMetricTypes)
   */
  public List<MetricDataModel> metrics;

}
