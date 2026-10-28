
package ridehailingapplication;

public class EconomyRide extends Ride {
    private double pricePerMinute;

    
    public EconomyRide(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm, double pricePerMinute) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        
        if (pricePerMinute > 0) {
            this.pricePerMinute = pricePerMinute;
        } else {
            System.out.println("Uyarı: Dakika başı ücret pozitif olmalıdır! Varsayılan olarak 1.0 atandı.");
            this.pricePerMinute = 1.0;
        }
    }

    public double getPricePerMinute() {
        return pricePerMinute;
    }

    
    @Override
    public double calculateFare() {
        double baseFare = super.calculateFare(); // distanceKm * pricePerKm
        double timeCharge = getDurationMin() * pricePerMinute;
        double total = baseFare + timeCharge;

        
        if (total < 50.0) {
            return 50.0;
        }
        return total;
    }

    
    @Override
    public String toString() {
        return "[Economy Ride] " + super.toString() + ", Dakika Ücreti: " + pricePerMinute;
    }
}