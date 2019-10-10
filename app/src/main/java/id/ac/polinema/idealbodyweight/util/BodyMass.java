package id.ac.polinema.idealbodyweight.util;

public class BodyMass {

    private float height;
    private float weight;
    private float index;

    public BodyMass(float height, float weight) {
        this.height = height;
        this.weight = weight;
        this.index = calculate();
    }

    public float getIndex() {
        return index;
    }

    private float calculate() {
        float BMI = weight / (height*height);
        return BMI;
    }
}
