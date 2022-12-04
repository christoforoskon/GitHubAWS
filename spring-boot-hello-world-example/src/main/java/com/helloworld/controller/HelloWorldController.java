package com.helloworld.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
@RequestMapping("/")
public String hello() 
{
return "<h1> Congratulations.aaaaaaaaaaa You have successfully deployed the sasdfasdfample Spring Boot Applic ation. </h1>";
}
}
