package models.mobile.loyalty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MerchLoyaltyCard {

    private String merchantId;
    private String merchantName;
    private Integer balance;
    private Integer received;
    private String segment;
    private Integer currentPct;
    private Integer nextPct;
    private String logoHex;
    private Boolean activated;
    private String storeId;
    private Object offerFullDescription;

}
