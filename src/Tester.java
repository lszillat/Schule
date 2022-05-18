public class Tester {
    public void rufen(String R, int Rl, String A, int Al) {
        for (int i = 0; i < Rl; i++) {
            System.out.println(R);
            Echo myEcho = new Echo();
            myEcho.antworten(A, Al);
            System.out.println("");
        }
    }
}
