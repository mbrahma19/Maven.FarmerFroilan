package com.zipcodewilmington.froilansfarm.containers;

import java.util.List;

public abstract class Container<T> {
    private List<T> list;

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
