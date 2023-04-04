package models.mobile.orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalLoyalty {
    private Boolean available;
    private Integer merchantPoints;
    private Points points;
}
