public class Consume extends Thread {
    TrafficLights red;
    TrafficLights green;
    int date;

    public Consume(TrafficLights r, TrafficLights g)
    {
        red = r;
        green = g;
    }

    public void run()
    {
        while(true)
        {
            red.P();
            date = UsingTrafficLights.buffer;
            System.out.println("Date: " + date);
            green.V();
        }
    }
}
