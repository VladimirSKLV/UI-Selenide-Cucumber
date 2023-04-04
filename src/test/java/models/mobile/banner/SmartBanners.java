package models.mobile.banner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SmartBanners {
    private Integer programId;
    private String merchantId;
    private String storeId;
    private Integer distance;
    private Integer loyalty;
    private Boolean preOrderAvailable;
    private String color;
    private String merchantName;
    private String logoId;
    private String type;
    private ArrayList<Object> productCategoryIcons;
}
