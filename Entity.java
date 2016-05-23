/**
 * Created by Chris on 5/22/2016.
 */
public abstract class Entity {
    protected Dialogue dialogue;
    protected boolean alive, quest;
    protected int questStage;
    protected String name;
    public Entity(){
        alive = true;
        quest = false;
        questStage = 0;
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
}
