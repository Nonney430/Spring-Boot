package com.training.platform.controllers;
/*
import com.training.platform.entities.User;
import com.training.platform.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
*/
import java.util.List;
import java.util.Optional;

import com.training.platform.entities.User;
import com.training.platform.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("/demo")

public class UserController {

    @Autowired
    private UserService userService;

    //CREATE method new 2 method
    @GetMapping(value = "")
    public List<User> index1() {
        return userService.findAllByQuerytest1();
    }

//    @GetMapping(value = "")
//    public List<User> index2(@RequestParam Integer active, @RequestParam String city , @RequestParam Integer age) {
//        // Change from UserRepository to UserService
//        return userService.findAllByParamsQueryTest1(active, city, age);
//    }

//    @GetMapping(value = "/test1")
//    public List<User> index() {
//        // Change from UserRepository to UserService
//        return userService.findAll();
//    }

//    @GetMapping(value = "/test2/{id}")
//    public Optional<User> index(@PathVariable String id) {
//        // Change from UserRepository to UserService
//        return userService.findById(Integer.parseInt(id));
//    }
//    @GetMapping(value = "/test3")
//    public Page<User> index(@RequestParam String start, @RequestParam String limit, @RequestParam String field) {
//        // Change from UserRepository to UserService
//        return userService.findAllByLimit(Integer.parseInt(start),Integer.parseInt(limit),field);
//    }

//    @GetMapping(value = "/test4")
//    public List<User> index(@RequestParam String city,@RequestParam String active,@RequestParam String age) {
//        // Change from UserRepository to UserService
//        return userService.findByCityAndActiveAndAge(city,Integer.parseInt(active),Integer.parseInt(age));
//    }

//        @GetMapping(value = "/test5")
//        public List<User> index(@RequestParam List<Integer> age) {
//        // Change from UserRepository to UserService
//        return userService.findByAgeIn(age);
//        }

//        @GetMapping(value = "/test6")
//        public List<User> index() {
//            // Change from UserRepository to UserService
//            return userService.findAllByQuery();
//        }

//        @GetMapping(value = "/test7")
//        public List<User> index(@RequestParam String active,@RequestParam String city) {
//            // Change from UserRepository to UserService
//            return userService.findAllByParamsQuery(Integer.parseInt(active),city);
//        }

//            @GetMapping(value = "/test8")
//            public List<User> index() {
//                // Change from UserRepository to UserService
//                return userService.findAllByJpqlQuery();
//            }

//            @GetMapping(value = "/test9")
//            public List<User> index() {
//                // Change from UserRepository to UserService
//                return userService.findAllByJpqlParamsQuery(0, "bangkok");
//            }


}