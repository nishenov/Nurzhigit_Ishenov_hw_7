public class Medic extends Hero{
    private int healPoints;
    @Override
    public void applySuperAbility() {
        System.out.println("Medic is using " + getSuperAbility());
    }
    public int increaseExperience(){
        healPoints*=1.10;
        return healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }
}

