package com.todo.todoapplication.service

import com.todo.todoapplication.model.Category
import com.todo.todoapplication.repository.CategoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoryService {
    @Autowired
    private lateinit var categoryRepository: CategoryRepository

    fun getCategoryById(categoryId: String): Category? {
        return null
    }

    fun getCategoriesByUserId(userId: String): List<Category> {
        return emptyList()
    }

    fun createCategory(category: Category) {}

    fun deleteCategory(categoryId: String) {}
}