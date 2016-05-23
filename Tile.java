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
        return entityList.get(index);
    }
}
