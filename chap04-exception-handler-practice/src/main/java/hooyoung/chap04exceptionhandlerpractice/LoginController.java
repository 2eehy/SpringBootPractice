package hooyoung.chap04exceptionhandlerpractice;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/main")
    public String toMain(String username,String password){

        System.out.println("입력한 아이디 입니다 : " + username);
        System.out.println("입력한 비밀번호 입니다 : " + password);




        if (!(username.equals("user01") && password.equals("pass01"))) {
            throw new InvalidCredentialsException();

        }

        return "main";



    }

}
