public class WaterBottle {

    private double volume;

    public WaterBottle(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public boolean drink() {
        if (this.volume >= 10){
            this.volume -= 10;
            return true;
        }
        return false;
    }

    public void empty() {
        this.volume = 0;
    }

    public void fill() {
        this.volume = 100;
    }
}
