package basiccalculatoroncosole.utils.operations;

import basiccalculatoroncosole.utils.interfaces.Subtractable;

public class DoubleSubtractor implements Subtractable<Double> {

    @Override
    public Double subtract(Double number1, Double number2) {
    
        return number1 - number2;
        
    }
    
}
