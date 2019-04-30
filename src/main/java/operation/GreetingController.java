package operation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting() {
        
        return "greeting";
    }

    @PostMapping("/form")
    public String processForm(Form form) {
        return "greeting";
    }    
    
}