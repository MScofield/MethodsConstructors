public class Main {

    public static void main(String[] args) {

        Constitution C = new Constitution ();

        //US constitution info
            C.setArticles (7);
            C.setAmmendments (27);
            C.setAuthors ("Alexander Hamilton, John Jay");
            C.setStates (50);
            C.setRatificationDate (1788);

        Senate S = new Senate ();

        // US Senate info
            S.setNumberSeats (100);
            S.setCurrentMajority ("Republican");
            S.setMajoritySeats (54);
            S.setPluralityVote(true);

        HouseofRepresentatives H = new HouseofRepresentatives();

        // House officers:
            String [] officers = new String [4];
                officers [0] = "Chaplain";
                officers [1] = "CAO";
                officers [2] = "Clerk";
                officers [3] = "Sergeant";
            H.setOfficers(officers);

        // House officials:
            String [] officials = new String [5];
                officials [0] = "General Counsel";
                officials [1] = "Historian";
                officials [2] = "General";
                officials [3] = "Parlimentarian";
            H.setOfficials(officials);

        // House organizations:
            String [] organizations = new String [5];
                organizations [0] = "Congressional Ethics";
                organizations [1] = "Interparliamentary Affairs";
                organizations [2] = "Revision Council";
                organizations [3] = "Counsel";
            H.setOrganizations(organizations);

            H.yourMom ("margaret");

        SupremeCourt T = new SupremeCourt();

        // Current Residing Supreme Court Members
            String [] memberNames = new String[9];
                memberNames [0] = "Roberts";
                memberNames [1] = "Thomas";
                memberNames [2] = "Breyer";
                memberNames [3] = "Sotomayor";
                memberNames [4] = "Scalia";
                memberNames [5] = "Kennedy";
                memberNames [6] = "Ginsburg";
                memberNames [7] = "Alito";
                memberNames [8] = "Kagan";
            T.setMemberNames(memberNames);

            T.setFemaleJustices(4);
            T.setOpenSeats(true);
            T.setNovArguments(8);

        President P = new President();

            P.setCabinetSeats (23);
            P.setInagurationPending (true);
            P.setPresidentName ("Barack Hussein Obama");
            String [] currentCouncils = new String [6];
                currentCouncils [0] = "Economic";
                currentCouncils [1] = "Environmental";
                currentCouncils [2] = "Administrative";
                currentCouncils [3] = "Drug";
                currentCouncils [4] = "Trade";
                currentCouncils [5]  = "VP";
            P.setCurrentCouncils(currentCouncils);

        Elect E = new Elect();

            E.setCheifStrat ("Reince Priebus");
            E.setRepChair ("Steve Bannon");
            E.setInaugDate (01.20);
            E.setPresElect ("Donald John Trump");

        Firstpresidency F = new Firstpresidency();

            F.setAbsenTees ("John Adams");
            F.setFirstPres ("George Washington");
            F.setFirstCabMeeting (2.1793);
            String [] cabinetMembers = new String [4];
                cabinetMembers [0] = "Thomas Jefferson";
                cabinetMembers [1] = "Alexander Hamilton";
                cabinetMembers [2] = "Henry Knox";
                cabinetMembers [3] = "Edmund Randolph";
            F.setCabinetMembers(cabinetMembers);
    }
}
