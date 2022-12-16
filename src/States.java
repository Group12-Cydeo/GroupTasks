package day39_EncapsulationAndInheritancePractice;

public class States {
    private String name,abbreviation,politicalParty,governor,senator;
    private int population;
    private double stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public String getSenator() {
        return senator;
    }

    public int getPopulation() {
        return population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setName(String name) {
        if(name.isEmpty()||name.isBlank()||name==null){
            System.err.println("invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation.isEmpty()||abbreviation.isBlank()||abbreviation==null){
            System.err.println("invalid name");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty.isEmpty()||politicalParty.isBlank()||politicalParty==null){
            System.err.println("invalid political party");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public void setGovernor(String governor) {
        if(governor.isEmpty()||governor.isBlank()||governor==null){
            System.err.println("invalid governor");
            System.exit(1);
        }
        this.governor = governor;
    }

    public void setSenator(String senator) {
        if(senator.isEmpty()||senator.isBlank()||senator==null){
            System.err.println("invalid senator");
            System.exit(1);
        }
        this.senator = senator;
    }

    public void setPopulation(int population) {
        if(population<=0){
            System.err.println("ınvalid population");
            System.exit(1);
        }
        this.population = population;
    }

    public void setStateTax(double stateTax) {
        if(stateTax<0){
            System.err.println("invalid state tax");
            System.exit(1);

        }
        this.stateTax = stateTax;
    }

    @Override
    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
