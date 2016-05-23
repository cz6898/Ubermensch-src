import java.util.ArrayList;

/**
 * Created by Chris on 5/22/2016.
 */
public abstract class Dialogue extends ArrayList<String[]> {
    protected ArrayList<String[]> options;
    public Dialogue(){
        super();
        init();
    }
    protected abstract void init();
    public String[] getDialogue(int index) throws ArrayIndexOutOfBoundsException{
        return this.get(index);
    }
    public String[] getOptions(int index) throws ArrayIndexOutOfBoundsException{
        return options.get(index);
    }
}
