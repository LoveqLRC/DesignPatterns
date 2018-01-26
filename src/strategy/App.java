package strategy;

public class App {
    public static void main(String[] args) {
        DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();
        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();

        dragonSlayer = new DragonSlayer
                (() -> System.out.println("With your Excalibur you severe the dragon's head!"));
        dragonSlayer.goToBattle();

    }
}
