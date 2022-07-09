public class BMIService {
    public float calculate(float height, int mass){
        double bmi;
        bmi = mass / (height*height);
        return (float) bmi;
    }
}
