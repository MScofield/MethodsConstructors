/**
 * Created by scofieldservices on 11/14/16.
 */

public class Constitution {

    private int ratificationDate;
    private int states;
    private String authors;
    private int articles;
    private int ammendments;
    private boolean passed;

    Constitution (
            int r,
            int s,
            String a,
            int c,
            int m,
            boolean p
    ) {

        ratificationDate = r;
        states = s;
        authors = a;
        articles = c;
        ammendments = m;
        passed = p;
    }


    public int getRatificationDate() {
        return ratificationDate;
    }

    public void setRatificationDate(int r) {
        ratificationDate = r;
    }



    public int getStates() {
        return states;
    }

    public void setStates(int s) {
        states = s;
    }



    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String a) {
        authors = a;
    }



    public int getArticles() {
        return articles;
    }

    public void setArticles(int c) {
        articles = c;
    }



    public int getAmmendments() {
        return ammendments;
    }

    public void setAmmendments(int m) {
        {if (m >= 27)
        ammendments = m;
    }}



    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean p) {
        passed = p;
    }
}