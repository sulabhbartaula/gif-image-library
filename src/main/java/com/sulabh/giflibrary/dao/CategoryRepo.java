package com.sulabh.giflibrary.dao;

import com.sulabh.giflibrary.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepo {

    private static final List<Category> ALL_CATEGORY = Arrays.asList(
            new Category(1,"Technology"),
            new Category(2,"Human"),
            new Category(3,"Destruction")
            );

    public Category findById(int id){
        for(Category category : ALL_CATEGORY){
            if(category.getId() == id){
                return category;
            }
        }
        return null;
    }

    public List<Category> getAllCategory(){
        return ALL_CATEGORY;
    }
}
