package UAP;

public class Assassin extends Avatar{
    public Assassin(int level) {
        super(level);
        super.setHealthPoint(2500);
        super.setDefense(200);
        super.setAttackPoint(750);
        super.tambahHealthPoint(80*level);
        super.tambahDefense(10*level);
        super.tambahAttackPoint(10*level);
        super.setMaxHP(super.getHealthPoint());
    }

    @Override
    public void attack(Avatar target) {
        int totalAttack = (int) (super.getAttackPoint() - (double) (target.getDefense()*80/100));
        target.revieveDamage(totalAttack);
    }

    @Override
    public String getTipeAvatar() {
        return "Assassin";
    }
}
