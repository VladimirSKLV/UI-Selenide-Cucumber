package models.cashgate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoyaltyController {
    private DiscountCalcResult discountCalcResult;
    private Integer total;
    private Integer totalBeforeCalc;
}
