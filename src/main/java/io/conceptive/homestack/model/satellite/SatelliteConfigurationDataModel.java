package io.conceptive.homestack.model.satellite;

import io.conceptive.homestack.model.data.*;

import java.util.*;

/**
 * Model, that a single satellite retrieves from the cloud, to get its configuration.
 *
 * @author w.glanzer, 10.11.2020
 */
@SuppressWarnings("unused")
public class SatelliteConfigurationDataModel
{

  /**
   * Contains all known devices
   */
  public Set<DeviceDataModel> devices;

  /**
   * Contains all metrics, that should be executed.
   * It can contain metric types, that this satellite is not able to execute (specified by enabledMetricTypes)
   */
  public Set<MetricDataModel> metrics;

  @Override
  public boolean equals(Object pO)
  {
    if (this == pO)
      return true;
    if (pO == null || getClass() != pO.getClass())
      return false;
    SatelliteConfigurationDataModel that = (SatelliteConfigurationDataModel) pO;
    return Objects.equals(devices, that.devices) &&
        Objects.equals(metrics, that.metrics);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(devices, metrics);
  }
}
