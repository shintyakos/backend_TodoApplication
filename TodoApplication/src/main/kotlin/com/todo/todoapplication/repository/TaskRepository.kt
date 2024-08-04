package com.todo.todoapplication.repository

import com.todo.todoapplication.model.Task
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskRepository : JpaRepository<Task, String> {
}