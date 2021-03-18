package ps.pislify.main;
import static com.raylib.Jaylib.*;
import static ps.pislify.main.PsUtils.*;
public class PsFlesh
{
    PsDataPack pack = null;
    public void ps_Flesh()
    {
        if(pack!=null)
        {
            pack.PsDrawAllBG();
        }
    }
    public void set_DataPack(PsDataPack d)
    {
        pack = d;
    }

}
