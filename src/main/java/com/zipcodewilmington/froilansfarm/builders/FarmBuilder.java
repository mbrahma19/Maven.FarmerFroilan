package com.zipcodewilmington.froilansfarm.builders;

import com.zipcodewilmington.froilansfarm.CropEnum;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.containers.ChickenCoop;
import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.containers.Stable;
import com.zipcodewilmington.froilansfarm.mammals.Chicken;
import com.zipcodewilmington.froilansfarm.mammals.Horse;

import java.util.stream.Stream;

public class FarmBuilder {

    private final static FarmBuilder farmBuilder = new FarmBuilder();
    private Farm farm;

    private FarmBuilder() {
        farm = Farm.getFarm();
    }

    public static FarmBuilder getFarmBuilder() {
        return farmBuilder;
    }

    public FarmBuilder addStable(Integer numberOfHorses) {
        Stream.generate(Stable::new).limit(1).forEach(stable -> {
            farm.addStable(stable);
            Stream.generate(Horse::new).limit(numberOfHorses).forEach(horse -> {
                stable.add(horse);
            });
        });
        return this;
    }

    public FarmBuilder addChickenCoops(Integer numberOfChickens) {
        Stream.generate(ChickenCoop::new).limit(1).forEach(chickenCoop -> {
            farm.addChickenCoop(chickenCoop);
            Stream.generate(Chicken::new).limit(numberOfChickens).forEach(chicken -> {
                chickenCoop.add(chicken);
            });
        });
        return this;
    }

    public FarmBuilder addCropRows(String cropToAdd, Integer maxNumber) {
        CropEnum enumeration = CropEnum.getValueOf(cropToAdd);
        Stream.generate(CropRow::new).limit(1).forEach(cropRow -> {
            farm.getCropField().add(cropRow);
            Stream.generate(enumeration::create).limit(maxNumber).forEach(crop -> {
                cropRow.add(crop);
            });
        });
        return this;
    }

    public Farm getFroilanFarm() {
        FarmBuilder farmBuilder = new FarmBuilder();
        farmBuilder.addCropRows("cornstalk", 1)
                .addCropRows("tomatoplant", 1)
                .addCropRows("watermelonplant", 1)
                .addChickenCoops(4).addChickenCoops(5).addChickenCoops(3).addChickenCoops(3)
                .addStable(2).addStable(4).addStable(4);
        return Farm.getFarm();
    }

}
