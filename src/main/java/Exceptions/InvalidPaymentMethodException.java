package Exceptions;

public final class InvalidPaymentMethodException extends Exception{
    public InvalidPaymentMethodException() throws Exception {
        throw new Exception("Invalid payment method selected");
    }
}