package models.mobile.cards;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiscountCards {

    private String imageBack;
    private String imageFront;
    private String merchantId;
    private String name;
    private String nameForNewCard;
    private Date updatedAt;

}
