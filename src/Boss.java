public class Boss extends GameEntity{
   private Weapon weaponOfBoss;


    public Boss(int health, int damage, String name, WeaponType weaponType) {
        super(health, damage,name);
        this.weaponOfBoss=new Weapon();
        this.weaponOfBoss.setWeaponType(weaponType);
        this.weaponOfBoss.setNameOfWeapon(weaponType.name());
    }

    public Weapon getWeaponOfBoss() {
        return weaponOfBoss;
    }

    public void setWeaponOfBoss(Weapon weaponOfBoss) {
        this.weaponOfBoss = weaponOfBoss;
    }


    public void printInfo (){
        System.out.println("Health: " + getHealth() + " Damage: " + getDamage() + " Name: " + getName() + " Type of weapon: " + weaponOfBoss.getWeapontype());
    }


}
