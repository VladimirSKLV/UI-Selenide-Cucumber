package models.mobile.merchants;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import models.mobile.I18n.I18n;
import models.mobile.mobileStore.Store;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Merchant {

    private Integer affluentCashback;
    private Integer cashback;
    private String description;
    private Boolean hidden;
    private I18n i18n;
    private String id;
    private Integer massAffluentCashback;
    private Integer massCashback;
    private String name;
    private String profileImageId;
    private List<Store> stores;
    private Boolean stpEnabled;
    private String whoPaysCashback;
}
