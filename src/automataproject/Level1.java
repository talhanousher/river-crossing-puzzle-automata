/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automataproject;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Level1 {

    Scanner sc = new Scanner(System.in);
    int numberOfState;
    char[] charInput;
    int[][] TransitionTable;
    int initialState;
    int[] finalState;

    public Level1() {

        this.numberOfState = 12;
        this.charInput = new char[]{'a', 'b', 'c', 'd'};
        this.initialState = 0;
        this.finalState = new int[]{7};
        this.TransitionTable = new int[][]{
            {10, 1, 10, 10},
            {2, 0, 11, 11},
            {1, 11, 3, 8},
            {10, 4, 2, 11},
            {10, 3, 11, 5},
            {6, 11, 9, 4},
            {5, 7, 11, 11},
            {7, 7, 7, 7},
            {10, 9, 11, 2},
            {10, 8, 5, 11},
            {10, 10, 10, 10},
            {11, 11, 11, 11}
        };
    }

    void validate() {
        int currentState = this.initialState;//
        boolean flag = false;
        while (true) {
            System.out.print("Enter Your Move : ");
            char charCheck = sc.next().charAt(0);
            currentState = transition(currentState, charCheck);
            if (currentState == 1) {
                System.out.println("Current State :  Fox , Beans -----------  Farmer , Goose ");
            } else {
                if (currentState == 2) {
                    System.out.println("Current State :   Farmer , Fox , Beans -----------  Goose ");
                } else {
                    if (currentState == 3) {
                        System.out.println("Current State : Beans ----------- Farmer , Fox , Goose ");
                    } else {
                        if (currentState == 4) {
                            System.out.println("Current State :  Farmer , Beans , Goose  ----------- Fox ");
                        } else {
                            if (currentState == 5) {
                                System.out.println("Current State :   Goose  ----------- Farmer , Beans , Fox ");
                            } else {
                                if (currentState == 6) {
                                    System.out.println("Current State :  Farmer , Goose  ----------- Fox , Beans ");
                                } else {
                                    if (currentState == 7) {
                                        System.out.println("You Won !!");
                                        System.out.println("Current State :   ----------- Farmer , Beans , Goose  Fox ");
                                        break;
                                    } else {
                                        if (currentState == 8) {
                                            System.out.println("Current State :  Fox  ----------- Farmer , Beans , Goose ");
                                        } else {
                                            if (currentState == 9) {
                                                System.out.println("Current State :  Farmer , Fox , Goose  ----------- Beans ");
                                            } else {
                                                if (currentState == 10) {
                                                    System.out.println("You Are Dead !");
                                                    break;
                                                } else {
                                                    if (currentState == 11) {
                                                        System.out.println("Current Move is Impossible");
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("End");
    }

    public int transition(int cs, char ch) {

        int p = 0;//
        for (int i = 0; i < this.charInput.length; i++) {
            if (ch == this.charInput[i]) {
                p = i;
                break;
            }
        }
        return this.TransitionTable[cs][p];
    }

    public void displayFiniteAutomata() {
        System.out.println("Number Of States : " + this.numberOfState);
        System.out.println("Initial State : " + this.initialState);
        System.out.print("Final States : ");
        for (int i = 0; i < this.finalState.length; i++) {
            System.out.print(this.finalState[i] + " , ");
        }
        System.out.println("");
        System.out.println("Transition Table : ");
        for (int i = 0; i < this.TransitionTable.length; i++) {
            for (int j = 0; j < this.TransitionTable[i].length; j++) {
                System.out.print(this.TransitionTable[i][j] + " , ");
            }
            System.out.println("");
        }
    }
}
