package models.mobile.mobileStore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Store {
    private Integer cashback;
    private Integer discount;
    private String id;
    private Integer latitude;
    private String logoId;
    private Integer longitude;
    private String name;
    private Integer points;
    private ArrayList<String> tags;
}
