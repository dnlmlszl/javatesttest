package Tests;

public class TestingPrinciples {
    public static void main(String[] args) {
        int[] array = upload();
        uploadTest();
    }
    private static int[] upload() {
        return new int[] {1, 2, 3, -1};
    }
    static void uploadTest() {
        int [] received = upload();
        assert  received.length > 2 : "Error, array not OK";

        int receivedLength = received.length;
        int requiredLength = 4;
        assert receivedLength == requiredLength : "Error, length does not match";

        assert received[0]%2 ==0 : "Error, de first item is odd";
    }
}
