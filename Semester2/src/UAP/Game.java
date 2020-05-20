package UAP;

public class Game {
    private Avatar[] team1 = new Avatar[3];
    private Avatar[] team2 = new Avatar[3];

    public Game(Avatar[] avatarMain) {
        team1[0] = avatarMain[0];
        team1[1] = avatarMain[1];
        team1[2] = avatarMain[2];
        team2[0] = avatarMain[4];
        team2[1] = avatarMain[5];
        team2[2] = avatarMain[6];

    }

    public Avatar[] getTeam1() {
        return team1;
    }

    public Avatar[] getTeam2() {
        return team2;
    }

    public boolean isTeam1SemuaMati() {
        if ((!team1[0].isLifeStatus() && !team1[1].isLifeStatus() && !team1[2].isLifeStatus())) return true;
        else return false;
    }

    public boolean isTeam2SemuaMati() {
        if ((!team2[0].isLifeStatus() && !team2[1].isLifeStatus() && !team2[2].isLifeStatus())) return true;
        else return false;
    }

    public boolean adaYangHabis() {
        if (isTeam1SemuaMati() || isTeam2SemuaMati()) return true;
        else return false;
    }
}
