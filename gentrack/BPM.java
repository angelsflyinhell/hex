import java.util.Random;

public class BPM
{
    private int min;
    private int max;
    
    public BPM(int min, int max) {
        this.min = min;
        this.max = max;
    }
    
    public int randomBPM() {
        return new Random().nextInt(max - min) + min;
    }
}
