package day39_EncapsulationAndInheritancePractice;

public class StateObjects {
    public static void main(String[] args) {
        States states = new States("Virginia", "VR", "Democrat",
                "Mehmet", "Mr.Oz", 1_000_000, 0.5);
        System.out.println(states);
        Virginia virginia = new Virginia("VR", "Democrat", "Mehmet", "Nevzat", 1_000_0000, 0.5);
        System.out.println(virginia);

    }
}
