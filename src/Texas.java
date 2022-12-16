package day39_EncapsulationAndInheritancePractice;

public class Texas extends States{
    public Texas(String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super("Texas", abbreviation, politicalParty, governor, senator, population, stateTax);
    }
}
