public class TestStatic {
    private String username0;

    public static int usernameQuantity =0;

    public TestStatic(String user) {
        username0 = user;
        usernameQuantity++;
    }

    public String putUsernameDatabase() {
        return username0;
    }

    public static int getFoodCount() {
        return usernameQuantity;
    }
}
