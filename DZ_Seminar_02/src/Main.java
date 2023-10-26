public class Main {
    public static void main(String[] args) {

        Developer developer1 = new FrontEndDeveloper();
        Developer developer2 = new BackEndDeveloper();
        try {
            ((FrontEndDeveloper) developer1).developGUI();
            ((FrontEndDeveloper) developer2).developGUI();

        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
    }
}
