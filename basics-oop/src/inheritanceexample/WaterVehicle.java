package inheritanceexample;

public class WaterVehicle extends Vehicle{
    public void travelOnWater(){
        System.out.println("these vehicle travels on water");
    }
    @Override
    public void start() {
        System.out.println("Water vehicle started");
    }

    @Override
    public void stop() {
        System.out.println("Water vehicle stopped");
    }

    @Override
    public void fuel() {
        System.out.println("Water vehicle is fueled");
    }
}
