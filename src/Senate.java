/**
 * Created by scofieldservices on 11/15/16.
 */
public class Senate {

    private int numberSeats;
    private String currentMajority;
    private int majoritySeats;
    private boolean pluralityVote;

    public Senate (int n, String m, int s, boolean v){
        numberSeats = n;
        currentMajority = m;
        majoritySeats = s;
        pluralityVote = v;
    }

    public int getNumberSeats(  ){
        return numberSeats;
    }
    public void setNumberSeats(int n){
        if(n >= 100)
        numberSeats = n;
    }


    public String getCurrentMajority(   ){
        return currentMajority;
    }
    public void setCurrentMajority(String m){
        currentMajority = m;
    }


    public int getMajoritySeats (   ){
        return majoritySeats;
    }
    public void setMajoritySeats (int s){
        majoritySeats = s;
    }


    public boolean getPluralityVote (   ){
        return pluralityVote;
    }
    public void setPluralityVote (boolean v){
        pluralityVote = v;
    }

}
