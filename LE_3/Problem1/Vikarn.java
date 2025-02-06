class Vikarn extends Kaurav {
    int obedienceLevel;
    String kindness;

    Vikarn(String name, int fightingSkill, int disobedienceLevel, int obedienceLevel, String kindness) {
        super(name, fightingSkill, disobedienceLevel);
        this.obedienceLevel = obedienceLevel;
        this.kindness = kindness;
    }

    void fight() {
        System.out.println(name + " is fighting with skill level " + fightingSkill + ".");
    }

    void obey() {
        System.out.println(name + " obeys with obedience level " + obedienceLevel + ".");
    }

    void kind() {
        System.out.println(name + " is kind: " + kindness + ".");
    }
}