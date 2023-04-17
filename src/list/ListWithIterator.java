package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListWithIterator {
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i + 1);
        }

        Iterator <Integer> integerIterator = integerList.iterator();
        while (integerIterator.hasNext()){
            Integer temp = integerIterator.next();
            System.out.println(temp);
        }
    }
}
