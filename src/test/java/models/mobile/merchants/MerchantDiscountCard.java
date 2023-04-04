package models.mobile.merchants;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MerchantDiscountCard {
    private String imageBack;
    private String imageFront;
    private String merchantId;
    private String name;
    private String nameForNewCard;
    private Date updatedAt;
}
