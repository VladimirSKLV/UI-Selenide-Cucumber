package models.me;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BodySignUp {

    private String keepLoggedIn;
    private String password;
    private String username;

}
