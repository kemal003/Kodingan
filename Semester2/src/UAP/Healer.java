package UAP;

public class Healer extends Avatar {
    public Healer(int level) {
        super(level);
        super.setHealthPoint(1500);
        super.setDefense(100);
        super.setAttackPoint(500);
        super.tambahHealthPoint(80*level);
        super.tambahDefense(10*level);
        super.tambahAttackPoint(10*level);
        super.setMaxHP(super.getHealthPoint());
    }

    @Override
    public void attack(Avatar target) {
        int totalAttack = (int) ((double) super.getAttackPoint() * 130/100);
        target.revieveDamage(totalAttack-target.getDefense());
    }

    public void healAllMember(Avatar[] teamMember){
        int heal = (int) ((double) super.getAttackPoint() * 10/100);
        for (int i = 0; i < teamMember.length; i++) {
            teamMember[i].recieveHeal(heal);
        }
    }

    @Override
    public String getTipeAvatar() {
        return "Healer";
    }
}
