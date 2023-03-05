package zzz;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static Integer[] numberReader(String s){
        StringBuilder numberBuilder = new StringBuilder();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                numberBuilder.append(c);
            }
            else if(numberBuilder.length()>0){
                numbers.add(Integer.parseInt(numberBuilder.toString()));
                numberBuilder = new StringBuilder();
            }
        }
        if(numberBuilder.length()>0){
            numbers.add(Integer.parseInt(numberBuilder.toString()));
        }
        Integer[]numbersAsInt = new Integer[numbers.size()];
        numbers.toArray(numbersAsInt);

        return numbersAsInt;
    }
    public static void main(String[] args) {

        Integer[]i = numberReader("fhsduskef 3888 aksndjka 910 eq 239");
        System.out.println(2);

    }
}
