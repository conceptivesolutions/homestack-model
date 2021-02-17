package io.conceptive.homestack.model.data.metric;

import lombok.*;

import java.util.Map;

/**
 * POJO for a single metric that describes, which statistics should be metrified
 *
 * @author w.glanzer, 02.11.2020
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MetricDataModel
{

  /**
   * ID of the device, this metric is applicable for
   */
  @NonNull
  public String id;

  /**
   * ID of the device this metric belongs to
   */
  @NonNull
  public String deviceID;

  /**
   * Type of the metric (acts like an ID in combination with deviceID)
   * something like "ping, tracert, ..."
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
