
public class VirtualPet {
    private String name;
    private int thirst;
    private int hunger;
    private int boredom;

    // constructors
    public VirtualPet(String name) {
        this.name = name;
        this.thirst = 40;
        this.hunger = 40;
        this.boredom = 40;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getThirst() {
        return thirst;
    }

    public int getHunger() {
        return hunger;
    }

    public int getBoredom() {
        return boredom;
    }

    // setters
    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    // tick
    public void tick() {
        hunger++;
        boredom++;
        thirst++;

    }

    public void petIsHungry() {
        if (hunger > 80) {
        System.out.println("Your pet is hungry,you need to feed them. ");
        }
    }

    public void petIsThirsty() {
        if (thirst > 80) {
                System.out.println("Your pet is thirsty, you need to give them water.");
        }
    }

    public void petIsBored() {
        if (boredom > 80) {
            System.out.println("Your pet is bored, you need to play with them. ");
        }
    }

    public void fedPet() {
        hunger += 5;
        thirst -= 2;
        boredom += 2;
    }

    public void waterPet() {
        hunger += 2;
        thirst -= 5;
        boredom += 2;
    }

    public void playPet() {
        hunger += 2;
        thirst += 2;
        boredom -= 5;
    }

}
