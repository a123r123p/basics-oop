package inheritanceexample;

public class MainInheritanceClass {
    public static void main(String[] args) {
        System.out.println("------------Vehicle parent class------------------");
        Vehicle v= new Vehicle();
        v.start();
        v.stop();
        v.fuel();
        System.out.println("------------Water Vehicle child class-------------------");
        WaterVehicle w = new WaterVehicle();
        w.start();
        w.stop();
        w.fuel();
        w.travelOnWater();
        System.out.println("------------Road Vehicle child class---------------------");
        RoadVehicle r = new RoadVehicle();
        r.start();
        r.stop();
        r.fuel();
        r.travelOnRoad();
        System.out.println("------------Air Vehicle child class---------------------");
        AirVehicle a = new AirVehicle();
        a.start();
        a.stop();
        a.fuel();
        a.travelOnAir();

    }
}
