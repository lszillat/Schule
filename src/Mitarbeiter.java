public class Mitarbeiter extends Person{
    String beruf;
    public Mitarbeiter(String n, String v,String b) {
        super(n, v);
        beruf = b;
    }
    public Mitarbeiter(String v, String n) {
        super(n, v);
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeruf() {
        return beruf;
    }

    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }
}
