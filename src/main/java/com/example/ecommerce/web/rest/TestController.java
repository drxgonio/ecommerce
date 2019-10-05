package com.example.ecommerce.web.rest;

import com.example.ecommerce.domain.Category;
import com.example.ecommerce.service.CategoryService;
import com.example.ecommerce.service.dto.CategoryDTO;
import com.example.ecommerce.service.mapper.CategoryMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {
    @Autowired
    private CategoryService categoryService;

    CategoryMapper categoryMapper=new CategoryMapper();
    @GetMapping("/test")
    public ResponseEntity<List<CategoryDTO>> getCaategory(){
        List<CategoryDTO> list=categoryService.getCategory();


        return  new ResponseEntity<List<CategoryDTO>>(list, HttpStatus.OK);
    }
}
