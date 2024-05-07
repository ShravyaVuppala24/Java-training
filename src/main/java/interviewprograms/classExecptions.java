package interviewprograms;

class Get
{
    public void getData()
    {
        Extract ex = new Extract();
        try
        {
            ex.extractData();
        }
        catch(Exception e)
        {
            throw e;
        }
    }
}

class Extract
{
    public void extractData()
    {
        Read re = new Read();
        try
        {
            re.readData();
        }
        catch(Exception e)
        {
            throw e;
        }
    }
}

class Read
{
    public void readData()
    {
        String s = null;
        try
        {
            System.out.println(s.length());
        }
        catch(NullPointerException e)
        {
            throw e;
        }
    }
}
public class classExecptions {
    public static void main(String args[])
    {
        Get g = new Get();
        try
        {
            g.getData();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }


}
