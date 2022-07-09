public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        double height = (float) 1.65;
        int mass = 57;
        float bmi = service.calculate((float) height, mass);
        System.out.println(bmi);
    }
}
