package models.mobile.orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Line {
    private String campaignId;
    private Integer cashback;
    private Integer cboRequiredCount;
    private String description;
    private Integer programId;
    private Integer purchaseCount;
    private Integer discount;
    private Integer points;
}
