package practicaHarry;

public class Character {
    private String name, gender, patronus, house, bloodStatus, boggart;

    public Character(){}
    public Character(String name, String gender, String patronus, String house, String bloodStatus, String boggart){
        this.name = name;
        this.gender = gender;
        this.patronus = patronus;
        this.house = house;
        this.bloodStatus = bloodStatus;
        this.boggart = boggart;
    }

    public String getBloodStatus() {
        return bloodStatus;
    }
    public String getBoggart() {
        return boggart;
    }
    public String getGender() {
        return gender;
    }
    public String getHouse() {
        return house;
    }
    public String getName() {
        return name;
    }
    public String getPatronus() {
        return patronus;
    }

    public boolean setBloodStatus(String bloodStatus) {
        if(bloodStatus.isEmpty()) return false;

        this.bloodStatus = bloodStatus;
        return true;
    }
    public boolean setBoggart(String boggart) {
        if(boggart.isEmpty()) return false;

        this.boggart = boggart;
        return true;
    }
    public boolean setGender(String gender) {
        if(gender.isEmpty()) return false;

        this.gender = gender;
        return true;
    }
    public boolean setHouse(String house) {
        if(house.isEmpty()) return false;

        this.house = house;
        return true;
    }
    public boolean setName(String name) {
        if(name.isEmpty()) return false;

        this.name = name;
        return true;
    }
    public boolean setPatronus(String patronus) {
        if(patronus.isEmpty()) return false;

        this.patronus = patronus;
        return true;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", patronus='" + patronus + '\'' +
                ", house='" + house + '\'' +
                ", bloodStatus='" + bloodStatus + '\'' +
                ", boggart='" + boggart + '\'' +
                '}';
    }
}

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