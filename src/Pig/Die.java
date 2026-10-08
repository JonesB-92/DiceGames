package Pig;

public class Die {
    private int faceValue;

    public Die() {
        faceValue = 0;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void roll() {
        faceValue = (int) (Math.random() * 6) + 1;
    }
}
