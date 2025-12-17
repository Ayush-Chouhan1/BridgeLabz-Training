public class VolumeOfEarth {
  public static void main(String[] args) {
    double radiusKm = 6378;
    double pi = 3.14159;
    double volumeKm = (4.0 / 3) * pi * radiusKm * radiusKm * radiusKm;
    double radiusMiles = radiusKm / 1.6;
    double volumeMiles = (4.0 / 3) * pi * radiusMiles * radiusMiles * radiusMiles; 
   
 System.out.println("The volume of earth in cubic kilometers is " +
            volumeKm + " and cubic miles is " + volumeMiles);
  }
}
