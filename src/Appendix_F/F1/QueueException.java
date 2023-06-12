package Appendix_F.F1;

public class QueueException extends RuntimeException{
    public QueueException(){
        super();
    }

    public QueueException(String massage) {
        super(massage);
    }

    public QueueException(String massage, Exception cause){
        super(massage, cause);
    }
}
