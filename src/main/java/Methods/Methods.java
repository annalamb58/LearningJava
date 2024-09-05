/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

import javax.swing.JOptionPane;

/**
 *
 * @author Anna
 */
public class Methods {
    
    public static void main(String[] args) {
        
        //Task:
        //get input from user
        // print symbol
        
        String inputNum = JOptionPane.showInputDialog("Enter mark");
        int num = Integer.parseInt(inputNum) ; 
        
        char symbol = getSymbol (num) ;

        // to note: getSymbol is for example like Math.round
        // it has lots of code behind it
        // Ctrl B can show you this

        System.out.println( "your grade is " + symbol);
        
 
    }
    
    
    //IPO
    public static char getSymbol (int mark) {
        char s = 'A';
        mark = mark/10;
        
        switch (mark) {
        
            case 8:
            case 9:
            case 10:
                s = 'A' ;
                break;
            
            case 7:
                s = 'B' ;
                break;
            case 6: 
                s = 'C' ;
                break;
            case 5 :
                s = 'D' ;
                break ;
            case 4 :
                s = 'E' ;
                break;
            default:
                s = 'F' ;
                break ;
                
                        
                
  
        //char symbol = 'A';  
          
        //return symbol;
        }
        
        return s ;
    }
}

