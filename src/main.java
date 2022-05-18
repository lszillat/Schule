public class main {
    public static void main(String[] args) {
        Echo myEcho = new Echo();
        Tester myTester = new Tester();
        myEcho.antworten("Hello", 5);
        myTester.rufen("Hallo", 5);
    }
}