
import com.zeroc.demos.IceStorm.clock.Weather.*;

class MonitorI implements Monitor
{
    @Override
    public void report(Measurement m, com.zeroc.Ice.Current curr)
    {
        System.out.println(
            "Measurement report:\n" +
            "  Tower: " + m.tower + "\n" +
            "  W Spd: " + m.windSpeed + "\n" +
            "  W Dir: " + m.windDirection + "\n" +
            "   Temp: " + m.temperature + "\n");
    }
}