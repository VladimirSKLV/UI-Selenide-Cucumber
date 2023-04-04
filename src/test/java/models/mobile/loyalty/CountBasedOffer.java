package models.mobile.loyalty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountBasedOffer {

    private Integer current;
    private String iconType;
    private Integer required;

}
