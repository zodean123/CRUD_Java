package com.hello.demo.params;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class Params {

    @GetMapping("/fetchuser")
    public String getUserDetails(
            @RequestParam (name = "firstName") String firstName,
            @RequestParam (name = "lastName", required = false) String lastname
    ){
        return "fetching and returning usernName = " + firstName + " lastName = " + lastname;
    }
}
