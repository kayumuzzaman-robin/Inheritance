package learn.java;

public class Cat extends Animal{
    private boolean isEatable;
    private int heart;
    private int run;

    public Cat() {
        System.out.println("Cat() no arg. constructor get called");
    }

    public Cat(String animalClass, int legs, String livingPlace, boolean isEatable, int heart) {
        super(animalClass, legs, livingPlace);
        System.out.println("Cat() parameterized constructor get called");
        this.isEatable = isEatable;
        this.heart = heart;
    }

    public boolean isEatable() {
        return isEatable;
    }

    public void setEatable(boolean eatable) {
        isEatable = eatable;
    }

    public int getHeart() {
        return heart;
    }

    public void setHeart(int heart) {
        this.heart = heart;
    }

    public void run(int speed) {
        this.run = speed;
        System.out.println("Cat(): This can run with " + this.run + " speed");
    }

    @Override
    public void sleep(int time) {
        super.sleep(time);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "isEatable=" + isEatable +
                ", heart=" + heart +
                ", run=" + run +
                '}';
    }


}
