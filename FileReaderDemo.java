// Program for FileReader
import java.io.*;

class FileReaderDemo{
	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("pqr.txt");
			int i=0;
			while((i=fr.read())!=-1){
				System.out.print((char)i);
			}
			fr.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}