package practicaHarry;

class CharacterTest{
    public static void main(String[] args) {
        Character harry = new Character("Harry James Potter", "Male", "Stag", "Gryffindor", "Half Blood", "Dementor");
        Character hermione = new Character("Hermione Jean Granger", "Female", "Otter", "Gryffindor", "Muggle Born", "Failure");
        Character bellatrix = new Character("Bellatrix Lestrange", "Female", null, "Slytherin", "Pure Blood", null);
        Character nigini = new Character("Nagini", "Female", null, null, "Underbeing", null);
        Character sirius = new Character("Sirius Black III", "Male", "Non corporeal", "Gryffindor", "Pure Blood", "Lord Boldemord");

        System.out.println(harry);
        System.out.println(hermione);
        System.out.println(bellatrix);
        System.out.println(nigini);
        System.out.println(sirius);
    }
}