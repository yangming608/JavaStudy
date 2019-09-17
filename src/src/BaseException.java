/*
 * 软件版权: 恒生电子股份有限公司
 */
package src;

/**
 * 功能说明:
 *
 * @author yangming28071
 */
/*在一个大型项目中，可以自定义新的异常类型，但是，保持一个合理的异常继承体系是非常重要的。
一个常见的做法是自定义一个BaseException作为“根异常”，然后，派生出各种业务类型的异常。
BaseException需要从一个适合的Exception派生，通常建议从RuntimeException派生*/
public class BaseException extends RuntimeException {
    public BaseException() {
        super();
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public static void main(String[] args) {
        String s = "abc123";
        if (!s.equals("abc")){
            throw new UserNotFoundError("UserNotFoundError");
        }
    }
}

class UserNotFoundError extends BaseException{
    public UserNotFoundError(String message) {
        super(message);
    }
}


