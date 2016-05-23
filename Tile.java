import java.util.ArrayList;

/**
 * Created by Chris on 5/21/2016.
 */
public abstract class Tile {
    protected ArrayList<Entity> entityList;
    public Tile(){
        entityList = new ArrayList<Entity>(3);
    }
    public ArrayList<Entity> getEntityList(){
        return entityList;
    }
    public Entity getEntity(int index) throws ArrayIndexOutOfBoundsException{
        if(index == -1){
            System.out.println("Invalid");
        }
        return entityList.get(index);
    }
    public Entity getEntity(String name){
        return getEntity(getIndex(name));
    }
    public int getIndex(String s){
        int rVal = -1;
        for(int i = 0; i < entityList.size(); i++){
            if(entityList.get(i).getName().equals(s)){
                rVal = i;
                break;
            }
        }
        return rVal;
    }
}
