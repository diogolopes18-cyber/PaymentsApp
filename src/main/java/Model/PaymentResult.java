package Model;

import Payments.PaymentStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "PaymentResult")
public class PaymentResult {

    @Column(name = "status")
    //The payment status: successful or unsuccessful
    private PaymentStatus Status;

    @Column(name = "comment")
    //Sets a comment in case some error occurred during the transaction
    private String Comment;

    @Id
    @ManyToOne
    @JoinColumn(name = "paymentId", referencedColumnName = "paymentId")
    private PaymentInfo paymentId;
}
