package ps.pislify.main;
import static com.raylib.Jaylib.*;
public class PsDataPack
{
    public Texture2D ps_gfx_persontexture_def = new Texture2D();
    String ps_path_gfx_persontexture_def = "img/per.png";
    public Texture2D ps_gfx_bgtexture = new Texture2D();
    String ps_path_gfx_bgtexture = "img/bg.png";
    public PsDataPack()
    {
        ps_gfx_persontexture_def = LoadTexture(ps_path_gfx_persontexture_def);
        ps_gfx_bgtexture = LoadTexture(ps_path_gfx_bgtexture);
    }
    public void PsDrawAllBG()
    {
        PsDrawL1BG();
    }
    public void PsDrawL1BG()
    {
        DrawText("Fleshgroups beta 0.01" + "\t\t max fps(25)   current fps : " + GetFPS() ,0,0,20,WHITE);
        DrawLine(0,30,1280,30,WHITE);
        DrawLine(400,30,400,720,WHITE);
        DrawLine(100,30,100,720,WHITE);
    }
}
