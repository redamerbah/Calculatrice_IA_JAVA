package transfertFunctionss;

public class TransfertFunctionSigmoid extends ITransfertFunction {
    @Override
    public double ft(double v) {
        return (1 / (1 + Math.exp(-v))) ;
    }

    @Override
    public double dft(double v) {
        return (v * ( 1 - v ) ) ;
    }
}
