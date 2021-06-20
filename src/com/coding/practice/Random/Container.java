package com.coding.practice.Random;

import java.util.ArrayList;

public class Container<T>
{
    private ArrayList<T> ar;

    public Container() {
        this.ar = new ArrayList<>();
    }

        public void addEntity(T elem)
    {
        this.ar.add(elem);
    }

    public  T getEntity(int i)
    {
        return this.ar.get(i);
    }

    public int getContainerSize()
    {
        return this.ar.size();
    }
}
