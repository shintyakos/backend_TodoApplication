package com.todo.todoapplication.model

import jakarta.persistence.*
import org.hibernate.annotations.ColumnDefault
import java.time.Instant

@Entity
@Table(name = "Tasks")
open class Task {
    @Id
    @Column(name = "task_id", nullable = false, length = 16)
    open var taskId: String? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    open var user: User? = null

    @Column(name = "title", nullable = false)
    open var title: String? = null

    @Lob
    @Column(name = "description")
    open var description: String? = null

    @Column(name = "due_date")
    open var dueDate: Instant? = null

    @ColumnDefault("'medium'")
    @Lob
    @Column(name = "priority")
    open var priority: String? = null

    @ColumnDefault("'pending'")
    @Lob
    @Column(name = "status")
    open var status: String? = null

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    open var createdAt: Instant? = null

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    open var updatedAt: Instant? = null
}