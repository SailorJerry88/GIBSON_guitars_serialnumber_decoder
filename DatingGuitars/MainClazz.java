package DatingGuitars;

import java.util.Scanner;

public class MainClazz {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Gibson guitar serial number?");
        String Name = scanner.nextLine();

        System.out.println("Sprawdzam dla " + Name);




        GibsonGuitar Goldtop = new GibsonGuitar("Goldie", 5, 2, 6, 9,
                4, 1, 4, 6) {
        };
        // LesPaul Serial 52694146
        UserGibsonGuitar Burst = new UserGibsonGuitar("Burst",6,2,3,7,
                9,2, 3,9);
        // LesPaul Serial 62379239



        Goldtop.setyear1 ();
        Goldtop.setyear2 ();
        Burst.setyear12 ();
        Burst.setyear22 ();
        System.out.print (Goldtop.name + " was made in 19" + Goldtop.setyear1 ());
        System.out.println (Goldtop.setyear2 ());

        System.out.print (Burst.name + " was made in 19" + Burst.setyear12  ());
        System.out.println (Burst.setyear22 ());



    }



}










