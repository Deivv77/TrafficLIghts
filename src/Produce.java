public class Produce extends Thread{
    TrafficLights red;
    TrafficLights green;
    int t = 5;
    final int waiting_time = 500;

    public Produce(TrafficLights r, TrafficLights g)
    {
        red = r;
        green = g;
    }
    public void run()
    {
        for(int i=0; i< t ; i++)
        {
            red.P();
            UsingTrafficLights.buffer = i;
            System.out.println("written date  : " + i);
            green.V();
            try
            {
                Thread.sleep(waiting_time);
            }
            catch(Exception e)
            {

            }
            System.out.println("The writing about date is terminated");
        }
    }
}
