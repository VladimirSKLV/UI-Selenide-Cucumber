package models.mobile.payment.stats;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import models.mobile.categories.ByMerchantCategory;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stat {

    private Integer awardPoints;
    private ArrayList<ByMerchantCategory> byMerchantCategory;
    private Integer cashback;
    private Integer creditLimit;
    private Integer discount;
    private Integer overallAwardPoints;
    private Integer overallCashback;
    private Integer overallDiscount;
    private Integer overallPurchases;
    private Integer overallPurchasesOriginal;
    private Integer overallWithdrawPoints;
    private Integer overallWithdrawPointsInMonetary;
    private Integer purchases;
    private Integer purchasesOriginal;
    private Integer savedPercents;
    private Integer savedTotal;
    private Integer withdrawPoints;
    private Integer withdrawPointsInMonetary;
}
