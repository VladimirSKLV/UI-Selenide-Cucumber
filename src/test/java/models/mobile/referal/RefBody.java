package models.mobile.referal;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RefBody {
    @JsonProperty("merchantId")
    private String merchantId;
    @JsonProperty("programId")
    private String programId;
    @JsonProperty("referrerPoints")
    private Integer referrerPoints;
    private String storeId;
}