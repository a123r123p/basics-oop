package inheritanceexample;

public class AirVehicle extends Vehicle{
    public void travelOnAir(){
        System.out.println("these vehicle travels on air");
    }

    @Override
    public void start() {
        System.out.println("Air vehicle started");
    }

    @Override
    public void stop() {
        System.out.println("Air vehicle stopped");
    }

    @Override
    public void fuel() {
        System.out.println("Air vehicle is fueled");
    }
}
