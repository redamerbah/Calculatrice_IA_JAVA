package neurons;

public abstract class INeuron {
    public abstract double forward(double[] input);

    public abstract double getWSize();

    public abstract double[] backward(double y, double[] dxt);

}
