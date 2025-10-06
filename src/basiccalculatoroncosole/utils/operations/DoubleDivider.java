package basiccalculatoroncosole.utils.operations;

import basiccalculatoroncosole.utils.interfaces.Dividable;

public class DoubleDivider implements Dividable<Double> {

    @Override
    public Double divide(Double number1, Double number2) {
    
        return number1 / number2;
    
    }
    
}
