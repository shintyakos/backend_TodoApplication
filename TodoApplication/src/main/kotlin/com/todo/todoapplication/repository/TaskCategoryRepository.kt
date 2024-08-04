package com.todo.todoapplication.repository

import com.todo.todoapplication.model.TaskCategory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskCategoryRepository : JpaRepository<TaskCategory, String> {
}