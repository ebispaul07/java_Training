package file;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;




public class fileManager {
	
	public static void main(String[] args) {
		
		try {
			FileReader fr=new FileReader("Hell.txt");
			BufferedReader br=new BufferedReader(fr);
			
			String line;
			
			
			while((line=br.readLine())!=null) {
				
				String Operation="";
				int a=0;
				int b=0;
				
				
				
				int spacpos=line.indexOf(' ');
				int apos=line.indexOf("a=");
				int bpos=line.indexOf("b=");
				int compos=line.indexOf(',');
				
				
				Operation=line.substring(0,spacpos);
				
				String aval=line.substring(apos+2,compos);
				String bval=line.substring(bpos+2);
				
				a=Integer.parseInt(aval);
				b=Integer.parseInt(bval);
				
				
				if(Operation.equals("sum")) {
					System.out.println("SUM :"+(a+b));
				}else if(Operation.equals("mul")) {
					System.out.println("MULTIPLICAON :"+(a*b));
				}
				
				
			}
			
			
		}catch(Exception e) {
			System.out.println("An Error Occured...");
		}
		
	}

}
