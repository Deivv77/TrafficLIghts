public class TrafficLights {
    int value;
    public TrafficLights(int v)
    {
        value = v;
    }

    synchronized public void P()
    {
        while(value == 0)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e) {

            }
        }
        value--;
    }
    synchronized public void V()
    {
        value++;
        notify();
    }
    
}
