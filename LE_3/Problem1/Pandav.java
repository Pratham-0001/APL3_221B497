class Pandav extends Bharatvanshi {
    int obedienceLevel;
    String kindness;

    Pandav(String name, int fightingSkill, int obedienceLevel, String kindness) {
        super(name, fightingSkill);
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