// Program for FileOutputStream

import java.io.*;

class FileOutputStreamDemo{
	public static void main(String[] args) {
		try{
			FileOutputStream fout = new FileOutputStream("abc.txt");
			String s = "Sachin is a very great cricket player";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("done");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}