public class Wizard extends Character{
    private int mana;
    private int intelligence;

    //Constructor
    public Wizard(String name, int hp, int mana, int intelligence) {
        super(name, hp);
        setMana(mana);
        setIntelligence(intelligence);

    }

    //Getters & Setters

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    //Function Attack
    public void attack(Character enemy){
        //Variable battleMode generates a random attack type
        int battleMode = (Math.random() <= 0.5) ? 1 : 2;
        if (battleMode == 1 && getMana() >= 5) {
            enemy.setHp(enemy.getHp()-getIntelligence());
            setMana(getMana() - 5);
            System.out.println(getName() + " attacks with Fireball!" + "\n");
        } else if (getMana() >= 1) {
            enemy.setHp(enemy.getHp()-2);
            setMana(getMana() + 1);
            System.out.println(getName() + " attacks with Staff Hit!" + "\n");
        } else {setMana(getMana() + 2);
        System.out.println(getName()+" has not enough mana to perform attack. Mana was increased to 2" + "\n");}
    }

    public String toString() {
        return getName()  + " has " + getMana() + " mana, " + getIntelligence() + " intelligence, " + getHp() + " health points";
    }
}

