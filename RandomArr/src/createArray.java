import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ghjiang on 2017-10-12.
 */
public class createArray {
    public static void main(String[] args){
        getIntArray();
    }

    private static void getIntArray(){
        int number = -1;
        int lastNumber = -1;
        int tempValue = 101;

        List<Integer> listInt = new ArrayList<Integer>();
        Random rand = new Random();
        long start = System.currentTimeMillis();
        do{
            if(listInt.isEmpty()) {
                listInt.add(0);
            }
            else{
                lastNumber = listInt.get(listInt.size() - 1);
                number = Math.abs(rand.nextInt()) % tempValue + lastNumber;
                System.out.println(number);

                if(number > (lastNumber + 1)){
                    listInt.add(number);
                }
            }

        }while(listInt.size() < 1000);
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
