package inheritanceexample;

public class RoadVehicle extends Vehicle{
    public void travelOnRoad(){
        System.out.println("these vehicle travels on road");
    }
    @Override
    public void start() {
        System.out.println("Road vehicle started");
    }

    @Override
    public void stop() {
        System.out.println("Road vehicle stopped");
    }

    @Override
    public void fuel() {
        System.out.println("Road vehicle is fueled");
    }
}
