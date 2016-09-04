package com.example.jg_pc_home.listv_test;

/**
 * Created by JG-PC-HOME on 2016/8/27 0027.
 */
public class fruit {
    private String name;
    private int imageId;
    public fruit(String name,int imageId){
        this.name=name;
        this.imageId=imageId;

    }
    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}
