package ps.pislify.main;

import java.util.ArrayList;

public class PsPerson
{
    public String name;
    public int id;
    public ArrayList<PsPerson> freinds = new ArrayList<PsPerson>();
    public ArrayList<PsPerson> blocked = new ArrayList<PsPerson>();

    public PsPerson(String _name,int _id)
    {
        id = _id;
        name=_name;
    }
}
