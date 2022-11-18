package com.example.springboot1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {


    @RequestMapping(method = RequestMethod.GET, path = "/add/{number}")
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number+ " plus one is "+(number+1)+ "!";
    }

    @GetMapping(path="/subtract/{num1}/from/{num2}")
    @ResponseBody
    public int subtractTwoNumbers(@PathVariable int num1, @PathVariable int num2){
        return (num1-num2);

    }
    @GetMapping(path="/multiply/{numb1}/{numb2}")
    @ResponseBody
    public int multiplyTwoNumbers(@PathVariable int numb1, @PathVariable int numb2){
        return numb1*numb2;

    }
}
