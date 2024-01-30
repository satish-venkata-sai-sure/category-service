package com.onlineshop.categoryservice.service;

import java.util.List;

import com.onlineshop.categoryservice.model.Category;

public interface CategoryService {
    List<Category> getAllCategories();

    Category getCategoryById(Long categoryId);

    Category addCategory(Category category);

    Category updateCategory(Long categoryId, Category category);

    void deleteCategory(Long categoryId);
}