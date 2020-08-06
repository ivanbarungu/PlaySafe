package practical;
import java.awt.event.*;
import java.util.*;
import java.io.*;
public class Q1 {
	static int currRand;
	static Random rnd=new Random();
	static final long test=3000;

	public Q1() {
		//currRand=rnd.nextInt(37);
		
		
		
	}
	public void runTimer() {
		new Thread() {
			public void run() {
				while(true)
				{
					currRand=rnd.nextInt(37);
					
					try {
						Thread.sleep(test);
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
	public void playGame() {
		boolean play=true;
		ArrayList<String>name = null;
		BufferedReader reader;
		try {
			reader=new BufferedReader(new FileReader("input.txt"));
			String line=reader.readLine();
			while(line!=null)
			{
				name.add(line);
				line=reader.readLine();
				
			}
			reader.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(name.size());
	}
	public static void main(String[] args) {
		Thread t1=new Thread() {
			public void run() {
				while(true)
				{
					currRand=rnd.nextInt(37);
					try {
						Thread.sleep(test);
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2=new Thread() {
			public void run() {
				boolean play=true;
			ArrayList<String>name=new ArrayList<String>() ;
				BufferedReader reader;
				
				try {
					Scanner inutFile=new Scanner(new File("C://input.txt"));
					while(inutFile.hasNext())
					{
						name.add(inutFile.nextLine());
					}
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				int counter=0;
				int round=1;
				double []total=new double[name.size()];
				boolean keepPlaying=true;
				String choice;
				Scanner input=new Scanner(System.in);
				while(play)
				{
					
					System.out.println("Play a game?(y/n):");
					choice=input.next();
					if(choice.equals("n")) {
						System.out.println("Thank you for playing");
						t1.stop();
						break;
					}
					else if(choice.equals("y")) {
						System.out.println("Round "+round);
						String bet[]=new String[2];
						for(int i=0;i<name.size();i++)
						{
							String c;
							
							while(keepPlaying)
							{
							System.out.println(name.get(i)+" place your bet or enter n to stop betting for this round:");
							
							c=input.next();
							bet[0]=c;
							System.out.println("Enter Amount:");
							c=input.next();
							bet[1]=c;
							if(bet[0].equals("n")) {
								break;
							}else {
								
								
								if(bet[0].equals("ODD"))
								{
									double t=0;
									if(currRand%2!=0)
									{
										t=Double.parseDouble(bet[1])*2;
										total[i]+=t;
										System.out.println("Number:"+currRand);
										System.out.println("Player\t\tBet\tOucome\tWinnings");
										System.out.println("-------");
										System.out.println(name.get(i)+"\t"+ bet[0]+"\tWIN\t"+t);
										
									}else {
										t=0;
										total[i]+=t;
										System.out.println("Number:"+currRand);
										System.out.println("Player\t\tBet\tOucome\tWinnings");
										System.out.println("-------");
										System.out.println(name.get(i)+"\t"+ bet[0]+"\tLOSE\t"+t);
										
										
									}
								}
								else if(bet[0].equals("EVEN"))
								{
									double t=0;
									if(currRand%2==0)
									{
										t=Double.parseDouble(bet[1])*2;
										total[i]+=t;
										System.out.println("Number:"+currRand);
										System.out.println("Player\tBet\tOucome\tWinnings");
										System.out.println("-------");
										System.out.println(name.get(i)+"\t"+ bet[0]+"\tWIN\t"+t);
										
									}else {
										t=0;
										total[i]+=t;
										System.out.println("Number:"+currRand);
										System.out.println("Player\tBet\tOucome\tWinnings");
										System.out.println("-------");
										System.out.println(name.get(i)+"\t"+ bet[0]+"\tLOSE\t"+t);
										
										
									}
								}
								else {
									int b=Integer.parseInt(bet[0]);
									if(b==currRand) {
										double t=Double.parseDouble(bet[1])*36;
										total[i]+=t;
										System.out.println("Number:"+currRand);
										System.out.println("Player\t\tBet\tOucome\tWinnings");
										System.out.println("-------");
										System.out.println(name.get(i)+"\t"+ bet[0]+"\tWIN\t"+t);
										
										
									}else {
										double t=Double.parseDouble(bet[1])*0;
										total[i]+=t;
										System.out.println("Number:"+currRand);
										System.out.println("Player\t\tBet\tOucome\tWinnings");
										System.out.println("-------");
										System.out.println(name.get(i)+"\t"+ bet[0]+"\tLOSE\t"+t);
										
									}
								}
							}
								
								
								
							}
						}
						round++;
					}else {
						System.out.println("Invalid input, program terminated");
						t1.stop();
						break;
					}
					
				}
				
			}
		};
		t1.start();
		t2.start();
		

	}

}
