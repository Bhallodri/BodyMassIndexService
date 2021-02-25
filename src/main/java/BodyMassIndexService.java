public class BodyMassIndexService {
    double calculate(int weight,double growth){
        double bodyMassIndex =  (weight / growth);
        return bodyMassIndex;
    }
}
