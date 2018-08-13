package designpattern.iteratorandcompositepattern.iteratorpattern;

import java.util.ArrayList;

/**
 * @author Zhang
 * @date 2018/8/13
 * @Description
 */
public class PancakeHouseIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(ArrayList items){
        this.items = items;
    }

    public Object next(){
        MenuItem menuItem = items.get(position);
        position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.size() || items.get(position)== null)
            return false;
        else
            return true;
    }
}
