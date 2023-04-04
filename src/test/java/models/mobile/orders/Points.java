package models.mobile.orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Points {
    private Integer added;
    private Integer removed;
    private Integer total;
}
