public class BodyMassIndexService {
    double calculate(int weight,double growth){
        double bodyMassIndex =  weight / (growth * growth) * 10_000;
        return bodyMassIndex;
    }
}
