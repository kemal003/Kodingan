package UAP;

public class Tank extends Avatar{
    public Tank(int level) {
        super(level);
        super.setHealthPoint(5000);
        super.setDefense(400);
        super.setAttackPoint(500);
        super.tambahHealthPoint(150*level);
        super.tambahDefense(15*level);
        super.tambahAttackPoint(10*level);
        super.setMaxHP(super.getHealthPoint());
    }

    @Override
    public void attack(Avatar avatar) {
        avatar.revieveDamage(super.getAttackPoint() - avatar.getDefense());
    }

    @Override
    public String getTipeAvatar() {
        return "Tank";
    }
}
