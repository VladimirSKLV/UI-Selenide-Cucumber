package models.me;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUp {

    private Integer refreshPeriod;
    private String refreshToken;
    private String token;

}
