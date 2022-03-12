import losses.Iloss;

public class LossDifference extends Iloss {
    public double[] loss(double[] target, double[] predicted) throw new AiExceptionLoss("y et yp ne sont pas compatible", ErrorLevel.LOSS) {
        double[] lossDifference = new double[target.length];
        for (int i = 0; i < target.length; i++) {
            lossDifference[i] = target[i] - predicted[i];
        }
        return lossDifference;
    }
}