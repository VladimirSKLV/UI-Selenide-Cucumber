package models.mobile.mobileStore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import models.mobile.payment.stats.LastNAccrual;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatisticPoints {
    @JsonProperty("balance")
    private Integer balance;
    @JsonProperty("received")
    private Integer received;
    @JsonProperty("lastNAccruals")
    private ArrayList<LastNAccrual> lastNAccruals;
}
