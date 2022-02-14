public class Main
{
    public static void main() {
        Scale scale = ScaleInterface.randomScale();
        ScaleInterface sclIntf = new ScaleInterface(scale);
        Keys[] keys = sclIntf.getKeys();
        
        String keysLine = "(";
        for(int i = 0; i < keys.length; i++) {
            keysLine += keys[i];
            if(i != (keys.length - 1))
                keysLine += ", ";
        }
        keysLine += ")";
        
        BPM bpm = new BPM(80, 150);
        System.out.println("BPM: " + bpm.randomBPM() + ", Scale: " + scale + " " + keysLine);
    }
}
