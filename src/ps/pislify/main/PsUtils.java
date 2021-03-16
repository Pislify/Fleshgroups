package ps.pislify.main;
import static com.raylib.Jaylib.*;

public class PsUtils
{
    static Color ps_ut_CreateColor(byte r,byte g,byte b,byte a)
    {
        Color c = new Color();
        c.a(a);
        c.r(r);
        c.g(g);
        c.b(b);
        return c;
    }
}
