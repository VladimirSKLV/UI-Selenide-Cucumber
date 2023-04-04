package models.mobile.orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PointCalcResult {
    private Integer availablePoints;
    private ArrayList<Line> lines;
    private Integer pointsAsDiscount;
    private Integer total;
}
