package com.exam.controller;

import com.exam.entity.exam.Category;
import com.exam.service.categoryService.ICategoryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
@Api( tags = "Clients")
public class CategoryController {

    @Autowired
    private ICategoryService iCategoryService;

    //add category
    @PostMapping("/")
    @ApiOperation(value = "This method is used to get the clients.")
    public ResponseEntity<Category> addCategory(@RequestBody Category category) {
        Category category1 = this.iCategoryService.addCategory(category);
        return ResponseEntity.ok(category1);
    }

    //get category
    @GetMapping("/{categoryId}")
    public Category getCategory(@PathVariable("categoryId") Long categoryId) {
        return this.iCategoryService.getCategory(categoryId);
    }

    //get all categories
    @GetMapping("/")
    public ResponseEntity<?> getCategories() {
        return ResponseEntity.ok(this.iCategoryService.getCategories());
    }

    //update category
    @PutMapping("/")
    public Category updateCategory(@RequestBody Category category) {
        return this.iCategoryService.updateCategory(category);
    }

    //delete category
    @DeleteMapping("/{categoryId}")
    public void deleteCategory(@PathVariable("categoryId") Long categoryId) {
        this.iCategoryService.deleteCategory(categoryId);
    }

}
