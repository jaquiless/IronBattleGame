import java.util.Random;

public class Warrior extends Character {
    private int stamina;
    private int strength;


    //Constructor
    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        setStamina(stamina);
        setStrength(strength);
    }

    //Getters & Setters

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    //Function Attack
    public void attack(Character enemy) {
        //Variable battleMode generates a random attack type
        int battleMode = (Math.random() <= 0.5) ? 1 : 2;
        if (battleMode == 1 && getStamina() >= 5) {
            enemy.setHp(enemy.getHp() - getStrength());
            setStamina(getStamina() - 5);
            System.out.println((getName() + " attacks with Heavy attack!" + "\n"));
        } else if (getStamina() >= 1) {
            enemy.setHp(enemy.getHp() - (getStrength() / 2));
            setStamina(getStamina() + 1);
            System.out.println((getName() + " attacks with Weak attack!" + "\n"));
        } else {setStamina(getStamina() + 2);
        System.out.println(getName()+" has not enough stamina to perform attack. Stamina was increased to 2" + "\n");}
    }

    @Override
    public String toString() {
        return getName()  + " has " + getStamina() + " stamina, " + getStrength() + " strength, " + getHp() + " health points";
    }
}

