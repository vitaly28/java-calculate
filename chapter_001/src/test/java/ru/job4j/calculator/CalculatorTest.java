package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
        public void whenDeductionOneMinusThenTwo(){
        Calculator calc2 = new Calculator();
        calc2.deduction(1D, 1D);
        double result = calc2.getResult();
        double expected2 = 0D;
        assertThat(result,is(expected2));
}
public void whenDivideOneDivideThenTwo(){
        Calculator calc3 = new Calculator();
        calc3.deduction(4D, 2D);
        double result = calc3.getResult();
        double expected3 = 2D;
        assertThat(result,is(expected3));
}
public void whenMultOneMultThenTwo(){
        Calculator calc4 = new Calculator();
        calc4.deduction(2D, 2D);
        double result = calc4.getResult();
        double expected4 = 4D;
        assertThat(result,is(expected4));
}
}