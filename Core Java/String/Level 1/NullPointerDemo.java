public class NullPointerDemo {
    static void causeError() {
        String text = null;
        System.out.println(text.length());
    }

    static void handleError() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }
    }

    public static void main(String[] args) {
        // causeError(); // Uncomment to see abrupt stop
        handleError();
    }
}
