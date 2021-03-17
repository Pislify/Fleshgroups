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
            DrawTexture(pack.ps_gfx_persontexture_def,100,100,WHITE);
        }
    }
    public void set_DataPack(PsDataPack d)
    {
        pack = d;
    }

}
