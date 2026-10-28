
package ridehailingapplication;

public class Ride {
    private String passengerName;
    private String pickup;
    private String destination;
    private double distanceKm;
    private int durationMin;
    private double pricePerKm;

    
    public Ride(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        this.passengerName = passengerName;
        this.pickup = pickup;
        this.destination = destination;

        if (distanceKm > 0) {
            this.distanceKm = distanceKm;
        } else {
            System.out.println("Uyarı: Mesafe (distanceKm) pozitif olmalıdır! Varsayılan olarak 1.0 atandı.");
            this.distanceKm = 1.0;
        }

        if (durationMin > 0) {
            this.durationMin = durationMin;
        } else {
            System.out.println("Uyarı: Süre (durationMin) pozitif olmalıdır! Varsayılan olarak 1 atandı.");
            this.durationMin = 1;
        }

        if (pricePerKm > 0) {
            this.pricePerKm = pricePerKm;
        } else {
            System.out.println("Uyarı: Kilometre başına ücret (pricePerKm) pozitif olmalıdır! Varsayılan olarak 1.0 atandı.");
            this.pricePerKm = 1.0;
        }
    }

    
    public String getPassengerName() {
        return passengerName;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    // Ücret Hesaplama Metodu (Base Fare)
    public double calculateFare() {
        return distanceKm * pricePerKm;
    }

    @Override
    public String toString() {
        return "Yolcu: " + passengerName + 
               ", Nereden: " + pickup + 
               ", Nereye: " + destination + 
               ", Mesafe: " + distanceKm + " km" + 
               ", Süre: " + durationMin + " dk";
    }
}