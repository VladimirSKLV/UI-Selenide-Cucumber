package models.cashgate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import models.mobile.orders.Purchase;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExtOrderLoyaltyCalcRequest {
    private String merchantOrderId;
    private Double total;
    private List<Purchase> purchases;
}
