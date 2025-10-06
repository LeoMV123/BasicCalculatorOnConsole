package basiccalculatoroncosole.utils.operations;

import basiccalculatoroncosole.utils.interfaces.Multipliable;

public class DoubleMultiplier implements Multipliable<Double> {

    @Override
    public Double multiply(Double number1, Double number2) {
        
        return number1 * number2;
        
    }
    
}
