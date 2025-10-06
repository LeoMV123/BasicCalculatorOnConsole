package basiccalculatoroncosole;

import basiccalculatoroncosole.controller.AppController;
import basiccalculatoroncosole.utils.Calculator;
import basiccalculatoroncosole.view.AppView;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        app();
        
    }
    
    public static void app() {
        
        AppController controller = new AppController(new Calculator());
        AppView view = new AppView(controller, new Scanner(System.in));
        boolean isExit = false;
        
        do {
            
            char option = view.showMainMenu();
            isExit = controller.shouldExit(option);
            
            if (!isExit) {
                
                double number1 = view.captureNumber(1);
                double number2 = view.captureNumber(2);
                double result = controller.doOperaction(option, number1, number2);
                
                System.out.printf("Result is: %.3f%n", result);
                System.out.println();
                
            }
            
        } while(!isExit);
        
        System.out.println("Thank you, see you for next time :D");
        
    }
    
}
