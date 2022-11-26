package seminari.seminar2;

public class View {

    public static void ShowArray(int[] array) {
        {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ",");                
            }
            System.out.println("]");
        }
    }
    public static void ShowResult(int[] array) {
        System.out.println("Сумма положительных чисел массива равна:" + array[0] + "\n" + "Сумма отрицательных чисел массива равна:" + array[1]);        
    }
    
}
