public class Main {
    public static void main(String[] args) {
        PredictionService service = new PredictionService ();
        double bodyMassIndex = service.calculate(77,(1.72 * 1.72));
        System.out.println(bodyMassIndex) ;
    }
}