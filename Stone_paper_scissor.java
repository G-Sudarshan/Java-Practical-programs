/**

* @author : 176114
* @version :1.2

*/

import java.util.Scanner; 
import java.lang.Math; 

class Stone_paper_scissor
{
	void play()
	{
		Scanner sc = new Scanner(System.in);
		String playerchoice; 
		int pc=0;
		int systemchoice;
		int playerscore=0;
		int systemscore=0;

		for(int i = 0 ; i < 3 ; i++)
		{
		System.out.println("Play..... Type your choice stone , paper or scissor : ");  
            playerchoice = sc.nextLine();
            switch(playerchoice)
            {
            	case "stone" : pc = 1;
            	break;
            	case "paper" : pc = 2;
            	break;
            	case "scissor" : pc = 3;
            	break;
            }

            systemchoice =(int) ((Math.random() * 10) % 3 + 1);

            switch(systemchoice)
            {
            	case 1 : System.out.println("System played : stone");
            	break;
            	case 2 : System.out.println("System played : paper");
            	break;
            	case 3 : System.out.println("System played : scissor");
            	break;
            }

            if(pc == systemchoice)
            {
            	continue;
            }

            if( ( (pc==1) && (systemchoice==3) ) || ( (pc==2) && (systemchoice==1) ) || ( (pc==3) && (systemchoice==2) ) )
           {
           	  playerscore++;

            }
            else
            {
            	systemscore++;
            }




		}

		if(playerscore>systemscore)
		{
			System.out.println("You win, Congratulations!");
		}
		else if(playerscore==systemscore)
		{
			System.out.println("tie");

		}
		else
		{
			System.out.println("System Win");
		}
	}

	public static void main(String[] args) 
	{
		Stone_paper_scissor obj = new Stone_paper_scissor();
        
		obj.play();
		
	}
}
