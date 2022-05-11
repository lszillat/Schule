public class Schueler extends Person {
    int Note1, Note2;
    String Fach1, Fach2;
    public Schueler(String n, String v, int N1, String F1, int N2, String F2) {
        super(n, v);
        Note1 = N1;
        Fach1 = F1;
        Note2 = N2;
        Fach2 = F2;
    }

    public int getNote1() {
        return Note1;
    }

    public void setNote1(int note1) {
        Note1 = note1;
    }

    public int getNote2() {
        return Note2;
    }

    public void setNote2(int note2) {
        Note2 = note2;
    }

    public String getFach1() {
        return Fach1;
    }

    public void setFach1(String fach1) {
        Fach1 = fach1;
    }

    public String getFach2() {
        return Fach2;
    }

    public void setFach2(String fach2) {
        Fach2 = fach2;
    }
}
