package sample;

public class MockConnection implements AutoCloseable {
    public void close() {
        System.out.println("MockConnection is closed.");
    }
}