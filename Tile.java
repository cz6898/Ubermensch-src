import java.util.ArrayList;

/**
 * Created by Chris on 5/21/2016.
 */
public class Tile {
    protected ArrayList<Entity> entityList;
    protected String name;
    public Tile(){
        entityList = new ArrayList<Entity>(3);
    }
    public ArrayList<Entity> getEntityList(){
        return entityList;
    }
    public Entity getEntity(int index) throws ArrayIndexOutOfBoundsException{
        return entityList.get(index);
    }
    public int getIndex(String n){
        for(int i = 0; i < entityList.size(); i++){
            if(entityList.get(i).getName().equals(n))
                return i;
        }
        return -1;
    }
}
