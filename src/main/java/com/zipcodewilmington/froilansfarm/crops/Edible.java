package com.zipcodewilmington.froilansfarm.crops;

public abstract class Edible {

    private Integer calories;

    public Edible(Integer calorieCount){
        calories = calorieCount;
    }

    public Integer getCalories() {
        return calories;
    }

//    public void setCalories(Integer calories) {
//        this.calories = calories;
//    }

}
