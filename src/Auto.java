public class Auto {
    int v_aktuell, anz_Plaetze;
    Auto (int v_aktuell, int anz_Plaetze) {
        this.v_aktuell = 0;
        this.anz_Plaetze = 0;
    }

    public void beschleunigen(int s) {
        v_aktuell += s;
    }

    public void bremsen(int s) {
        v_aktuell -= s;
    }
    public int getV_aktuell() {
        return v_aktuell;
    }
}