package io.conceptive.homestack.model.data.metric;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

import java.util.*;

/**
 * POJO for a single metric record for a single device
 *
 * @author w.glanzer, 12.10.2020
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@RegisterForReflection
public class MetricRecordDataModel
{

  /**
   * Unique ID of this metric
   */
  @NonNull
  public String id;

  /**
   * ID of the metric this record belongs to
   */
  @NonNull
  public String metricID;

  /**
   * Time when this metric was recorded
   */
  public Date recordDate;

  /**
   * State of this metric
   */
  public EMetricRecordState state;

  /**
   * Additional properties to the current state
   */
  public Map<String, String> result;

}
