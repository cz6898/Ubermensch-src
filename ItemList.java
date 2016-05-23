import java.util.ArrayList;

/**
 * Created by Chris on 5/21/2016.
 */
public class ItemList extends ArrayList<Item> {
    public ItemList(){
        super();
        init();
    }
    private void init(){

    }
    public Item getItem(String n){
        Item rItem = this.get(0);
        boolean found = false;
        for(Item i : this){
            if(i.getName().equals(n)){
                rItem = i;
                found = true;
                break;
            }
        }
        if(found)
            return rItem;
        return null;
    }
    public boolean findItemPossession(String s){
        boolean rVal = false;
        for(Item i : this) {
            if (i.getPossession() && i.getName().equals(s)) {
                rVal = true;
                break;
            }
        }
        return rVal;
    }
    public boolean findItemPossession(int id){
        boolean rVal = false;
        for(Item i : this) {
            if (i.getPossession() && i.getId() == id) {
                rVal = true;
                break;
            }
        }
        return rVal;
    }
}
