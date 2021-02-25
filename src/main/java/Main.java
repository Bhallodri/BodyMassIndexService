public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        double bodyMassIndex = service.calculate(77,173);
        System.out.println(bodyMassIndex) ;
    }
}