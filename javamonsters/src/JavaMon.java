public class JavaMon {
    private Monster[] monsters;
    private int iMonster;
    private static final int MAX_MONS = 3;

    public JavaMon() {
        this.monsters = new Monster[MAX_MONS];
        this.iMonster = 0;
    }

    public boolean addMonster(String name) {
        if (iMonster >= this.monsters.length) {
            return false;
        }

        Monster newMonster = new Monster(name);

        if (checkMonster(newMonster)) {
            return false;
        }

        this.monsters[iMonster++] = newMonster;
        return true;
    }

    public String showMonster(String name) {
        int monsterPos = takeMonster(name);

        return this.monsters[monsterPos].toString();
    }

    private int takeMonster(String name) {
        for (int i = 0; i < iMonster; i++) {
            if (name.equals(this.monsters[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    private boolean checkMonster(Monster newMonster) {
        for (Monster m : this.monsters) {
            if (newMonster.equals(m)) {
                return true;
            }
        }
        return false;
    }
}
