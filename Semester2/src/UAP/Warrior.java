package UAP;

public class Warrior extends Avatar{
    public Warrior(int level) {
        super(level);
        super.setHealthPoint(3000);
        super.setDefense(250);
        super.setAttackPoint(800);
        super.tambahHealthPoint(100*level);
        super.tambahDefense(10*level);
        super.tambahAttackPoint(15*level);
        super.setMaxHP(super.getHealthPoint());
    }

    @Override
    public void attack(Avatar target) {
        int totalAttack = (int) ((double) super.getAttackPoint() * 130/100);
        target.revieveDamage(totalAttack-target.getDefense());
    }

    @Override
    public String getTipeAvatar() {
        return "Warrior";
    }
}
