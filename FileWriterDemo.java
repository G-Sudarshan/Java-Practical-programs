// Program for FileWriter

import java.io.*;

class FileWriterDemo{
	public static void main(String[] args) {
		try{
			FileWriter fw = new FileWriter("pqr.txt");
			fw.write("Ganpati Bappa Moraya");
			fw.close();
			System.out.println("done");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}