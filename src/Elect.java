/**
 * Created by scofieldservices on 11/15/16.
 */
public class Elect {

    private String presElect;
    private String repChair;
    private String cheifStrat;
    private double inaugDate;

    public Elect
    (

            String e,
            String r,
            String c,
            double d
    ){
        presElect = e;
        repChair =  r;
        cheifStrat = c;
        inaugDate  = d;

    }


    public String getPresElect(){
        return presElect;
    }
    public void setPresElect(String e){
        presElect = e;
    }


    public String getRepChair(){
        return repChair;
    }
    public void setRepChair (String r){
        repChair = r;
    }


    public String getCheifStrat (){
        return cheifStrat;
    }
    public void setCheifStrat (String c){
        cheifStrat = c;
    }


    public double getInaugDate (){
        return inaugDate;
    }
    public void setInaugDate (double d){
        {if (d >= 1.2)
        inaugDate = d;
    }}

}
