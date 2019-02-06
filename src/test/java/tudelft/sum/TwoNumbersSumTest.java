package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoNumbersSumTest {

    @Test
    public void array_12(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(2);
        ArrayList<Integer> list = twoNumbersSum.addTwoNumbers(a,b);
        Integer result = list.get(0);
        Integer x = 3;
        Assertions.assertEquals(x,result);

    }
    @Test
    public void array_807(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);
        a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(6);
        b.add(5);
        ArrayList<Integer> list = twoNumbersSum.addTwoNumbers(a,b);
        ArrayList<Integer> x= new ArrayList<>();
        x.add(7);
        x.add(0);
        x.add(8);
        Assertions.assertEquals(x,list);

    }
    @Test
    public void array_99(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(9);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(9);
        ArrayList<Integer> list = twoNumbersSum.addTwoNumbers(a,b);
        ArrayList<Integer> x= new ArrayList<>();
        x.add(1);
        x.add(8);
        Assertions.assertEquals(x,list);

    }
}
