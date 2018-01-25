package singleton;

public final class DoubleCheck {
    private static volatile DoubleCheck instance;

    private DoubleCheck() {
    }

    public static DoubleCheck getInstance() {
        DoubleCheck result = instance;
        if (result == null) {
            synchronized (DoubleCheck.class) {
                result = instance;
                if (result == null) {
                    result = instance = new DoubleCheck();
                }
            }
        }
        return result;
    }
}
