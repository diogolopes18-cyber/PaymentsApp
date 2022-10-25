package Processing;

import Model.PaymentInfo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    private static void SetNewPayment(){
        PaymentInfo payment = new PaymentInfo();
        payment.setPaymentId(1);
        payment.setAmount(40);
        payment.setDestinationaccount("PT50055515");
        payment.setPaymentcomment("test");
    }

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("persistenceUnit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try{
            transaction.begin();
            SetNewPayment();
            transaction.commit();
        } finally {
            if(transaction.isActive()){
                transaction.rollback();
            }

            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
