

interface ElectricVehicle {
    void EV();
}

interface GasolineVehicle {
    void GV();
}

class HybridVehicle implements ElectricVehicle, GasolineVehicle {
	@Override
    public void EV() {
        System.out.println("Electric Vehicles Are Battery Operated.");
        System.out.println("Electric Vehicles Don't Require Petrol.");
    }
    @Override
    public void GV() {
        System.out.println("Gasoline Vehicles Are CNG Operated.");
        System.out.println("Gasoline Vehicles Don't Require Petrol.");
    }
    
    void HV() {
        System.out.println("Hybrid Vehicles Are Battery Operated.");
        System.out.println("Hybrid Vehicles Are Also Petrol Operated.");
        System.out.println("Hybrid Vehicles Consume Less Petrol.");
    }
}

public class OOPsVehicle1 {
    public static void main(String[] args) {
        HybridVehicle obj = new HybridVehicle();
        obj.HV();
        obj.GV();
        obj.EV();
    }
}
