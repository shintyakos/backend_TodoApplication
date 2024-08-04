package com.todo.todoapplication.repository

import com.todo.todoapplication.model.Reminder
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ReminderRepository : JpaRepository<Reminder, String> {
}