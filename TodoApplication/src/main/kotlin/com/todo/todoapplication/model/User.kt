package com.todo.todoapplication.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "Users")
open class User {
    @Id
    @Column(name = "user_id", nullable = false)
    open var userId: ByteArray? = null

    @Column(name = "name", nullable = false)
    open var name: String? = null

    @Column(name = "password", nullable = false)
    open var password: String? = null

    @Column(name = "email", nullable = false)
    open var email: String? = null

    @Column(name = "profile_image_url", nullable = false)
    open var profileImageUrl: String? = null

    @Column(name = "created_at")
    open var createdAt: LocalDateTime? = null

    @Column(name = "updated_at")
    open var updatedAt: LocalDateTime? = null
}