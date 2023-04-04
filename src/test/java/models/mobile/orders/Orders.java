package models.mobile.orders;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Orders {
    private Integer amount;
    private Integer cashback;
    private CashbackCalcResult cashbackCalcResult;
    private Boolean cashbackPaid;
    private Discount discount;
    private Integer dscnt;
    private ExternalLoyalty externalLoyalty;
    private String id;
    private String merchantCashier;
    private String merchantCategory;
    private String merchantId;
    private String merchantName;
    private String merchantOrderNumber;
    private String merchantProfileImageId;
    private PointCalcResult pointCalcResult;
    private Integer points;
    private ArrayList<Purchase> purchases;
    private Date saleDate;
    private Integer withdrawPoints;
}
