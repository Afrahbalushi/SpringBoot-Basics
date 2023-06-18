package com.codeline.technoapi.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class HomeController {

    @GetMapping(value = "home")
    public String homePage(@RequestParam(name = "name") String userName, @RequestParam(name = "id") Integer userId){
        return "Welcome " + userName + " , Id is " + Integer.toString(userId);
    }

    @PostMapping(value = "homeTwo")
    public String homePageTwo(@RequestParam(name = "name") String userName, @RequestParam(name = "id") Integer userId){
        return "Welcome " + userName + " , Id is " + Integer.toString(userId);
    }

    @GetMapping(value = "homeThree/{name}/{id}")
    public String homePageThree(@PathVariable(name = "name") String userName,
                                @PathVariable(name = "id") Integer userId,
                                @RequestParam(name = "status") boolean status){
        return "Welcome " + userName + " , Id is " + Integer.toString(userId) + " , Status is "+status;
    }
}
