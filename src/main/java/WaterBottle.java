public class WaterBottle {

    private double volume;

    public WaterBottle(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void drink() {
        this.volume -= 10;
    }
}
