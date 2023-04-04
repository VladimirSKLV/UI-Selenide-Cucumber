package models.mobile.payment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentCards {

    private String id;
    private String customerId;
    private String cardNumber;
    private Boolean defaultForPayments;
    private String bankName;
    private String bankLogo;
    private String paymentSystem;
    private Long createdAt;
    private Long updatedAt;
    private Boolean blocked;
}
