package com.example.ecommerce.service;

import com.example.ecommerce.domain.Category_Sub;
import com.example.ecommerce.repository.Category_SubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Category_SubService {
    @Autowired
    private Category_SubRepository category_subRepository;
    public List<Category_Sub> findAllByCategory(Long idCategory){

        return category_subRepository.findAllByCategoryById(idCategory);
    }
}
