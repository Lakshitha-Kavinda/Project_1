import java.io.*;
import java.util.ArrayList;

public class Test{

    public static void main(String args[]){
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(5);
        array.add(3);
        array.add(6);

        for (int i : array){
            System.out.println(i);
        }
    }

}