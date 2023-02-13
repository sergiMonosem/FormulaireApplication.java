package com.monosem.formulaire.Controller;


import com.monosem.formulaire.Entity.User;
import com.monosem.formulaire.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showIndexFr(Model model){
        User user = new User();
        model.addAttribute("user",user);

        System.out.println("user");
        return "satisfaction";

    }


    @GetMapping("/english")
    public String showIndexEn(Model model){
        User user = new User();
        model.addAttribute("user",user);

        System.out.println("user");
        return "satisfaction_En";

    }


    @GetMapping("/deutsch")
    public String showIndexDe(Model model){
        User user = new User();
        model.addAttribute("user",user);

        System.out.println("user");
        return "satisfaction_De";

    }



    @PostMapping("/save")
    public String saveForm(@ModelAttribute ("user") User user){

        userService.save(user);

        return "thankyou";

    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<User> getAll(Model model){
        List <User> listResponses =userService.listAll();
        model.addAttribute("listResponses",listResponses);

        return listResponses;

    }

    @DeleteMapping("delete")
    @ResponseBody
    public String deleteForm(@RequestParam long id){

        return userService.deleteUser(id);





    }


}
