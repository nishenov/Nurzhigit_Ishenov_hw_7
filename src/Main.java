public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        magic.setHealth(100);
        magic.setDamage(10);
        magic.setSuperAbility("EXPLOSION");
        Warrior warrior = new Warrior();
        warrior.setHealth(100);
        warrior.setDamage(10);
        warrior.setSuperAbility("CRITICAL DAMAGE");
        Medic medic = new Medic();
        medic.setHealth(100);
        medic.setDamage(10);
        medic.setHealPoints(10);
        medic.setSuperAbility("HEALING");
        Hero[] heroes = {magic, warrior, medic};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            if (heroes[i] instanceof Medic){
                ((Medic) heroes[i]).increaseExperience();
                System.out.println("Medic heal points are " + ((Medic) heroes[i]).getHealPoints() );
            }
        }
    }
}