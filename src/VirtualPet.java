
public class VirtualPet {
    String name;
    int thirst;
    int hunger;
    int boredom;

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
        System.out.println("Your pet is bored play with them");//fix words
        }
    }

    public void petIsThirsty() {
        if (thirst > 80) {
                System.out.println("Your pet is bored play with them");//fix words
        }
    }

    public void petIsBored() {
        if (boredom > 80) {
            System.out.println("Your pet is bored play with them");
        }
    }

    public void fedPet() {
        hunger += 5;
        thirst -= 2;
        boredom += 2;
    }

    public void waterPet() {
        hunger += 5;
        thirst -= 2;
        boredom += 2;
    }

    public void playPet() {
        hunger += 2;
        thirst += 2;
        boredom -= 5;
    }

}
