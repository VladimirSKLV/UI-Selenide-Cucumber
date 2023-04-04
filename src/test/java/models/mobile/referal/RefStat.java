package models.mobile.referal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RefStat {

    private Integer didFirstPaymentCount;
    private Integer receivedPoints;
    private Integer sharedLinks;
}
