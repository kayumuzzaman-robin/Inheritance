package learn.java;

public class Fish extends Animal {
    private boolean isEatable;
    private boolean canPet;
    private int swim;

    public Fish() {
        System.out.println("Fish() no arg constructor get called");
    }

    public Fish(String animalClass, int legs, String livingPlace, boolean isEatable, boolean canPet) {
        super(animalClass, legs, livingPlace);
        System.out.println("Fish() parameterized constructor get called");
        this.isEatable = isEatable;
        this.canPet = canPet;
    }

    public boolean isEatable() {
        return isEatable;
    }

    public void setEatable(boolean eatable) {
        isEatable = eatable;
    }

    public boolean isCanPet() {
        return canPet;
    }

    public void setCanPet(boolean canPet) {
        this.canPet = canPet;
    }

    public void swim(int speed) {
        this.swim = speed;
        System.out.println("Fish(): This can swim at " + swim + " speed");
    }

    @Override
    public void sleep(int time) {
        super.sleep(time);
    }

    @Override
    public String toString() {
        return "Fish{" +
                "isEatable=" + isEatable +
                ", canPet=" + canPet +
                ", swim=" + swim +
                '}';
    }
}
