package com.example.learnalphabets;

public class itempattern {
    String letter;
    int ImgId;

    public itempattern(String letter, int imgId) {
        this.letter = letter;
        ImgId = imgId;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public int getImgId() {
        return ImgId;
    }

    public void setImgId(int imgId) {
        ImgId = imgId;
    }
}
