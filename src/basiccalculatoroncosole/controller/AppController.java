package basiccalculatoroncosole.controller;

import basiccalculatoroncosole.utils.Calculator;

public class AppController {
    
    final private Calculator calculator;
    
    public AppController(Calculator calculator) {
        
        this.calculator = calculator;
    
    }
    
    public boolean validateOptionMainMenu(char option){
        
        char [] validOptions = {'1', '2', '3', '4', '5'};
        
        for(int i = 0; i < validOptions.length; i++) {
            
            if(option == validOptions[i]) {
                
                return true;
                
            }
            
        }
        
        return false;
        
    }
    
    public boolean shouldExit(char option) {
        
        return option == '5';
        
    }

    public double doOperaction(char option, double number1, double number2) {
        
        double result = 0.0;
        
        switch(option) {
            
            case '1':
                result = calculator.add(number1, number2);
                break;
            case '2':
                result = calculator.subtract(number1, number2);
                break;
            case '3':
                result = calculator.multiply(number1, number2);
                break;
            case '4':
                result = calculator.divide(number1, number2);
                break;
            
        }
        
        return result;
        
    }
    
}
