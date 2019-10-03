// Program for BufferedReader
import java.io.*;

class BufferedReaderDemo{
	public static void main(String[] args) {
		String text;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
		text = br.readLine();
		System.out.println(text);
	}catch(Exception e){
		System.out.println(e);
	}
	}
}                                           