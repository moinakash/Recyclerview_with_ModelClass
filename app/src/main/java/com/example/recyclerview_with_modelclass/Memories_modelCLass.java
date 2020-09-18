package com.example.recyclerview_with_modelclass;

public class Memories_modelCLass {

    private int Profile_img;
    private String Profile_Name;
    private String Memories_Title;
    private String Memories_Details;
    private int img1;
    private int img2;
    private int img3;
    private int img4;
    private String Count_likes;
    private String Count_comments;
    private String Count_shares;


    public Memories_modelCLass(int profile_img, String profile_Name, String memories_Title, String memories_Details,
                               int img1, int img2, int img3, int img4,
                               String count_likes, String count_comments, String count_shares) {


        this.Profile_img = profile_img;
        this.Profile_Name = profile_Name;
        this.Memories_Title = memories_Title;
        this.Memories_Details = memories_Details;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.Count_likes = count_likes;
        this.Count_comments = count_comments;
        this.Count_shares = count_shares;

    }

    public int getProfile_img() {
        return Profile_img;
    }

    public String getProfile_Name() {
        return Profile_Name;
    }

    public String getMemories_Title() {
        return Memories_Title;
    }

    public String getMemories_Details() {
        return Memories_Details;
    }

    public int getImg1() {
        return img1;
    }

    public int getImg2() {
        return img2;
    }

    public int getImg3() {
        return img3;
    }

    public int getImg4() {
        return img4;
    }

    public String getCount_likes() {
        return Count_likes;
    }

    public String getCount_comments() {
        return Count_comments;
    }

    public String getCount_shares() {
        return Count_shares;
    }



}
