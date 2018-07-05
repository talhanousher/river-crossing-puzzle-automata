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
public class Level2 {

    int numberOfState;
    char[] charInput;
    int[][] TransitionTable;
    int initialState;
    int[] finalState;
    Scanner sc = new Scanner(System.in);

    public Level2() {
        this.numberOfState = 23;
        this.charInput = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};
        this.initialState = 0;
        this.finalState = new int[]{13};
        this.TransitionTable = new int[][]{
            {22, 22, 14, 15, 16, 1},
            {21, 21, 21, 21, 2, 0},
            {15, 22, 22, 22, 1, 3},
            {21, 21, 21, 21, 4, 2},
            {22, 5, 22, 21, 3, 21},
            {22, 4, 21, 6, 22, 22},
            {22, 17, 7, 5, 22, 22},
            {22, 18, 6, 8, 22, 22},
            {22, 9, 21, 7, 21, 21},
            {22, 8, 22, 21, 10, 21},
            {21, 21, 21, 21, 9, 11},
            {19, 22, 22, 22, 12, 10},
            {21, 21, 21, 21, 11, 13},
            {13, 13, 13, 13, 13, 13},
            {20, 21, 0, 21, 22, 21},
            {2, 21, 21, 0, 21, 21},
            {21, 21, 21, 21, 0, 21},
            {22, 6, 21, 22, 21, 21},
            {22, 7, 21, 22, 21, 21},
            {11, 21, 21, 13, 21, 21},
            {14, 22, 21, 22, 21, 21},
            {21, 21, 21, 21, 21, 21},
            {22, 22, 22, 22, 22, 22}
        };
    }

    void validate() {
        int currentState = this.initialState;//
        while (true) {
            System.out.print("Enter Your Move : ");
            char charCheck = sc.next().charAt(0);
            currentState = transition(currentState, charCheck);
            if (currentState == 1) {
                System.out.println("Current State : Human , Human , Human , Small Monkey  <-------- Big Monkey , Small Monkey ");
            } else {
                if (currentState == 2) {
                    System.out.println("Current State : Human , Human , Human , Big Monkey , Small Monkey  --------> Small Monkey ");
                } else {
                    if (currentState == 3) {
                        System.out.println("Current State : Human , Human , Human  <-------- Big Monkey , Small Monkey , Small Monkey ");
                    } else {
                        if (currentState == 4) {
                            System.out.println("Current State : Human , Human , Human , Big Monkey   -------->  Small Monkey , Small Monkey ");
                        } else {
                            if (currentState == 5) {
                                System.out.println("Current State : Human , Big Monkey   <-------- Human , Human , Small Monkey , Small Monkey ");
                            } else {
                                if (currentState == 6) {
                                    System.out.println("Current State : Human , Human , Big Monkey , Small Monkey  --------> Human , Small Monkey ");
                                } else {
                                    if (currentState == 7) {
                                        System.out.println("Current State : Human , Small Monkey  <-------- Human , Human , Big Monkey , Small Monkey ");
                                    } else {
                                        if (currentState == 8) {
                                            System.out.println("Current State : Human , Human , Small Monkey ,, Small Monkey  --------> Human ,  Big Monkey ");
                                        } else {
                                            if (currentState == 9) {
                                                System.out.println("Current State : Small Monkey , Small Monkey  <--------  Human , Human , Human ,  Big Monkey ");
                                            } else {
                                                if (currentState == 10) {
                                                    System.out.println("Current State : Small Monkey , Small Monkey ,   Big Monkey -------->  Human , Human , Human ");
                                                } else {
                                                    if (currentState == 11) {
                                                        System.out.println("Current State : Small Monkey <-------- Human , Human , Human , Big Monkey , Small Monkey");
                                                    } else {
                                                        if (currentState == 12) {
                                                            System.out.println("Current State : Big Monkey , Small Monkey --------> Human , Human , Human , Small Monkey");
                                                        } else {
                                                            if (currentState == 13) {
                                                                System.out.println("You Won !");
                                                                System.out.println("Current State :  -------- Human , Human , Human , Big Monkey , Small Monkey , Small Monkey");
                                                                break;
                                                            } else {
                                                                if (currentState == 14) {
                                                                    System.out.println("Current State : Human , Human , Small Monkey , Small Monkey <-------- Human , Big Monkey");
                                                                } else {
                                                                    if (currentState == 15) {
                                                                        System.out.println("Current State : Human , Human , Big Monkey , Small Monkey <-------- Human , Small Monkey");
                                                                    } else {
                                                                        if (currentState == 16) {
                                                                            System.out.println("Current State : Human , Human , Human , Small Monkey , Small Monkey <-------- Bog Monkey");
                                                                        } else {
                                                                            if (currentState == 17) {
                                                                                System.out.println("Current State : Big Monkey , Small Monkey <-------- Human , Human , Human , Small Monkey");
                                                                            } else {
                                                                                if (currentState == 18) {
                                                                                    System.out.println("Current State : Human , Human , Human , Small Monkey --------> Big Monkey , Small Monkey");
                                                                                } else {
                                                                                    if (currentState == 19) {
                                                                                        System.out.println("Current State : Human , Small Monkey --------> Human , Human , Big Monkey , Small Monkey");
                                                                                    }
                                                                                    if (currentState == 20) {
                                                                                        System.out.println("Current State : Human , Human , Human , Small Monkey , Small Monkey --------> Big Monkey");
                                                                                    } else {
                                                                                        if (currentState == 21) {
                                                                                            System.out.println("This is Imposiible Move");
                                                                                            break;
                                                                                        } else {
                                                                                            if (currentState == 22) {
                                                                                                System.out.println("You Are Dead");
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
