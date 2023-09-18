public class Car {
    final Engine engine;
    final Wheel[] wheels;
    final Battery battery;

    public Car() {
        engine = new Engine();
        wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
        battery = new Battery();
    }

    void startCar() {
        engine.start();
        for (Wheel wheel : wheels) {
            wheel.rotate();
        }
        battery.charge();
        System.out.println("Car started");
    }
}
