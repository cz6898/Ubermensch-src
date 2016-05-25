import java.util.ArrayList;

/**
 * Created by Chris on 5/22/2016.
 */
public abstract class Entity {
    protected Dialogue dialogue;
    protected boolean alive, quest, completed;
    protected ArrayList<Boolean> boolArray;
    protected int questStage;
    protected String name;
    public Entity(){
        alive = true;
        quest = false;
        questStage = 0;
        boolArray = new ArrayList<Boolean>();
    }
    public int getQuestStage(){
        return questStage;
    }
    public void advanceQuest(){
        questStage++;
    }
    public void setQuestStage(int a){
        questStage = a;
    }
    protected void println(String s){
        System.out.println(name + ": " + s);
    }
    protected void converse() throws ArrayIndexOutOfBoundsException{
        System.out.println(name + ":" + dialogue.getDialogue(questStage)[0]);
        for (int i = 0; i < dialogue.getOptions(questStage).length; i++) {
            System.out.println(i + ". " + dialogue.getOptions(questStage)[i]);
        }
        boolean temp = false;
        while(!temp) {
            int tempInt = Tester.scan.nextInt();
            for (int i = 0; i < dialogue.getOptions(questStage).length; i++) {
                if (tempInt == i) {
                    System.out.println("You: " + dialogue.getOptions(questStage)[i] +
                            "\n" + name + ": " + dialogue.getDialogue(questStage)[i + 1]);
                    if(tempInt > 0) boolArray.set(questStage, true);
                    else boolArray.set(questStage, false);
                    temp = true;
                }
            }
        }
        questStage++;
    }
    public abstract void conversation();
    public String getName(){
        return name;
    }
    protected void initBoolArray(int size){
        for(int i = 0; i < size; i++){
            boolArray.add(i, false);
        }
    }
}
