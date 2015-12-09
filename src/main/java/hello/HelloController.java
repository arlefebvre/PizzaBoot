package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Arthur on 09/12/2015.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "Salut les jeunes!";
    }
}
