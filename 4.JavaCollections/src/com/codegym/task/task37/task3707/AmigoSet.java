package com.codegym.task.task37.task3707;

import java.io.Serializable;
import java.util.*;

public class AmigoSet<E> extends AbstractSet<E> implements Serializable, Cloneable, Set<E> {
    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;

    public AmigoSet() {
        map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection) {
        map = new HashMap<>(Math.max((int) (collection.size() / .75f) + 1, 16));
        for (E c : collection)
            map.put(c, PRESENT);
    }

    @Override
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public Object clone() {
        AmigoSet<E> clone;
        try {
            clone = (AmigoSet<E>)super.clone();
            clone.map = (HashMap<E,Object>)map.clone();
        } catch (Exception e) {
            throw new InternalError(e);
        }
        return clone;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean remove(Object o) {
        boolean flag = false;
        for (Map.Entry<E, Object> entry : map.entrySet()) {
            if (entry.getValue().equals(o)) {
                map.remove(entry.getKey(), o);
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

}
