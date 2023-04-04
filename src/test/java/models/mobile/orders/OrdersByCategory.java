package models.mobile.orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdersByCategory {
    private String category;
    private String categoryColor;
    private Integer totalCashback;
    private Integer totalDiscount;
    private Integer totalExpense;
    private Integer totalExternalLoyaltyPoints;
    private Integer totalPoints;
    private Integer totalPointsAsDiscount;
    private Integer totalWithdrawPoints;
}
