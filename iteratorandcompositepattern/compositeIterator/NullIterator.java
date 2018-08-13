package designpattern.iteratorandcompositepattern.compositeIterator;

import java.util.Iterator;

/**
 * @author Zhang
 * @date 2018/8/13
 * @Description
 */
public class NullIterator implements Iterator{
    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
