import java.util.ArrayList;

/**
 * Created by scofieldservices on 11/15/16.
 */

public class HouseofRepresentatives {

    private String [] officers = new String [4];
    private String [] officials = new String [5];
    private String [] organizations =  new String [5];
    private String yourMom;

    public HouseofRepresentatives (String [] o, String [] f, String [] g, String m) {
        officers = o;
        officials = f;
        organizations = g;
        yourMom = m;
    }

    public String [] getOfficers(  ){
        return officers;
    }
    public void setOfficers (String [] o){
        officers = o;
    }


    public String [] getOfficials (    ){
        return officials;
    }
    public void setOfficials (String [] f){
        officials = f;
    }


    public String [] getOrganizations (    ){
        return organizations;
    }
    public void setOrganizations (String [] g){
        organizations = g;
    }

    public String getYourMom () {
        return yourMom;
    }
    public void setYourMom (String m) {
        if(m.length() >= 8);
        yourMom = m;


    }



}

