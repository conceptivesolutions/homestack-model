package io.conceptive.homestack.model.data;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

/**
 * Location of a model on screen
 *
 * @author w.glanzer, 11.11.2020
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@RegisterForReflection
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

}
