package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hello/{name}")
    public String sayHello(@PathVariable String name) {
        return ("Hello " + name + ", SpringBoot on Wildfly!");
    }
}
