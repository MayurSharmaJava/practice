package junk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class INLINEARRAY {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("m","a","b"));
        List<List<Integer>> test = new ArrayList<>();
        test.add(List.of(1,2,3));
        test.add(List.of(1,2,3));
        test.add(List.of(1,2,3));

        Scanner c = new Scanner(System.in);
        System.out.println(c.next());
    }
}
