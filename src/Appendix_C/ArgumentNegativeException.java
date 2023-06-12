package Appendix_C;

public class ArgumentNegativeException extends RuntimeException {
    public ArgumentNegativeException(){
        super();
    }

    public ArgumentNegativeException(String massage){
        super(massage);
    }

    public ArgumentNegativeException(String massage, Exception cause){
        super(massage, cause);
    }
}
