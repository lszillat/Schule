public class Person {
    String name, vorname;
    Person (String n, String v) {
        name = n;
        vorname = v;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setName(String name) {
        this.name = name;
    }
}