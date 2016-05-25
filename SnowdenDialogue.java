/**
 * Created by Chris on 5/24/2016.
 */
public class SnowdenDialogue extends Dialogue{
    public SnowdenDialogue(){
        super();
    }
    protected void init(){
        String[][] tempOpt = {{}};
        String[][] tempDiag = {{""}};
        addArray(this, tempDiag);
        addArray(options, tempOpt);
    }
}
