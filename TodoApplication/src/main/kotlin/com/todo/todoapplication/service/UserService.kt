package com.todo.todoapplication.service

import com.todo.todoapplication.repository.UserRepository
import org.apache.catalina.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {
    @Autowired
    private lateinit var userRepository: UserRepository

    fun getUserById(userId: String): User? {
        return null
    }

    fun createUser(user: User) {}

    fun deleteUser(userId: String) {}
}
