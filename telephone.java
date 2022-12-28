import java.io.File;
import java.sql.*;
class telephone
{
    String db = "\\Telephone.accdb";
    void connectdb()
    {
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess//Z:\\Syllabus and Papers\\JP\\Projects\Telephone Dir\\Telephone.accdb");
            System.out.println("Connection succcesful");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) 
    {
        telephone t = new telephone();
        t.connectdb();    
    }
}
