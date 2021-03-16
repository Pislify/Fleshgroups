package ps.pislify.main;

import static com.raylib.Jaylib.*;
import static ps.pislify.main.PsUtils.*;
public class Window
{
    public static final int window_height = 720 , window_width = 1280;
    public static final String window_title = "Fleshgroups beta";
    static void ps_MakeApp()
    {
        ps_InitApp();
        ps_MainApp();
        ps_EndApp();
    }
    static void ps_InitApp()
    {
        InitWindow(window_width,window_height,window_title);
        SetTargetFPS(25); // TODO : to clean up
    }
    static void ps_MainApp()
    {
        while(!WindowShouldClose())
        {
            BeginDrawing();
            ClearBackground(ps_ut_CreateColor((byte)200,(byte)200,(byte)200,(byte)255));
            EndDrawing();
        }
    }
    static void ps_EndApp(){}
}
