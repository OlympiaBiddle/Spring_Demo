package com.perScholas.models;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class Usercontroller {

   @PostMapping("/users")
   public void printData(@RequestBody User user) {
       System.out.println("Printing the user data:"+user);
   }
}