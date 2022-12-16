package day39_EncapsulationAndInheritancePractice;

public class Florida extends States{
    public Florida(String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super("Florida", abbreviation, politicalParty, governor, senator, population, stateTax);
    }
}
