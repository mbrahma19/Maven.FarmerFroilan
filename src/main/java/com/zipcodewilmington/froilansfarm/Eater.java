package com.zipcodewilmington.froilansfarm;

public interface Eater<T extends Edible> {

    void eat(T edibleFood);
}
