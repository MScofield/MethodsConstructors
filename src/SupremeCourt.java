/**
 * Created by scofieldservices on 11/15/16.
 */

public class SupremeCourt {

    private String [] memberNames = new String [9];
    private int novArguments;
    private boolean openSeats;
    private int femaleJustices;

    public SupremeCourt (String [] n, int a, boolean o, int f){
        memberNames = n;
        novArguments = a;
        openSeats   = o;
        femaleJustices = f;
    }

    public String [] getMemberNames (  ){
        return memberNames;
    }
    public void setMemberNames  (String [] n){
        memberNames = n;
    }


    public int  getNovArguments (   ){
        return novArguments;
    }
    public void setNovArguments (int a){
        if(a >= 8)
        novArguments = a;
    }


    public boolean getOpenSeats (   ){
        return openSeats;
    }
    public void setOpenSeats    (boolean o){
        openSeats = o;
    }


    public int getFemaleJustices    (   ){
        return femaleJustices;
    }
    public void setFemaleJustices   (int f){
        femaleJustices = f;
    }

}

