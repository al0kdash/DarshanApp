package com.example.aloknath.darshanapp;

public class Data {
    private int imageid;
    private int imagetitle;
    private int imagebody;

    public Data(int imageid, int imagetitle, int imagebody){
        this.imagebody = imagebody;
        this.imageid = imageid;
        this.imagetitle = imagetitle;
    }

    public Data(int imagetitle, int imagebody){
        this.imagetitle = imagetitle;
        this.imagebody = imagebody;
    }

    public int getImagetitle(){return imagetitle;}
    public int getImagebody(){return imagebody;}
    public int getImageid(){return imageid;}
}
