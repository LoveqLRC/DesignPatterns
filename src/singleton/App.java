package singleton;

public class App {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance);
        System.out.println(instance1);

        DoubleCheck instance2 = DoubleCheck.getInstance();
        DoubleCheck instance3 = DoubleCheck.getInstance();

        System.out.println(instance2);
        System.out.println(instance3);

        LazyLoad instance4 = LazyLoad.getInstance();
        LazyLoad instance5 = LazyLoad.getInstance();

        System.out.println(instance4);
        System.out.println(instance5);

        DemandHolderIdiom instance6 = DemandHolderIdiom.getInstance();
        DemandHolderIdiom instance7 = DemandHolderIdiom.getInstance();
        System.out.println(instance6);
        System.out.println(instance7);
    }
}
