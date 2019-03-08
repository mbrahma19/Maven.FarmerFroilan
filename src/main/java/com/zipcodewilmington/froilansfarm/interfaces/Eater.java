package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.crops.Edible;

public interface Eater<T extends Edible> {

    void eat(T edibleFood);
}
