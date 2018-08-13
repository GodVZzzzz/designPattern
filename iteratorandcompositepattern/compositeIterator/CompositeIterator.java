package designpattern.iteratorandcompositepattern.compositeIterator;

import designpattern.iteratorandcompositepattern.compositepattern.Menu;
import designpattern.iteratorandcompositepattern.compositepattern.MenuComponent;


import java.util.Iterator;
import java.util.Stack;

/**
 * @author Zhang
 * @date 2018/8/13
 * @Description
 */
public class CompositeIterator implements Iterator {

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if(menuComponent instanceof Menu){
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        }else {
            return null;
        }
    }

    public boolean hasNext(){
        if(stack.empty())
            return false;
        else {
            Iterator iterator = (Iterator) stack.peek();
            if(! iterator.hasNext()){
                stack.pop();
                return hasNext();
            }
            else
                return true;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
