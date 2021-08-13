public class Car {
    Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }

    public void stop() {
        this.engine.stop();
    }

    public Engine getEngine() {
        return engine;
    }
}
