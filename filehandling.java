import java.io.*;
import java.util.*;
class FileHndling 
{
    String empName;
    void accept()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter name");
        empName=br.readLine();
    }
    public void write() 
    {
        try
        {
            FileOutputStream fos=new FileOutputStream("Employee");
            DataOutputStream dos=new DataOutputStream(fos);
            dos.writeChars(empName);
            dos.close();
        }
        catch(IOException  e){}
    }
    public void readData()throws IOException
    {
        FileInputStream fis=new FileInputStream("Employee");
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);
        String str;
        while((str=br.readLine())!=null)
        {
            System.out.println(str);
        }
        br.close();
    }
    public static void main(String a[])throws IOException
    {
        FileHndling obj1=new FileHndling();
        obj1.accept();
        obj1.write();
        obj1.readData();   
    }
}
