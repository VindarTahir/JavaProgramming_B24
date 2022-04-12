package personal;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    String productOwner;
    String scrumMaster;
    int sprintNumber;
    ArrayList<Developer> allDevelopers;

    static String companyName;
    static String ceo;

    public ScrumTeam(int sprintNumber){
        this.sprintNumber = sprintNumber;
        allDevelopers = new ArrayList<>();
    }

    public ScrumTeam(String productOwner, String scrumMaster, int sprintNumber, ArrayList<Developer> allDevelopers) {
        this.productOwner = productOwner;
        this.scrumMaster = scrumMaster;
        this.sprintNumber = sprintNumber;
        this.allDevelopers = allDevelopers;
        this.allDevelopers.addAll(allDevelopers);
    }

    public void addDeveloper(Developer developer){
        allDevelopers.add(developer);
    }

    public void addDeveloper(Developer [] developers){
        allDevelopers.addAll(Arrays.asList(developers));
    }
}
