package mvc.web.controller;

import mvc.web.entity.User;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(value = "/")
public class HomeController {
    private User user;

    @RequestMapping(method = GET)
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/userDetail", method = GET, produces = MediaType.APPLICATION_XML_VALUE)
    public User getUser(Model model, @RequestParam(value = "userId", required = false) Long userId){
        System.out.println(userId);
        if(user == null){
            user = new User(0l, "aaa", "sd111");
        }
        //model.addAttribute(user);
        return user;
    }

    @RequestMapping(value = "/addUser", method = GET)
    public String addUser(){
        return "addUser";
    }

    @RequestMapping(value = "/addUser", method = POST)
    public String addUser(User user){
        System.out.println(user.getUserName());
        System.out.println(user.getUserId());
        System.out.println("p:" + user.getPassword());
        return "redirect:/user";
    }
}
