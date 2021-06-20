package com.coding.practice.Random;

import java.util.Iterator;
import java.util.List;

public class ContainerIterator<T> implements Iterator<T>
{
    private Container<T> container;
    private int i;

    public ContainerIterator(Container<T> container) {
        this.container = container;
        i = this.container.getContainerSize() - 1;
    }

    @Override
    public boolean hasNext() {
        return i >= 0;
    }

    @Override
    public T next() {
        T data = this.container.getEntity(i);
        i--;
        return data;
    }
}
