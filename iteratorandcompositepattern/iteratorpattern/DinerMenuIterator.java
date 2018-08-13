package designpattern.iteratorandcompositepattern.iteratorpattern;

/**
 * @author Zhang
 * @date 2018/8/13
 * @Description
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    public Object next(){
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null)
            return false;
        else
            return true;
    }
}
