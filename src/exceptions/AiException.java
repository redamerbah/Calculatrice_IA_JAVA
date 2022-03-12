package exceptions;

public abstract class AiException extends Exception {

    public ErrorLevel errorLevel;
    public  ErrorMethode errorMethode;

    public AiException(String message,ErrorLevel errorLevel, ErrorMethode errorMethode) {
        this.errorLevel = errorLevel;
        this.errorMethode = errorMethode;

    }
    public String getMessage() {
        return super.getMessage() + " " + errorLevel +errorMethode;
    }
}
