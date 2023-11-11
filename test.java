import java.util.ArrayList;
import java.util.Collections; 
public class test {
    public static void main(String[]args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>(); 
        numbers.add(10);
        numbers.add(18);
        numbers.add(20);
        numbers.add(56);
        numbers.add(30);
        Collections.sort(numbers);
        for(int i = 0; i < numbers.size(); i++)
        {
            System.out.println(numbers.get(i));
        } 


    }    
}



