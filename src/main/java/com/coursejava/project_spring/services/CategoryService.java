package com.coursejava.project_spring.services;

import com.coursejava.project_spring.entities.Category;
import com.coursejava.project_spring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll () {
        return categoryRepository.findAll();
    }
    public Category findById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }
}
