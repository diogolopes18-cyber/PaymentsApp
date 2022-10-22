package Exceptions;

public class InvalidAmountException extends Exception{
    public InvalidAmountException() throws Exception {
        throw new Exception("The payment amount is invalid");
    }
}