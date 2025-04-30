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
        return (message.length()/width)+1; // the length dividided by width gives # of full lines but add 1 for wtv is leftover
    }

    public String getLines()
    {
        return null;
    }
}
