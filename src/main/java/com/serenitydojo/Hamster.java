package com.serenitydojo;

public class Hamster extends Pet{
    private String wheel;
    private String favoriteGame;

    public Hamster(String hazel, int age, String wheel) {
        super(hazel, age);
        this.wheel = wheel;
        this.favoriteGame = favoriteGame;
    }

    @Override
    public String play() {
        return "runs in wheel";
    }
}
