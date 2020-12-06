package io.conceptive.homestack.model.data;

import java.util.Objects;

/**
 * POJO for a single stack
 *
 * @author w.glanzer, 15.10.2020
 */
@SuppressWarnings("unused")
public final class StackDataModel
{

  /**
   * ID of the stack
   */
  public String id;

  /**
   * Displayable String
   */
  public String displayName;

  @Override
  public boolean equals(Object pO)
  {
    if (this == pO)
      return true;
    if (pO == null || getClass() != pO.getClass())
      return false;
    StackDataModel that = (StackDataModel) pO;
    return Objects.equals(id, that.id) && Objects.equals(displayName, that.displayName);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, displayName);
  }
}
