import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[7];
        String[] week = {"Domenica","Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato"};
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.println(array[i]);
        }for (int i = 0; i < array.length; i++) {
            System.out.println(week[i]);
            if (array[i] >= 40 && array[i]<=45){
                System.out.println("nuoto");
            } else if (array[i] >= 20 && array[i] <= 39) {
                System.out.println("tennis");
            } else if (array[i] >= 5 && array[i] <= 19) {
                System.out.println("golf");
            } else if (array[i] <= 4 && array[i] >=-15 ) {
                System.out.println("sciare");
            } else if (array[i] > 45 || array[i] < -15) {
                System.out.println("visitare i nostri negozi!");

            }

        }
    }
}
