package seminari.seminar2;

public class Control {
    public static void run() {
        
        int min = -9;
        int max = 9;
        int size = 12;

        int[] arrayFirst = Module.CreatArray(min, max, size);
        int[] result = Module.AmountValues(arrayFirst);
        View.ShowArray(arrayFirst);
        View.ShowResult(result);
    
    }
}