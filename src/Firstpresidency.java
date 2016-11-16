/**
 * Created by scofieldservices on 11/15/16.
 */

public class Firstpresidency {

    private String [] cabinetMembers = new String [4];
    private String firstPres;
    private double firstCabMeeting;
    private String absenTees;

    public Firstpresidency (String [] m, String p, double c, String a){
        cabinetMembers = m;
        firstPres = p;
        firstCabMeeting = c;
        absenTees = a;
    }

    public String [] getCabinetMembers(){
        return cabinetMembers;
    }
    public void setCabinetMembers(String [] m){
        cabinetMembers = m;
    }


    public String getFirstPres(){
        return firstPres;
    }
    public void setFirstPres(String p){
        firstPres = p;
    }


    public double getFirstCabMeeting(){
        return firstCabMeeting;
    }
    public void setFirstCabMeeting(double c){
        {if (c >= 1793)
        firstCabMeeting = c;
    }}


    public String getAbsenTees (){
        return absenTees;
    }
    public void setAbsenTees (String a) {
        absenTees = a;
    }
}
