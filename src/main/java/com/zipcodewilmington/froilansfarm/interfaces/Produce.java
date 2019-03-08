package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.crops.Edible;

public interface Produce{

    < T extends Edible> T yield();
}
