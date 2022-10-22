package Exceptions;

public class InvalidDestinationAccountException extends Exception{
    public InvalidDestinationAccountException() throws Exception{
        throw new Exception("Destination account is invalid");
    }
}