package learn.java;

public class Animal {
    private String animalClass;
    private int legs;
    private String livingPlace;
    private int sleepTime;

    public Animal() {
        System.out.println("Animal() no arg. constructor get called");
    }

    public Animal(String animalClass, int legs, String livingPlace) {
        System.out.println("Animal() parameterized constructor get called");
        this.animalClass = animalClass;
        this.legs = legs;
        this.livingPlace = livingPlace;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getLivingPlace() {
        return livingPlace;
    }

    public void setLivingPlace(String livingPlace) {
        this.livingPlace = livingPlace;
    }

    public void sleep(int time) {
        this.sleepTime = time;
        System.out.println("Animal(): It sleeps for " + this.sleepTime + " hours");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalClass='" + animalClass + '\'' +
                ", legs=" + legs +
                ", livingPlace='" + livingPlace + '\'' +
                ", sleepTime=" + sleepTime +
                '}';
    }
}
