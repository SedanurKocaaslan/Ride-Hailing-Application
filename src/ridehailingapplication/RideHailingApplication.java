
package ridehailingapplication;
import java.util.ArrayList;
public class RideHailingApplication {

    public static void main(String[] args) {
       
        ArrayList<Ride> rides = new ArrayList<>();

        
        Ride ride1 = new Ride("Ahmet Yılmaz", "Kızılay", "Tunalı", 10.5, 20, 15.0);
        EconomyRide ride2 = new EconomyRide("Ayşe Demir", "Bahçelievler", "AŞTİ", 5.0, 10, 10.0, 2.0);
        PremiumRide ride3 = new PremiumRide("Mehmet Kaya", "Çankaya", "İncek", 25.0, 30, 20.0, 100.0, 1.5);
        SharedRide ride4 = new SharedRide("Zeynep Çelik", "Eryaman", "Söğütözü", 15.0, 25, 12.0, 1.5, 3);

        rides.add(ride1);
        rides.add(ride2);
        rides.add(ride3);
        rides.add(ride4);

        System.out.println("--- YOLCULUK ÜCRET HESAPLAMA SİSTEMİ ---");
        
       
        for (Ride r : rides) {
            System.out.println(r.toString());
            System.out.println("Hesaplanan Ücret: " + r.calculateFare() + " TL");
            System.out.println("--------------------------------------------------");
        }
    }
}