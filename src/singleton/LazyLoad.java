package singleton;

public class LazyLoad {
    private static LazyLoad instance;

    private LazyLoad() {
    }

    public static synchronized LazyLoad getInstance() {
        if (instance == null) {
            instance = new LazyLoad();
        }
        return instance;
    }
}
