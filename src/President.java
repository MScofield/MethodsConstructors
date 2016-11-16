/**
 * Created by scofieldservices on 11/15/16.
 */
public class President {

    private String currentCouncils [] = new String [6];
    private String presidentName;
    private int cabinetSeats;
    private boolean inagurationPending;

    public President (String [] c, String n, int s, boolean p){
        currentCouncils = c;
        presidentName = n;
        cabinetSeats = s;
        inagurationPending = p;

    }

    public String [] getCurrentCouncils (  ){
        return currentCouncils;
    }
    public void setCurrentCouncils (String[] c){
        currentCouncils = c;
    }


    public String getPresidentName (    ){
        return presidentName;
    }
    public void setPresidentName (String p){
        presidentName = p;
    }


    public int getCabinetSeats  (   ){
        return cabinetSeats;
    }
    public void setCabinetSeats (int s){
        if(s <= 23)
        cabinetSeats = s;
    }


    public boolean getInagurationPending (  ){
        return inagurationPending;
    }
    public void setInagurationPending (boolean i){
        inagurationPending = i;
    }

}
