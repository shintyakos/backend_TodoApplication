package com.todo.todoapplication.model

import jakarta.persistence.*
import org.hibernate.annotations.ColumnDefault
import java.time.Instant

@Entity
@Table(name = "Reminders")
open class Reminder {
    @Id
    @Column(name = "reminder_id", nullable = false, length = 16)
    open var reminderId: String? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "task_id", nullable = false)
    open var task: com.todo.todoapplication.model.Task? = null

    @Column(name = "remind_at", nullable = false)
    open var remindAt: Instant? = null

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    open var createdAt: Instant? = null

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    open var updatedAt: Instant? = null
}