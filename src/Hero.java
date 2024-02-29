public abstract class Hero implements HavingSuperAbility{
    private int health, damage;
    private String superAbility;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }
}
