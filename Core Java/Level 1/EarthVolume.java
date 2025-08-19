public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double volKm = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double mileRadius = radiusKm / 1.6;
        double volumeMile = (4.0 / 3) * Math.PI * Math.pow(mileRadius, 3);
        System.out.println(
                "The volume of earth in cubic kilometers is " + volKm + " and cubic miles is " + volumeMile);
    }
}
