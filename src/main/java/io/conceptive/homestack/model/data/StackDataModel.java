package io.conceptive.homestack.model.data;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

/**
 * POJO for a single stack
 *
 * @author w.glanzer, 15.10.2020
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@RegisterForReflection
public final class StackDataModel
{

  /**
   * ID of the stack
   */
  @NonNull
  public String id;

  /**
   * Displayable String
   */
  public String displayName;

}
