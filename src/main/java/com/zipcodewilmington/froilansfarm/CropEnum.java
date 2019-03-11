package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.crops.WatermelonPlant;

import java.util.function.Supplier;

public enum CropEnum {

    WATERMELONPLANT(WatermelonPlant::new),
    CORNSTALK(CornStalk::new),
    TOMATOPLANT(TomatoPlant::new);

    private final Supplier<Crop> supplier;

    CropEnum(Supplier<Crop> supplier) {
        this.supplier = supplier;
    }

    public static CropEnum getValueOf(String userInput) {
        userInput = userInput.toUpperCase();
        try {
            return valueOf(userInput);
        } catch (IllegalArgumentException iae) {
            return valueOf(userInput.replaceAll(" ", "_"));
        }
    }

    public Crop create() {
        return supplier.get();
    }
}
