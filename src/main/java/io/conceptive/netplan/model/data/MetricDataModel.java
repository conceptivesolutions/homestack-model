package io.conceptive.netplan.model.data;

import java.util.Map;

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

}
