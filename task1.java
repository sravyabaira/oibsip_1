import java.util.*;
class TrainReservation
{
	int t1=110;
	int t2=50;
	int tickets;
	void reserve()
	{
		String name,from,destination;
		int Trainnum,amount=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.nextLine();
		System.out.println("Enter Train number");
		Trainnum=sc.nextInt();
		System.out.println("Enter from place");
		from=sc.next();
		System.out.println("Enter destination place");
		destination=sc.next();
		System.out.println("Enter no of tickets");
		tickets=sc.nextInt();
			switch(Trainnum)
			{
				case 123:
					amount=tickets*30;
					if(tickets<t1)
					{
						t1=t1-tickets;
						System.out.println("Your "+tickets+"Tickets are confirmed");
						System.out.println("Amount"+amount);
						break;
					}
					else
					{
						System.out.println("Tickets not available");
					}
					
				case 321:
					amount=tickets*50;
					if(tickets<t2)
					{
						t2=t2-tickets;
						System.out.println("Your "+tickets+"Tickets are confirmed");
						System.out.println("Amount"+amount);
						break;
					}
					else
					{
						System.out.println("Tickets not available");
					}
				
			}
		}
	void cancel()
	{
		String name;
		int Trainnum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.nextLine();
		System.out.println("Enter Train number");
		Trainnum=sc.nextInt();
		switch(Trainnum)
		{
			case 123:
				t1=t1+tickets;
				System.out.println("Tickets are concelled");
				break;
			case 321:
				t2=t2+tickets;
				System.out.println("Tickets are concelled");
				break;	
		}
	}
}
class main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		TrainReservation t=new TrainReservation();
		int id[]=new int[5];
		int password[]=new int[5];
		id[0]=23457;
		password[0]=1234;
		id[1]=34357;
		password[1]=1445;
		id[2]=46257;
		password[2]=3674;

		int id1,password1;
		System.out.println("Enter your Id: ");
		id1=sc.nextInt();
		System.out.println("Enter your password: ");
		password1=sc.nextInt();
		int f=0;
		for(int i=0;i<5;i++)
		{
			if(id1==id[i] && password1==password[i])
			{
				f=1;
				break;
			}
			else
			{
				f=0;
			}
		}
		if(f==0)
				System.out.println("invalid login!!");
			else
			{
				System.out.println("you are successfully logged in!!!");
				int s=1;
				while(s==1)
				{
					int opt;
					System.out.println("Enter your option");
					System.out.print("1.Reserve\n2.cancel\n");
					opt=sc.nextInt();
					switch(opt)
					{
						case 1:
							t.reserve();
							break;
						case 2:
							t.cancel();
							break;
					}
				}
			}
	}						
}