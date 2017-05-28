


/**
 *
 * @author c16318
 */
public class Main {
    public static void main(String[] args){
        IceCreamMixer ice = IceCreamMixer.getIceCreamMixer();
        IceCreamMixer ice2 = IceCreamMixer.getIceCreamMixer();
        
        ice.fill();
        ice2.mixer();
        ice.mixer();
        ice.drain();
        
    }
    
}
