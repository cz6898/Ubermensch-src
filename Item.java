/**
 * Created by Chris on 5/21/2016.
 */
public abstract class Item{
    protected int id;
    protected String name;
    protected boolean possession;
    public Item(int i, String n){
        id = i;
        name = n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public boolean getPossession(){
        return possession;
    }
    public void setPossession(boolean b){
        possession = b;
    }
    public boolean equals(Item i){
        if(id == i.getId())
            return true;
        return false;
    }
}
