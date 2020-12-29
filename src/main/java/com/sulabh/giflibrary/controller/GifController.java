package com.sulabh.giflibrary.controller;

import com.sulabh.giflibrary.dao.GifRepo;
import com.sulabh.giflibrary.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Controller
public class GifController {

    private GifRepo gifRepo;

    @Autowired
    public GifController(GifRepo gifRepo) {
        this.gifRepo = gifRepo;
    }

    @GetMapping("/")
    public String listGifs(ModelMap modelMap){
        List<Gif> allGifs = gifRepo.getAllGifs();
        modelMap.put("gifs",allGifs);
        return "home";
    }

    @GetMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){
        Gif gif = gifRepo.findByName(name);
        modelMap.put("gif",gif);
        return "gif-details";
    }
}
