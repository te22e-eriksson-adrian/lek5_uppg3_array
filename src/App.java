import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        String[] rum = {"Du står framför ett Hus, tryck på ENTER  för att gå in i huset.", "Du står i Entren, tryck på ENTER för att gå in i köket.", "Du står i köket, tryck på ENTER för att gå in i allrumet", "Du upptäcktes av en rörelsedetektor, tryck på ENTER för att gömma dig under soffan.", "Du är kvar under soffan, du hittades aldrig eftersom väktaren var slarvig när han/hon letade genom huset. Tryck på ENTER för att avsluta spelet.", "Spelet är slut nu."};
        int steg = 0;
        System.out.println("Detta är ett spel.");
        System.out.println(rum[steg]);
        tangentbord.nextLine();
        steg =steg+1;
        System.out.println(rum[steg]);
        tangentbord.nextLine();
        steg =steg+1;
        System.out.println(rum[steg]);
        tangentbord.nextLine();
        steg =steg+1;
        System.out.println(rum[steg]);
        tangentbord.nextLine();
        steg =steg+1;
        System.out.println(rum[steg]);
        tangentbord.nextLine();
        steg =steg+1;
        System.out.println(rum[steg]);
        tangentbord.close();
    }
}
