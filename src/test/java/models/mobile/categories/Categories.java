package models.mobile.categories;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import models.mobile.merchants.Merchant;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Categories {
    @JsonProperty("color")
    private String color;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("merchants")
    private ArrayList<Merchant> merchants;
    @JsonProperty("name")
    private String name;
}
