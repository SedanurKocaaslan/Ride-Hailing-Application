
package ridehailingapplication;

public class SharedRide extends EconomyRide {
    private int passengerCount;

   
    public SharedRide(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm, double pricePerMinute, int passengerCount) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm, pricePerMinute);

        if (passengerCount >= 1 && passengerCount <= 4) {
            this.passengerCount = passengerCount;
        } else {
            System.out.println("Uyarı: Yolcu sayısı 1 ile 4 arasında olmalıdır! Varsayılan olarak 1 atandı.");
            this.passengerCount = 1;
        }
    }

    public int getPassengerCount() {
        return passengerCount;
    }

  
    @Override
    public double calculateFare() {

        double economyFare = super.calculateFare();
        
       
        double farePerPerson = economyFare / passengerCount;
        return farePerPerson * 1.10;
    }

    
    @Override
    public String toString() {
        return "[Shared Ride] " + super.toString() + ", Yolcu Sayısı: " + passengerCount;
    }
}
