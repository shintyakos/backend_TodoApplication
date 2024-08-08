package com.todo.todoapplication.service

import com.todo.todoapplication.model.User
import com.todo.todoapplication.repository.UserRepository
import com.todo.todoapplication.util.ConvertHelper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

@Service
class UserService {
    @Autowired
    private lateinit var userRepository: UserRepository

    fun getUserById(userId: String): User? {
        return null
    }

    fun createUser(
        email: String,
        password: String,
        name: String,
        profileImageUrl: String
    ) {
        val enc = BCryptPasswordEncoder().encode(password)
        val user = User().apply {
            this.userId = ConvertHelper.uuidToBytes(UUID.randomUUID())
            this.email = email
            this.password = enc
            this.name = name
            this.profileImageUrl = profileImageUrl
            this.createdAt = LocalDateTime.now()
            this.updatedAt = LocalDateTime.now()
        }
        userRepository.save(user)
    }

    fun deleteUser(userId: String) {}
}
