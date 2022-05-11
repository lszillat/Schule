public class Mitarbeiter {
    String vorname, name, beruf;
    public Mitarbeiter(String v, String n, String b) {
        vorname = v;
        name = n;
        beruf = b;
    }
    public Mitarbeiter(String v, String n) {
        vorname = v;
        name = n;
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
