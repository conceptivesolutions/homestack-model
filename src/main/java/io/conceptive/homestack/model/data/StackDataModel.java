package io.conceptive.homestack.model.data;

import lombok.*;

/**
 * POJO for a single stack
 *
 * @author w.glanzer, 15.10.2020
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
