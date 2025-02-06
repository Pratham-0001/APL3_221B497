class Kaurav extends Bharatvanshi {
    int disobedienceLevel;

    Kaurav(String name, int fightingSkill, int disobedienceLevel) {
        super(name, fightingSkill);
        this.disobedienceLevel = disobedienceLevel;
    }

    void fight() {
        System.out.println(name + " is fighting with skill level " + fightingSkill + ".");
    }

    void disobey() {
        System.out.println(name + " disobeys with disobedience level " + disobedienceLevel + ".");
    }
}