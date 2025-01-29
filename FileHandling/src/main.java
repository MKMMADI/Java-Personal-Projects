import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileInputStream IF = new FileInputStream(new File("note.txt")))
		{
			//char[] phrase = new char[100];
			int count = -1;
			StringBuilder sb = new StringBuilder();
			while((count = IF.read())!=-1)
			{
				sb.append((char)count);
				
			}
			System.out.println(sb.toString());
			
			IF.close();
			
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		
				
		try(FileOutputStream Write = new FileOutputStream(new File("note.txt"),true))
		{
			DataOutputStream DataOut= new DataOutputStream(Write);
			DataOut.writeUTF("Goodbye");
			DataOut.close();
			Write.close();
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		/*try(FileWriter FW = new FileWriter(new File("Note.txt"),true))
		{
			FW.write("GoodBye");;
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}*/
	}

}
