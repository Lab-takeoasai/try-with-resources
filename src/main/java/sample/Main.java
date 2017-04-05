package sample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Begin Main");
        tryWithResources();
        System.out.println("End Main");
    }

    private static void tryWithResources() {
        try (MockConnection connection = new MockConnection();) {
            System.out.println("tryWithResources");
            return;
        }
    }
}