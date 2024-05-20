public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss(500, 50, "Boss", WeaponType.DAGGER );
        boss.printInfo();
        Skeleton skeleton1 = new Skeleton(200, 15, "Skeleton", WeaponType.BOW, 30 );
        Skeleton skeleton2 = new Skeleton(200, 15, "Skeleton", WeaponType.BOW, 20 );
        skeleton1.printInfo();
        skeleton2.printInfo();


    }
}