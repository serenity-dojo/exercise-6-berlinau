package com.serenitydojo.model;

public class Feeder {
    public String feeds(String animal, boolean isPremium) {
        if(animal == "Cat") {
            if (isPremium) {
                return "Salmon";
            } else {
                return "Tuna";
            }
        } else if (animal == "Dog") {
            return isPremium ? "Deluxe Dog Food" : "Dog Food";
        } else if (animal == "Hamster") {
            return isPremium ? "Lettuce" : "Cabbage";
        } else {
            return "Invalid choice";
        }
    }
}
