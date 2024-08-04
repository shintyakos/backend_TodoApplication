package com.todo.todoapplication.service

import com.todo.todoapplication.model.Task
import com.todo.todoapplication.repository.TaskRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TaskService {
    @Autowired
    private lateinit var taskRepository: TaskRepository

    fun getTaskById(taskId: String): Task? {
        return null
    }

    fun getTasksByUserId(userId: String): List<Task> {
        return emptyList()
    }

    fun createTask(task: Task) {}

    fun deleteTask(taskId: String) {}
}