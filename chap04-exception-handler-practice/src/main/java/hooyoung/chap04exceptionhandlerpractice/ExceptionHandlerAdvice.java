package hooyoung.chap04exceptionhandlerpractice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(InvalidCredentialsException.class)
    public String InvalidCredentialsExceptionHandler(InvalidCredentialsException exception){
        System.out.println("로그인 실패");

        return "error/401";
    }
}
