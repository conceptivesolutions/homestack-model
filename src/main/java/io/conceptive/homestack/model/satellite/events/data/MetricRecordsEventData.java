package io.conceptive.homestack.model.satellite.events.data;

import io.conceptive.homestack.model.data.MetricRecordDataModel;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * Event that gets send to backend, if new records are available
 *
 * @author w.glanzer, 15.11.2020
 */
public class MetricRecordsEventData
{

  /**
   * Contains all recorded data
   */
  public Set<MetricRecordDataModel> records;

  public MetricRecordsEventData()
  {
  }

  public MetricRecordsEventData(@NotNull Set<MetricRecordDataModel> pRecords)
  {
    records = pRecords;
  }

  @Override
  public boolean equals(Object pO)
  {
    if (this == pO)
      return true;
    if (pO == null || getClass() != pO.getClass())
      return false;
    MetricRecordsEventData that = (MetricRecordsEventData) pO;
    return Objects.equals(records, that.records);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(records);
  }
}
