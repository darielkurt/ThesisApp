package com.example.thesis04;

public class ExampleItem {
    private int mImageResource;
    private String mText1;
    private String mText2;
    private int mHarvestBtn;
//    private String title;
//    private String genre;
//    private int year;

    public ExampleItem(int imageResource, String text1, String text2, int harvestbutton){
        mImageResource = imageResource;
        mText1 = text1;
        mText2 = text2;
        mHarvestBtn = harvestbutton;
//        this.title = title;
//        this.genre = genre;
//        this.year = year;
    }

    public int getmImageResource() { return mImageResource; }

    public String getmText1() { return mText1; }

    public String getmText2() { return mText2; }

    public int getmHarvestBtn() { return mHarvestBtn; }
}
