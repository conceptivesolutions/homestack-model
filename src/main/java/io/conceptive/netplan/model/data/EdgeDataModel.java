package io.conceptive.netplan.model.data;

import java.util.Objects;

/**
 * Simple relation between two devices
 *
 * @author w.glanzer, 12.10.2020
 */
@SuppressWarnings("unused")
public final class EdgeDataModel
{
  /**
   * ID of the edge
   */
  public String id;

  /**
   * ID of the source device
   */
  public String sourceID;

  /**
   * ID of the target device
   */
  public String targetID;

  @Override
  public boolean equals(Object pO)
  {
    if (this == pO)
      return true;
    if (pO == null || getClass() != pO.getClass())
      return false;
    EdgeDataModel that = (EdgeDataModel) pO;
    return Objects.equals(id, that.id) && Objects.equals(sourceID, that.sourceID) && Objects.equals(targetID, that.targetID);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, sourceID, targetID);
  }
}
