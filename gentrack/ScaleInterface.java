
import java.util.Random;

public class ScaleInterface
{
    private Keys[] scl;
    public ScaleInterface(Scale scale) {
        switch (scale) {
            case C_Maj:
                scl = new Keys[]{Keys.C, Keys.D, Keys.E, Keys.F, Keys.G, Keys.A, Keys.B};
                break;
            case Cs_Maj:
                scl = new Keys[]{Keys.Cs, Keys.Ds, Keys.F, Keys.Fs, Keys.Gs, Keys.As, Keys.C};
                break;
            case D_Maj:
                scl = new Keys[]{Keys.C, Keys.E, Keys.Fs, Keys.G, Keys.A, Keys.B, Keys.Cs};
                break;
            case Ds_Maj:
                scl = new Keys[]{Keys.C, Keys.E, Keys.Fs, Keys.G, Keys.A, Keys.B, Keys.Cs};
                break;
            case E_Maj:
                scl = new Keys[]{Keys.E, Keys.Fs, Keys.Gs, Keys.A, Keys.B, Keys.Cs, Keys.Ds};
                break;
            case F_Maj:
                scl = new Keys[]{Keys.F, Keys.G, Keys.A, Keys.As, Keys.C, Keys.D, Keys.E};
                break;
            case Fs_Maj:
                scl = new Keys[]{Keys.Fs, Keys.Gs, Keys.As, Keys.B, Keys.Cs, Keys.Ds, Keys.F};
                break;
            case G_Maj:
                scl = new Keys[]{Keys.G, Keys.A, Keys.As, Keys.C, Keys.D, Keys.E, Keys.Fs};
                break;
            case Gs_Maj:
                scl = new Keys[]{Keys.Gs, Keys.As, Keys.C, Keys.Cs, Keys.Ds, Keys.F, Keys.G};
                break;
            case A_Maj:
                scl = new Keys[]{Keys.A, Keys.B, Keys.Cs, Keys.D, Keys.E, Keys.Fs, Keys.Gs};
                break;
            case As_Maj:
                scl = new Keys[]{Keys.As, Keys.C, Keys.D, Keys.Ds, Keys.F, Keys.G, Keys.A};
                break;
            case B_Maj:
                scl = new Keys[]{Keys.B, Keys.Cs, Keys.Ds, Keys.E, Keys.Fs, Keys.Gs, Keys.As};
                break;
            case A:
                scl = new Keys[]{Keys.A, Keys.B, Keys.C, Keys.D, Keys.E, Keys.F, Keys.G};
                break;
            case As:
                scl = new Keys[]{Keys.As, Keys.C, Keys.Cs, Keys.Ds, Keys.F, Keys.Fs, Keys.Gs};
                break;
            case B:
                scl = new Keys[]{Keys.B, Keys.Cs, Keys.D, Keys.E, Keys.Fs, Keys.G, Keys.A};
                break;
            case C:
                scl = new Keys[]{Keys.C, Keys.D, Keys.Ds, Keys.F, Keys.G, Keys.Gs, Keys.As};
                break;
            case Cs:
                scl = new Keys[]{Keys.Cs, Keys.Ds, Keys.E, Keys.Fs, Keys.Gs, Keys.A, Keys.B};
                break;
            case D:
                scl = new Keys[]{Keys.D, Keys.E, Keys.F, Keys.G, Keys.A, Keys.As, Keys.C};
                break;
            case Ds:
                scl = new Keys[]{Keys.Ds, Keys.F, Keys.Fs, Keys.Gs, Keys.As, Keys.B, Keys.Cs};
                break;
            case E:
                scl = new Keys[]{Keys.E, Keys.Fs, Keys.G, Keys.A, Keys.B, Keys.C, Keys.D};
                break;
            case F:
                scl = new Keys[]{Keys.F, Keys.G, Keys.Gs, Keys.As, Keys.C, Keys.Cs, Keys.Ds};
                break;
            case Fs:
                scl = new Keys[]{Keys.Fs, Keys.Gs, Keys.A, Keys.B, Keys.Cs, Keys.D, Keys.E};
                break;
            case G:
                scl = new Keys[]{Keys.G, Keys.A, Keys.As, Keys.C, Keys.D, Keys.Ds, Keys.F};
                break;
            case Gs:
                scl = new Keys[]{Keys.Gs, Keys.As, Keys.B, Keys.Cs, Keys.Ds, Keys.E, Keys.Fs};
                break;
        }
    }
    
    public Keys[] getKeys() {
        return scl;
    }
    
    public static Scale randomScale() {
        int pick = new Random().nextInt(Scale.values().length);
        return Scale.values()[pick];
    }
}
