package basiccalculatoroncosole.utils.operations;

import basiccalculatoroncosole.utils.interfaces.Addable;

public class DoubleAdder implements Addable<Double> {

    @Override
    public Double add(Double number1, Double number2) {
        
        return number1 + number2;
        
    }
    
}
