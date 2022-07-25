package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping(value = "/hello")
    public String helloToUser(@RequestParam(value = "name" ,defaultValue = "User")String name, ModelMap modelMap) {
        modelMap.addAttribute("Greetings", "Hello " + name);
        return "hey";
    }
}
