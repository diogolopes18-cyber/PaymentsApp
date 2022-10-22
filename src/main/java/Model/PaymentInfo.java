package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "PaymentInfo")
public class PaymentInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PaymentId")
    private Integer paymentId;
    @Basic
    @Column(name = "Amount")
    private Integer amount;
    @Basic
    @Column(name = "paymentcomment")
    private String paymentcomment;
    @Basic
    @Column(name = "destinationaccount")
    private String destinationaccount;

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getPaymentcomment() {
        return paymentcomment;
    }

    public void setPaymentcomment(String paymentcomment) {
        this.paymentcomment = paymentcomment;
    }

    public String getDestinationaccount() {
        return destinationaccount;
    }

    public void setDestinationaccount(String destinationaccount) {
        this.destinationaccount = destinationaccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaymentInfo that = (PaymentInfo) o;

        if (paymentId != null ? !paymentId.equals(that.paymentId) : that.paymentId != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (paymentcomment != null ? !paymentcomment.equals(that.paymentcomment) : that.paymentcomment != null)
            return false;
        if (destinationaccount != null ? !destinationaccount.equals(that.destinationaccount) : that.destinationaccount != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = paymentId != null ? paymentId.hashCode() : 0;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (paymentcomment != null ? paymentcomment.hashCode() : 0);
        result = 31 * result + (destinationaccount != null ? destinationaccount.hashCode() : 0);
        return result;
    }
}
