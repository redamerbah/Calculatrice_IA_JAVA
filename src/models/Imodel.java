package models;

import exceptions.AiExceptionForward;

public abstract class Imodel {
    public abstract double[] forward(double[] input) throws AiExceptionForward;
    public abstract double backward(double[] output, double[] predicted) ;
    public abstract void learn() ;
}
