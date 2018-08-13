package designpattern.iteratorandcompositepattern.iteratorpattern;

import java.util.Hashtable;

/**
 * @author Zhang
 * @date 2018/8/13
 * @Description
 */
public class CafeMenuIterator implements Iterator {
    Hashtable menuItems;
    java.util.Iterator iterator;

    public CafeMenuIterator(Hashtable hashtable){
        this.menuItems = hashtable;
        iterator = menuItems.values().iterator();
    }

    public Object next(){
         return iterator.next();

    }

    public boolean hasNext(){
        return iterator.hasNext();
    }
}
