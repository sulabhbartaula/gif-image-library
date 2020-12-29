package com.sulabh.giflibrary.controller;

import com.sulabh.giflibrary.dao.CategoryRepo;
import com.sulabh.giflibrary.dao.GifRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

    private CategoryRepo categoryRepo;
    private GifRepo gifRepo;

    @Autowired
    public CategoryController(CategoryRepo categoryRepo, GifRepo gifRepo) {
        this.categoryRepo = categoryRepo;
        this.gifRepo = gifRepo;
    }

    @RequestMapping("/categories")
    public String listAllCategories(ModelMap modelMap){
        modelMap.put("categories",categoryRepo.getAllCategory());
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String getCategoryById(@PathVariable int id, ModelMap modelMap){
        modelMap.put("category",categoryRepo.findById(id));
        modelMap.put("gifs",gifRepo.findByCategoryId(id));
        return "category";
    }
}
