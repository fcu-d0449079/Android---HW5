package com.example.zhuang.myapplication;

/**
 * Created by Zhuang on 2017/4/27.
 */

public class AlbumItem {
    String name;
    int imgid;
    String score;
    String name1;
    int imgid1;
    String score1;

    AlbumItem(String name, int imgid , String score,String name1, int imgid1 , String score1){
        this.score = score;
        this.name = name;
        this.imgid = imgid;
        this.score1 = score1;
        this.imgid1 = imgid1;
        this.name1 = name1;
    }
}
