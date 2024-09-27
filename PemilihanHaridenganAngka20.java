
import java.util.Scanner;

/**
 * PemilihanHaridenganAngka20
 */
public class PemilihanHaridenganAngka20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dayNumber;
        String dayType;

        System.out.println("Input day number: ");
        dayNumber = sc.nextInt();

        if (dayNumber >= 1&& dayNumber <= 5 ) {
         dayType = "weekday";
        } else if (dayNumber == 6 || dayNumber == 7 ) {
            dayType = "weekend";  
        } else {
            dayType = "invalid dayNumber";
        }
            System.out.println(dayNumber + "is a " + dayType);
        }
    }
