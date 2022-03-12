package neurons;

import exceptions.AiExceptionForward;
import transfertFunctions.ITransfertFunction;
import utils.IInitialiseBias;
import utils.IInitialiseWeights;

public  class NeuronLinear extends INeuron {
    private double[] w;
     double b ;
     double lr;
     double[] xt;
     double yt;
      ITransfertFunction tf;

    public NeuronLinear(double lr, int inputSize, IInitialiseWeights initW, IInitialiseBias initB, ITransfertFunction tf) {
        this.w = w;
        w=initW.initWeights(inputSize);

        b=initB.initBias();
        this.lr = lr;
        this.xt = xt;
        this.tf = tf;
    }

    @Override
    public double forward(double[] input)throws AiExceptionForward {
        this.xt = input ;
        double output = 0.0 ;
        for (int i = 0; i < input.length; i++)
            output += this.w[i] * input[i] ;
        this.yt = this.tf.ft(output + this.b);
        return this.yt ;
    }


    @Override
    public double[] backward(double dy,double[] dxt) {
        double dxty = this.tf.dft(this.yt) * dy;
        for (int i = 0; i < w.length; i++) {
            dxt[i] += this.w[i] * dxty ;
            this.w[i] += this.xt[i] * dxty * this.lr ;
        }
        this.b += dy * this.lr ;
        return dxt ;
    }

    public double getWSize() {
        return w.length ;
    }


}
