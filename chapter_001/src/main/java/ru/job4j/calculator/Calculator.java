package ru.job4j.calculator;

public class Calculator {
        private double result;

     public void add(double first,double second){
              this.result = first + second;
            }
     public void deduction(double first,double second){
              this.result = first - second;
            }
     public void divide(double first,double second){
              this.result = first/second;
            }
     public void mult(double first,double second){
              this.result = first*second;
            }

     public double getResult(){
        return this.result;
}
}