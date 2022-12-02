import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random =new Random();
        ArrayList<ArrayList<Integer>> integers=new ArrayList<>();
        ArrayList<Integer>evenNumber=new ArrayList<>();
        ArrayList<Integer>exactNumber=new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int number= random.nextInt(1,100);
            if (number%2==0){
                exactNumber.add(number);
            }
            else {
                evenNumber.add(number);
            }
        }
        integers.add(exactNumber);
        integers.add(evenNumber);
        System.out.println(integers);
        System.out.println("exactNumber = " + exactNumber);
        System.out.println("evenNumber = " + evenNumber);
    }
}