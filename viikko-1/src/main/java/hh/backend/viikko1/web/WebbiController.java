package hh.backend.viikko1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebbiController {

    @RequestMapping("/index") 
    @ResponseBody
    public String returnMessage() {
        return "This is the main page";
    }
    
    @RequestMapping("/contact") 
    @ResponseBody
    public String returnMessage2() {
        return "This is the contact page";
    }

    @RequestMapping("/hello")
    @ResponseBody 
    public String returnMessage3(@RequestParam String location, @RequestParam String name) {
        return "Welcome to the " + location + " " + name + "!";
    }
}