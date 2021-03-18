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
            //TODO : create class to handle ui making
            DrawText("Fleshgroups beta 0.01" + "\t\t max fps(25)   current fps : " + GetFPS() ,0,0,20,WHITE);
            DrawLine(0,30,1280,30,WHITE);
            DrawLine(400,30,400,720,WHITE);
            DrawLine(100,30,100,720,WHITE);
        }
    }
    public void set_DataPack(PsDataPack d)
    {
        pack = d;
    }

}
