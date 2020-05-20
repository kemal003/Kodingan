package UAP;

public abstract class Avatar implements Attack{
    private int healthPoint;
    private int defense;
    private int attackPoint;
    private boolean lifeStatus=true;
    private int maxHP;

    public Avatar(int level) {

    }

    public void healAllMember(Avatar[] teamMember) { }

    @Override
    public abstract void attack(Avatar target);

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healtPoint) {
        this.healthPoint = healtPoint;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public boolean isLifeStatus() {
        return lifeStatus;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public void tambahHealthPoint(int tambah){
        healthPoint+=tambah;
    }

    public void tambahDefense(int tambah){
        defense+=tambah;
    }

    public void tambahAttackPoint(int tambah){
        attackPoint+=tambah;
    }

    public void revieveDamage(int damage){
        healthPoint-=damage;
        if (healthPoint<=0) {
            this.lifeStatus=false;
            System.out.println(getTipeAvatar() + " dead");
            healthPoint=0;
        }
    }

    public void recieveHeal(int heal){
        if (healthPoint+heal<=maxHP){
            healthPoint+=heal;
        }
        else healthPoint+=maxHP-healthPoint;
    }

    public abstract String getTipeAvatar();

    @Override
    public String toString() {
        return getTipeAvatar() + "{" +
                "healthPoint=" + healthPoint +
                ", defense=" + defense +
                ", attackPoint=" + attackPoint +
                ", lifeStatus=" + lifeStatus +
                ", maxHP=" + maxHP +
                '}';
    }
}
