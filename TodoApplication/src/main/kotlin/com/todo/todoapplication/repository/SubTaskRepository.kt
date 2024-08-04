package com.todo.todoapplication.repository

import com.todo.todoapplication.model.Subtask
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SubTaskRepository : JpaRepository<Subtask, String> {
}