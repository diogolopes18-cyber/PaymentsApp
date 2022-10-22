package Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "ReceivingPayment")
public class ReceivingPayment
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SenderId")
    private int SenderId;

    @Column(name = "comment")
    private String PaymentComment;

    @Column(name = "amount")
    private float Amount;

    @Column(name = "method")
    String PaymentMethod;

    @Column(name = "date")
    Date PaymentDate;
}
