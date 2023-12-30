package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // Spring이 실행될 때 이 클래스를 메모리에 올림
public class HelloController {

    @GetMapping("hello")  // Get 방식의 /hello 경로로 들어오면 이 메소드를 실행
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello"; // resources/templates/hello.html 파일을 찾아서 렌더링
    }
}
