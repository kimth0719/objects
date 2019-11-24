package com.theater.step11_1;

import java.util.Collection;
import java.util.Set;

public class InstrumentedHashSet<E> {

    private int addCount = 0;
    private Set<E> set;

    public boolean add(E e) {
        addCount++;
        return set.add(e);
    }

    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return set.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
