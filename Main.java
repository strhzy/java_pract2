package Mobile.pract;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        System.out.println("Введите долготу первой точки: ");
        double dolg1 = sc.nextDouble();
        System.out.println("Введите широту первой точки: ");
        double shir1 = sc.nextDouble();
        System.out.println("Введите долготу второй точки: ");
        double dolg2 = sc.nextDouble();
        System.out.println("Введите широту второй точки: ");
        double shir2 = sc.nextDouble();
        sc.close();
        shir1 = Math.toRadians(shir1);
        dolg1 = Math.toRadians(dolg1);
        shir2 = Math.toRadians(shir2);
        dolg2 = Math.toRadians(dolg2);
        final double RADIUS = 6371;
        float leng = (float) (RADIUS * 2 * Math.asin(Math.sqrt(Math.pow(Math.sin((dolg2-dolg1)/2), 2) + Math.pow(Math.sin((shir2-shir1)/2), 2) * Math.cos(dolg1) * Math.cos(dolg2))));
        System.out.println("Расстояние между точками "+ leng +" км");
    }
}