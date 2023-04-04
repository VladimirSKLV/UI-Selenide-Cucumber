package models.mobile.referal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RefStore {

    private Integer count;
    private String logoId;
    private String merchantId;
    private String referralProgramId;
    private Integer referrerPoints;
    private String storeId;
    private String title;
}
