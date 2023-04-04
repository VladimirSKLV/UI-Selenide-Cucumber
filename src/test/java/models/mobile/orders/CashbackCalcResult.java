package models.mobile.orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CashbackCalcResult {
    private ArrayList<Line> lines;
    private Integer total;
}
