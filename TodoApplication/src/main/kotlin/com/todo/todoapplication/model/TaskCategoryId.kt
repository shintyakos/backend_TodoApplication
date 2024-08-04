package com.todo.todoapplication.model

import jakarta.persistence.Column
import jakarta.persistence.Embeddable
import org.hibernate.Hibernate
import java.io.Serializable
import java.util.*

@Embeddable
open class TaskCategoryId : Serializable {
    @Column(name = "task_id", nullable = false, length = 16)
    open var taskId: String? = null

    @Column(name = "category_id", nullable = false, length = 16)
    open var categoryId: String? = null
    override fun hashCode(): Int = Objects.hash(taskId, categoryId)
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false

        other as TaskCategoryId

        return taskId == other.taskId &&
                categoryId == other.categoryId
    }

    companion object {
        private const val serialVersionUID = -1900982016536069865L
    }
}