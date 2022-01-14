package lists;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;


class ListofListTest {
    @BeforeAll
    static void init(){
        System.out.println("....Start....");
        ListofList listofList = new ListofList();
    }

    @Test
    public void testList(){
        List<List<Integer>> listOfIntegers= new ArrayList<>();
        List<Integer> l1 = Arrays.asList(1,2,3,4);
        List<Integer> l2 = Arrays.asList(6,7,8,9);
        listOfIntegers.add(l1);
        listOfIntegers.add(l2);
        assertEquals(4,listOfIntegers.get(0).size());

       assertEquals(ListofList.getOneList(listOfIntegers).size(),8);    }

}