package de.homestack.model.data;

import java.util.Objects;

/**
 * Location of a model on screen
 *
 * @author w.glanzer, 11.11.2020
 */
@SuppressWarnings("unused")
public final class ScreenLocationDataModel
{

  /**
   * X Position on screen
   */
  public float x;

  /**
   * Y Position on screen
   */
  public float y;

  @Override
  public boolean equals(Object pO)
  {
    if (this == pO)
      return true;
    if (pO == null || getClass() != pO.getClass())
      return false;
    ScreenLocationDataModel that = (ScreenLocationDataModel) pO;
    return Float.compare(that.x, x) == 0 && Float.compare(that.y, y) == 0;
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(x, y);
  }
}
