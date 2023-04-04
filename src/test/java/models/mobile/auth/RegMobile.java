package models.mobile.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegMobile {

    @JsonProperty("deviceId")
    private String deviceID;
    @JsonProperty("password")
    private String password;
    @JsonProperty("timeZone")
    private String timeZone;
    @JsonProperty("username")
    private String username;
}
