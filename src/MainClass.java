import java.util.*;
public class MainClass {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("=====ADD=====");
        System.out.println("---Add elements ( 1kk )");
        System.out.println("test add for arrayList " + TimeTest.testAddToCollection(arrayList));
        System.out.println("test add for linkedList " + TimeTest.testAddToCollection(linkedList));

        if ((TimeTest.testAddToCollection(arrayList)) <= (TimeTest.testAddToCollection(linkedList))) System.out.println("ArrayList is faster");
        else System.out.println(("LinkedList is faster"));

        //замечу, что для большего количества итераций видно, что ArrayList быстрее, чем LinkedList, и это будет верно. Но для такого количества итераций очень долго прогружаются Get и Delete//

        System.out.println("=====GET=====");
        System.out.println("---Get elements ( 1kk )");
        System.out.println("test get for linkedList " + TimeTest.testGetFromCollection(linkedList));
        System.out.println("test get for arrayList " + TimeTest.testGetFromCollection(arrayList));

        if ((TimeTest.testGetFromCollection(arrayList)) <= (TimeTest.testGetFromCollection(linkedList))) System.out.println("ArrayList is faster");
        else System.out.println(("LinkedList is faster"));


        System.out.println("=====DELETE=====");
        System.out.println("---Delete elements ( 1kk )");
        System.out.println("test delete for linkedList " + TimeTest.testDeleteFromCollection(linkedList));
        System.out.println("test delete for arrayList " + TimeTest.testDeleteFromCollection(arrayList));

        if ((TimeTest.testDeleteFromCollection(arrayList)) <= (TimeTest.testDeleteFromCollection(linkedList))) System.out.println("ArrayList is faster");
        else System.out.println(("LinkedList is faster"));


    }
}
