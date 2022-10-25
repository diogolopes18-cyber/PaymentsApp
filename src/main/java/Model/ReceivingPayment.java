package Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class ReceivingPayment
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SenderId")
    private int SenderId;

    @Column(name = "PaymentComment")
    private String PaymentComment;

    @Column(name = "amount")
    private float Amount;

    @Column(name = "PaymentMethod")
    String PaymentMethod;

    @Column(name = "PaymentDate")
    Date PaymentDate;
}
