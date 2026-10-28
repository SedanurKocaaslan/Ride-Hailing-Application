
package ridehailingapplication;
public class PremiumRide extends Ride {
    private double comfortFee;
    private double surgeMultiplier;

    public PremiumRide(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm, double comfortFee, double surgeMultiplier) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.comfortFee = comfortFee;

        if (surgeMultiplier >= 1.0 && surgeMultiplier <= 3.0) {
            this.surgeMultiplier = surgeMultiplier;
        } else {
            System.out.println("Uyarı: Yoğunluk çarpanı (surgeMultiplier) 1.0 ile 3.0 arasında olmalıdır! Varsayılan olarak 1.0 atandı.");
            this.surgeMultiplier = 1.0;
        }
    }

    public double getComfortFee() {
        return comfortFee;
    }

    public double getSurgeMultiplier() {
        return surgeMultiplier;
    }

   
    @Override
    public double calculateFare() {
        double baseFare = super.calculateFare();
        return (baseFare + comfortFee) * surgeMultiplier;
    }

   
    @Override
    public String toString() {
        return "[Premium Ride] " + super.toString() + ", Konfor Ücreti: " + comfortFee + ", Çarpan: " + surgeMultiplier;
    }
}