package singleton;

public class DemandHolderIdiom {
    private static DemandHolderIdiom instance;

    private DemandHolderIdiom() {
    }

    public static DemandHolderIdiom getInstance() {
        return HelperHolder.instance;
    }

    private static class HelperHolder {
        private static final DemandHolderIdiom instance = new DemandHolderIdiom();
    }

}
