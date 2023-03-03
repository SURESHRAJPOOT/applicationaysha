package com.example.myapplication_aysha;

public class Birds_type_model {
    int img;
    String name,scname;

    public Birds_type_model(int img,String name,String scname) {
        this.img = img;
        this.name=name;
        this.scname=scname;
    }

    public String getScname() {
        return scname;
    }

    public void setScname(String scname) {
        this.scname = scname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
