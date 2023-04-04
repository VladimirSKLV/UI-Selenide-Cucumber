package models.mobile.referal;

import lombok.Data;

import java.util.ArrayList;

@Data
public class RefDashboard {
    private RefStat stats;
    private ArrayList<RefStore> stores;
}
