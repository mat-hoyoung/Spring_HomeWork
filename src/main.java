public class main {

    public static void main(String[] args) {
        Bus bus = new Bus(30, 20, 1800, 30, 50);

        taxi taxi = new taxi(0, 20, "대구 수성구", 8, 1000, 1);



        bus.TakePassenger();
        bus.gas();
        bus.ChangeVelocity(10);

        System.out.println("---------------------------------------------");

        taxi.PlusVelocity (80);
        taxi.Status (2);
        taxi.AddPerPrice(500);
        taxi.PayPrice();

    }
}
