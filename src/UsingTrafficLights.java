public class UsingTrafficLights {
    protected static int buffer;
    public static void main(String[] args) {
       TrafficLights red = new TrafficLights(0);
       TrafficLights green = new TrafficLights(1);
       Produce p = new Produce(red, green);
       Consume c = new Consume(red, green);

       p.start();
       c.start();

       System.out.println("Main: Thread terminated");
    }
}
