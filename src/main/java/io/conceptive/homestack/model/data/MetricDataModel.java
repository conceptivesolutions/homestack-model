package io.conceptive.homestack.model.data;

import java.util.*;

/**
 * POJO for a single metric that describes, which statistics should be metrified
 *
 * @author w.glanzer, 02.11.2020
 */
@SuppressWarnings("unused")
public final class MetricDataModel
{

  /**
   * ID of the device, this metric is applicable for
   */
  public String deviceID;

  /**
   * Type of the metric (acts like an ID in combination with deviceID)
   * something like "ping, tracert, ..."
   *
   * @see MetricRecordDataModel#type
   */
  public String type;

  /**
   * Determines, if this metric is enabled. NULL == FALSE
   */
  public Boolean enabled;

  /**
   * Contains all necessary settings for the given type
   */
  public Map<String, String> settings;

  @Override
  public boolean equals(Object pO)
  {
    if (this == pO)
      return true;
    if (pO == null || getClass() != pO.getClass())
      return false;
    MetricDataModel that = (MetricDataModel) pO;
    return Objects.equals(deviceID, that.deviceID) && Objects.equals(type, that.type) &&
        Objects.equals(enabled, that.enabled) && Objects.equals(settings, that.settings);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(deviceID, type, enabled, settings);
  }
}
