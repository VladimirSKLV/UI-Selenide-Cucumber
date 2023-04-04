package models.mobile.orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Purchase {
    private Integer amount;
    private Integer discount;
    private String id;
    private Integer merchantDiscount;
    private String name;
    private String parentId;
    private Integer price;
    private String productId;
    private Integer quantity;
    private String unit;
}
