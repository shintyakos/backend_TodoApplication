package com.todo.todoapplication.model

import jakarta.persistence.*
import org.hibernate.annotations.ColumnDefault
import java.time.Instant

@Entity
@Table(name = "Notifications")
open class Notification {
    @Id
    @Column(name = "notification_id", nullable = false, length = 16)
    open var notificationId: String? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    open var user: User? = null

    @Lob
    @Column(name = "type", nullable = false)
    open var type: String? = null

    @Lob
    @Column(name = "message", nullable = false)
    open var message: String? = null

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "sent_at")
    open var sentAt: Instant? = null

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    open var createdAt: Instant? = null

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    open var updatedAt: Instant? = null
}