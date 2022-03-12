package transfertFunctionss;

public class TransfertFunctionTanh extends ITransfertFunction {
    public double ft(double v) {
        double e = Math.exp(v) ;
        double me = Math.exp(-v) ;
        return ( (e - me) / (e + me) ) ;
    }
    public double dft(double v) {return ( 1 - v * v ) ;}
}
