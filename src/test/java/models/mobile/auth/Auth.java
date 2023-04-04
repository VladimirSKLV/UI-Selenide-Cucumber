package models.mobile.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Auth {

    private String token;
    private String refreshToken;
    private Integer refreshPeriod;
    private Integer tokenRefreshPeriod;
    private String stpStatus;
    private Boolean deviceRegistrationRequired;

}
