/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automataproject;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class AutomataProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        FiniteAutomata fa = new FiniteAutomata();
//        fa.validate();
//        GameUI form = new GameUI();
//        form.setVisible(true);
//        form.setSize(1000,600);
        Scanner sc = new Scanner(System.in);
        System.out.println("Press '1' for Level 1");
        System.out.println("Press '2' for Level 2");
        int levelChoice = sc.nextInt();
        if (levelChoice == 1) {
            Level1 l1 = new Level1();
            System.out.println("Instructions");
            System.out.println("If Fox and Goose are on Either side without Farmer Fox Will Eat Goose");
            System.out.println("If Goose and Beans are on Either side without Farmer Goose Will Eat Bean");
            System.out.println("Safely take All to Other Side");
            System.out.println("Current State :  Farmer , Fox , Goose , Beans ----------- ");
            System.out.println("Moves Allowed : ");
            System.out.println("'a' to move Farmer");
            System.out.println("'b' to move Farmer along with Gosse");
            System.out.println("'c' to move Farmer along with Fox");
            System.out.println("'d' to move Farmer along with Beans");
            l1.validate();
        } else {
            if (levelChoice == 2) {
                Level2 l2 = new Level2();
                System.out.println("Instruction");
                System.out.println("Only Human and Big Monkey can row a boat");
                System.out.println("Boat has a Max Capacity Of 2 of any type");
                System.out.println("If the number of monkeys are exceeds than Human on either side then Monkeys will eat Humans");
                System.out.println("Current State : Human , Human , Human , Big Monkey , Small Monkey , Small Monkey --------  ");
                System.out.println("Moves Allowed : ");
                System.out.println("'a' for a Human");
                System.out.println("'b' for two Humans");
                System.out.println("'c' for Human and Bog Monkey");
                System.out.println("'d' for Human and Small Monkey");
                System.out.println("'e' for Big Monkey Only");
                System.out.println("'f' for Big Monkey and Small Monkey");
                
                l2.validate();
            }
        }
//        fa.displayFiniteAutomata();
    }

}
