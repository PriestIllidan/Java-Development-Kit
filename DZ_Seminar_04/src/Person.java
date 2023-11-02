public class Person {
    private int personId;
    private String phone;
    private String name;
    private int experience;


    public Person(int personId, String phone, String name, int experience) {
        this.personId = personId;
        this.phone = phone;
        this.name = name;
        this.experience = experience;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return String.format("Id: %d, Phone: %s, Name: %s, Experience: %d",
                personId, phone, name, experience);
    }
}
