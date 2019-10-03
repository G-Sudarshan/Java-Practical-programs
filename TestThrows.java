// Program for Throws keyword

import java.io.*;

class M{
	void method() throws IOException{
		throw new IOException("device error");
	}

}

class TestThrows{
	public static void main(String[] args) {
		try{
			M m1 = new M();
			m1.method();
		}catch(Exception e){
			System.out.println("exception handled" + e);
		}
		System.out.println("Rest code");
	}
}