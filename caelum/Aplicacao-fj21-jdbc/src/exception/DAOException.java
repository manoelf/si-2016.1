package exception;

/**
 * Created by manoelferreira on 1/13/17.
 */
public class DAOException extends RuntimeException {

    public DAOException(String msg) {
        super(msg);
    }

    public DAOException() {
        super();
    }


}
