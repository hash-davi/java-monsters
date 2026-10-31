public class Monster {
    private String name;
    private int healthPoints;
    private int maxHealthPoints;

    public Monster(String name) {
        this.name = name;
        this.healthPoints = 20;
        this.maxHealthPoints = 20;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                '}';
    }
}