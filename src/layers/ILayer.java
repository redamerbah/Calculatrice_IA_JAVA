package layers;

public abstract class ILayer<I> {

    public abstract double[] backward(double[] dy);
    public abstract double[] forward(double[] input);

}

