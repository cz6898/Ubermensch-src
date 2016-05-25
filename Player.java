import java.util.ArrayList;

/**
 * Created by Chris on 5/21/2016.
 */
public class Player {
    private ArrayList<Item> inventory;
    private Tile currentTile;
    public Player(){
        inventory = new ArrayList<Item>();
    }
    public void addItem(Item i){
        i.setPossession(true);
        inventory.add(i);
    }
    public void removeItem(Item i){
        for(int x = 0; x < inventory.size(); x++){
            if(inventory.get(x).equals(i)){
                i.setPossession(false);
                inventory.remove(x);
                break;
            }
        }
    }
    public ArrayList<Item> getInventory(){
        return inventory;
    }
    public void setCurrentTile(Tile t){
        currentTile = t;
    }
    public Tile getCurrentTile(){
        return currentTile;
    }
}
