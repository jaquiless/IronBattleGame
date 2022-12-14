public abstract class Character {
    private String id;
    private String name;
    private int hp;
    private boolean isAlive = true;

    // Constructor

    public Character(String name, int hp) {
        setName(name);
        setHp(hp);
    }

    //Getter & Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
            if (getHp() <= 0) isAlive = false;
            return isAlive;
        }

    //Abstract method attack
    public abstract void attack (Character enemy);

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

}
