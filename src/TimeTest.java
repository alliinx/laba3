import java.util.Collection;
import java.util.List;
import java.util.Set;
public class TimeTest {

    public static int ITERATIONS  = 100000;

    public static long testAddToCollection(Collection<Integer> collection){
        long startTime = System.currentTimeMillis();

        for ( int i=0; i<ITERATIONS; i++){
            collection.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;

    }

    public static long testGetFromCollection(List<Integer> collection){
        long startTime = System.currentTimeMillis();

        for ( int i=0; i<ITERATIONS; i++){
            collection.get(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;

    }

    public static long testDeleteFromCollection(List<Integer> collection){


        long startTime = System.currentTimeMillis();

        for ( int i=ITERATIONS-1; i>0; i--){
            collection.remove(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;

    }
}
