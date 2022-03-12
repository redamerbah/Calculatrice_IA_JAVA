package layers;
import neurons.INeuron;
import neurons.NeuronLinear;
import transfertFunctions.ITransfertFunction;
import utils.IInitialiseBias;
import utils.IInitialiseWeights;
import java.util.List;
import java.util.ArrayList;


 public class LayerLinear extends  ArrayList<INeuron> {

     private final List<INeuron> neurons = new ArrayList<>();

    public double[] forward(double[] input) throw new AiExceptionForward("neurons attendu", ErrorLevel.LAYER) {
        double[] out = new double[this.size()];
        int pos = 0 ;
        for (INeuron neuron : this) //Boucle for à modifier …
        {
            out[pos++] = neuron.forward(input); //Appel la méthode forward de neurone

        }
        return out ;
    }


    public double[] backward(double[] dy) throw new AiExceptionbackward("neurons attendu", ErrorLevel.LAYER); {

        int pos = 0 ;
        double[] dxt = new double[(int) this.get(0).getWSize()];
        for(INeuron neuron : this) {
            dxt =neuron.backward(dy[pos++],dxt);//Appel la méthode backward de neurone
        }
        return dxt ;
    }
     public LayerLinear(int inputSize, int outputSize, double lr,
                        IInitialiseWeights initWeights, IInitialiseBias initBias,
                        ITransfertFunction tf) {
         for (int i = 0; i < outputSize; i++) {
             neurons.add(new NeuronLinear(lr, inputSize, initWeights, initBias, tf));
         }
     }


}
