package com.sulabh.giflibrary.dao;

import com.sulabh.giflibrary.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepo {

    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("cowboy-coder", 1, LocalDate.of(2020,12,26),"Sulabh B",true),
            new Gif("android-explosion", 2 , LocalDate.of(2020,6,20),"Durlabh B",true),
            new Gif("ben-and-mike",1, LocalDate.of(2020,12,26),"Sulabh B",false),
            new Gif("compiler-bot", 3, LocalDate.of(20219,12,26),"Pratibha B",true),
            new Gif("infinite-andrew",2, LocalDate.of(2018,12,26),"Sulabh B",true),
            new Gif("book-dominos",3, LocalDate.of(2020,12,26),"Durlabh B",true)
    );

    public List<Gif> findByCategoryId(int id){
        List<Gif> temp = new ArrayList<>();

        for(Gif gif : ALL_GIFS){
            if(gif.getCategoryId() == id){
                temp.add(gif);
            }
        }
        return temp;
    }

    public Gif findByName(String name){
        for(Gif gif : ALL_GIFS){
            if(gif.getName().equals(name)){
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs(){
        return ALL_GIFS;
    }

}
