package seminari.seminar2;

import java.util.Random;

public class Module {
    public static int[] CreatArray(int min, int max, int size) {
        int[] array = new int[size];
        Random random = new Random();
        
        for(int i = 0; i < size; i++){
            array[i] = random.ints(min, max).findFirst().getAsInt();
        }
        return array;
    }
    
    public static int[] AmountValues(int[] array){
        int[] result = new int[2];
        for (int i = 0; i < 12; i++) {
            if(array[i] >= 0) result[0] += array[i];
            else result[1] += array[i];            
        }
        return result;
    }
}
