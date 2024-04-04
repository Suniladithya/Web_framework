package com.example.demo.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.message.response.Response;

@RestController
public class Message 
{
    @GetMapping("/welcome")
    public Response message() 
    {
        Response res=new Response(1,"Sunil","Adithya");
        return res;
    }
    
}
