package io.conceptive.homestack.model.satellite.events;

import io.conceptive.homestack.model.data.metric.MetricRecordDataModel;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

import java.util.Set;

/**
 * Event that gets send to backend, if new records are available
 *
 * @author w.glanzer, 15.11.2020
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@RegisterForReflection
public class MetricRecordsEventData
{

  public static final String TYPE = "pushMetricRecords";

  /**
   * Contains all recorded data
   */
  @NonNull
  public Set<MetricRecordDataModel> records;

}
