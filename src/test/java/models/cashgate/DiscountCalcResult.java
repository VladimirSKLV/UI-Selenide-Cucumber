package models.cashgate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import models.mobile.orders.Line;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiscountCalcResult {
    private Integer discount;
    private Integer discountOriginal;
    private ArrayList<Line> lines;
}
