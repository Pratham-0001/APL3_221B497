class Bheem extends Pandav {
    Bheem(String name, int fightingSkill, int obedienceLevel, String kindness) {
        super(name, fightingSkill, obedienceLevel, kindness);
    }

    void fight() {
        System.out.println(name + " is fighting with great skill of " + fightingSkill + ".");
    }

    void obey() {
        System.out.println(name + " obeys with obedience level " + obedienceLevel + ".");
    }

    void kind() {
        System.out.println(name + " is kind: " + kindness + ".");
    }
}