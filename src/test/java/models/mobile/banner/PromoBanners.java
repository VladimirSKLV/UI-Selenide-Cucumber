package models.mobile.banner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import models.mobile.loyalty.CountBasedOffer;
import models.mobile.mobileStore.Store;

import java.util.ArrayList;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PromoBanners {
    private String bannerType;
    private String bgImageId;
    private String bodyText;
    private String color;
    private CountBasedOffer countBasedOffer;
    private String counterText;
    private String currentSegment;
    private ArrayList<String> daysOfWeek;
    private Date finishesAt;
    private Date finishesOn;
    private String footerText;
    private Integer fpLoyaltyPct;
    private String headerText;
    private String icon;
    private String iconImageId;
    private Integer id;
    private Integer idx;
    private Integer loyaltyPct;
    private String merchantId;
    private String product;
    private Integer programId;
    private Integer purchasesCount;
    private Integer requiredCount;
    private String schedule;
    private Date startsAt;
    private String storeId;
    private ArrayList<Store> stores;
    private String type;
    private Boolean virtualForCbo;
}
