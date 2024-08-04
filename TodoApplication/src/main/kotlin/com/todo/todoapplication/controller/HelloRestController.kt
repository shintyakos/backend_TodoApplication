package com.todo.todoapplication.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloRestController {
    @GetMapping("/hello")
    fun getHelloWorld(): String {
        return "Hello World"
    }
}
