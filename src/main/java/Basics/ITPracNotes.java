/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basics;

import javax.swing.JOptionPane; // this allows the JOptionPane to run

/**
 *
 * @author Anna
 */
public class ITPracNotes {

    public static void main(String[] args) { // you always start your code with psvm

        StartApp();  // after psvm you always have StartApp ();
        
        int num = add(4,6);

    }

    public static void StartApp() { // then put psv StartApp() method 

        String inputCoke = JOptionPane.showInputDialog("Enter num of cokes");
        //  String is the type inputCoke is the name
        //  = means save    . means from or within
        // showInputDialog is within JOptionPane
        int numCokes = Integer.parseInt("inputCoke");
        //  int is the type numCokes is the name 
        // parseInt is within Integer 
        // it is useing the infomation from inputCoke
        // it is used with the number of some things 

        String inputNum = JOptionPane.showInputDialog("Enter the lenght");
        //  String is the type inputNum is the name
        //  = means save    . means from or within
        // showInputDialog is within JOptionPane
        double num = Double.parseDouble(inputNum);
        //  double is the type num is the name 
        // parseDouble is within Double 
        // it is useing the infomation from inputNum
        // it is used with the number of some sides 

        double area;
        // double is type area is name
        area = Math.PI * Math.pow(num, 2);
        // the area is PI * radius squred
        // it is the same as saying Math.PI * num * num 
        // Math.pow (num,2) means we are raising num to the power of 2
        System.out.println(area);
        // this now prints (shows) the answer 
        //sout is the cheatcode

        double volume;
        // double is type volume is name
        volume = 4.0 / 3.0 * Math.PI * Math.pow(num, 3);
        // you need to divied by a double therefore you add a .0 to the number
        // it is the same as saying Math.PI * num * num * num
        // Math.pow (num,3) means we are raising num to the power of 3

        String InputNum2 = JOptionPane.showInputDialog(" Enter lenght");
        //  String is the type inputNum2 is the name
        //  = means save    . means from or within
        // showInputDialog is within JOptionPane
        double num2 = Double.parseDouble(InputNum2);
        //  double is the type num2 is the name 
        // parseDouble is within Double 
        // it is useing the infomation from inputNum2
        // it is used with the number of some sides 

        String InputNum3 = JOptionPane.showInputDialog("Enter breath");
        //  String is the type inputNum3 is the name
        //  = means save    . means from or within
        // showInputDialog is within JOptionPane
        double num3 = Double.parseDouble(InputNum3);
        //  double is the type num3 is the name 
        // parseDouble is within Double 
        // it is useing the infomation from inputNum2
        // it is used with the number of some sides 

        double area2;
        // double is type area2 is name
        area2 = num2 * num3;
        // to work out a rectangle you need to time the3 lenght and breath
        // that is what this code does
        System.out.println(area2);
        // this now prints (shows) the answer 
        //sout is the cheatcode

        double num4 = 6.23432;

        num4 = num4 * 100;  //623.432
        num4 = Math.round(num4); //623.0
        // double saving therefore we ask to round then save it back into num4
        // when the code runs what is on the right side of the = runs first 
        //and then gets saved into what is on the left
        num4 = num4 / 100; //6.23

        //between 20(incl) and 30 (excl)
        int num5 = (int) (Math.random() * 10 + 20);
        // you times the range and add the lowest number
        // between 20 and 29,9999

        //INDEX = POSITION
        String name = "Clifton";
        int numLetter = name.length();
        // gives you the number of letters in the name 
        String surname = "Bartholomew";
        String initials = "" + name.charAt(0) + surname.charAt(0);
        // we start at 0 therefore c = 0   l = 1    i = 2 ect...
        char c = 'C';
        // you can save it in a char but you can not add any more therefore you use 
        // a string when wanting initials as you need both name and surname
        // name.charAt(0) + surname.charAt(0) the reason it is 0 is because the c = 0 and b = 0

        
        // Swich case
        var mark = 5;
        char s = 'A';
        mark = mark / 10;

        switch (mark) {

            case 8:
            case 9:
            case 10:
                s = 'A';
                break;

            case 7:
                s = 'B';
                break;
            case 6:
                s = 'C';
                break;
            case 5:
                s = 'D';
                break;
            case 4:
                s = 'E';
                break;
            default:
                s = 'F';
                break;

        }
    
    }
    
    public static char getSymbol(int mark) {
        // this 

        return 'l';
    }
    
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
}
