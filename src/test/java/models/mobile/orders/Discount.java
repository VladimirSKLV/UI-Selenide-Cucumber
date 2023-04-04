package models.mobile.orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Discount {
    private Integer discount;
    private Integer discountOriginal;
    private ArrayList<Line> lines;
}
