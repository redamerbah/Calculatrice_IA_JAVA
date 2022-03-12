package exceptions;

public class AiExceptionForward extends Throwable {
    super(message, errorLevel, ErrorMethode.FORWARD);
}
