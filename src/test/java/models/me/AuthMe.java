package models.me;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthMe {

    private Integer refreshPeriod;
    private String refreshToken;
    private String token;
    private ArrayList<String> authorities;
    private String imageId;
    private String merchantId;
    private String omnideskSupportCenterUrl;
    private String signupStep;
    private Integer tokenRefreshPeriod;
    private String username;

}
