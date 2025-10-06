package basiccalculatoroncosole.utils;

import basiccalculatoroncosole.utils.interfaces.Addable;
import basiccalculatoroncosole.utils.interfaces.Dividable;
import basiccalculatoroncosole.utils.interfaces.Multipliable;
import basiccalculatoroncosole.utils.interfaces.Subtractable;
import basiccalculatoroncosole.utils.operations.DoubleAdder;
import basiccalculatoroncosole.utils.operations.DoubleDivider;
import basiccalculatoroncosole.utils.operations.DoubleMultiplier;
import basiccalculatoroncosole.utils.operations.DoubleSubtractor;

public class Calculator {

    final private Addable<Double> adder;
    final private Subtractable<Double> subtractor;
    final private Multipliable<Double> multiplier;
    final private Dividable<Double> divider;
    
    public Calculator() {
        
        this.adder = new DoubleAdder();
        this.subtractor = new DoubleSubtractor();
        this.multiplier = new DoubleMultiplier();
        this.divider = new DoubleDivider();
        
    }
    
    public Double add(Double number1, Double number2) {
        
        return adder.add(number1, number2);
        
    }
    
    public Double subtract(Double number1, Double number2) {
        
        return subtractor.subtract(number1, number2);
        
    }
    
    public Double multiply(Double number1, Double number2) {
        
        return multiplier.multiply(number1, number2);
        
    }
    
    public Double divide(Double number1, Double number2) {
        
        return divider.divide(number1, number2);
        
    }
    
}
