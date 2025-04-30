public class Sign
{
    private String message;
    private int width;
    public Sign(String m, int w)
    {
        message = m;
        width=w;
    }

    public int numberofLines()
    {
        int numlines=message.length()/width;
        if (message.length()%width==0) return numlines;
        return numlines+1; // the length dividided by width gives # of full lines but add 1 for wtv is leftover
    }

    public String getLines()
    {
        if (message.length()==0) return null;
        String s="";
        int i=0;
        while (i<message.length()){
            s+=message.substring(i,i+1);
            i++;
            if (i%width==0 && i!=message.length())s+=";";
        }
        return s;
    }
}
