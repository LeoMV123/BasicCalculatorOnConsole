package basiccalculatoroncosole.view;

import basiccalculatoroncosole.controller.AppController;
import java.util.Scanner;

public class AppView {
    
    final private Scanner input;
    final private AppController controller;
    
    public AppView(AppController controller, Scanner input) {
        
        this.controller = controller;
        this.input = input;
    
    }
    
    public char showMainMenu() {
        
        boolean isValidOption;
        char option;
        
        do {
            
            System.out.println(">> Basic Calculator <<" + '\n');
            System.out.println("1. Sum.");
            System.out.println("2. Subtraction.");
            System.out.println("3. Multiplication.");
            System.out.println("4. Division.");
            System.out.println("5. Exit."  + '\n');
            System.out.print("Choose a option: ");
            option = input.next().charAt(0);
                
            input.nextLine();
                
            System.out.println("");
            
            isValidOption = controller.validateOptionMainMenu(option);
            
            if (!isValidOption) {
                
                System.out.println("It isn't a valid option" + '\n');
                
            } 
            
        } while(!isValidOption);
        
        return option;
        
    }
    
    public double captureNumber(int index) {
        
        double number;
        
        System.out.print("Enter number " + index + ": ");
        
        while(!input.hasNextDouble()) {
            
            System.out.print("Invalid input. Enter number "+ index + ": ");
            input.nextLine();
            
        }
        
        number = input.nextDouble();
        input.nextLine();
        
        return number;
        
    }
    
}
