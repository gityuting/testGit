package demo;

import java.util.ArrayList;

public class Demo {
    public  void main(String[] args) {
        ArrayList<Integer> strings = new ArrayList<Integer>();
        strings.add(2);
        strings.add(2214);
        strings.add(91);
        strings.add(2);
        strings.add(0);
        System.out.println("原始：");

       strings.forEach(s-> System.out.print(String.format("% 8d",s)));
        strings.sort(null);
        System.out.println();
        System.out.println("排序后：");
        strings.forEach(s-> System.out.print(String.format("% 8d",s)));

    }


}
