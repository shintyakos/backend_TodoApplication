package com.todo.todoapplication.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import kotlin.test.Test

@SpringBootTest
@AutoConfigureMockMvc
class HelloRestControllerTest {
    @Test
    fun getHelloTest(@Autowired mock: MockMvc) {
        mock.get("/hello").andExpect {
            status { isOk() }
            content { string("Hello World") }
        }.andReturn()
    }
}