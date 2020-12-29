package com.sulabh.giflibrary.model;

import java.time.LocalDate;

public class Gif {

    private String name;
    private int categoryId;
    private LocalDate dateUploaded;
    private String userName;
    private boolean fav;

    public Gif(String name, int categoryId, LocalDate dateUploaded, String userName, boolean fav) {
        this.name = name;
        this.categoryId = categoryId;
        this.dateUploaded = dateUploaded;
        this.userName = userName;
        this.fav = fav;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }
}
