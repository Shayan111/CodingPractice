package com.coding.practice.Random;

import java.util.Iterator;
import java.util.List;

public class ContainerIterator<T> implements Iterator<T>
{
    private final Container<T> container;
    private int i = 0;

    public ContainerIterator(Container<T> container) {
        this.container = container;
    }

    @Override
    public boolean hasNext() {
        return i < this.container.getContainerSize();
    }

    @Override
    public T next() {
        i++;
        return this.container.getEntity(i);
    }
}
