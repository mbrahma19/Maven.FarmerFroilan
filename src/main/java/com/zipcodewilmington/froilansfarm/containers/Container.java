package com.zipcodewilmington.froilansfarm.containers;

import java.util.ArrayList;
import java.util.List;

public abstract class Container<T> {
    private List<T> list;

    public Container(){
        this.list = new ArrayList<T>();
    }

    public Container(List<T> object){
        this.list = new ArrayList<T>();
    }

    public void add(T object){
        list.add(object);
    }

    public void remove(T object){
        list.remove(object);
    }

    public List<T> getList(){
        return list;
    }

    public Integer size(){
        return list.size();
    }
}
