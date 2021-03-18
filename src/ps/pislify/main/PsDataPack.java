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
}
