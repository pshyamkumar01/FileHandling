import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		File obj = new File("maine");
		obj.mkdir();
		
		if(obj.exists())
		{
			//System.out.println("FOLDER ALREADY EXISTS!");
		}
		else
		{
			
			try {
				obj.createNewFile();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
		
		File ob = new File("maine\\folder1");
		obj.mkdir();
		
		if(ob.exists())
		{
			//System.out.println("FOLDER ALREADY EXISTS!");
		}
		else
		{
			
			try {
				ob.createNewFile();
			} catch (IOException eob) {
			
				eob.printStackTrace();
			}
		}
		
		File ob2 = new File("maine\\folder2");
		obj.mkdir();
		
		if(ob2.exists())
		{
			//System.out.println("FOLDER ALREADY EXISTS!");
		}
		else
		{
			
			try {
				ob2.createNewFile();
			} catch (IOException eob2) {
			
				eob2.printStackTrace();
			}
		}
		
		File ob3 = new File("maine\\birds");
		obj.mkdir();
		
		if(ob3.exists())
		{
			//System.out.println("FOLDER ALREADY EXISTS!");
		}
		else
		{
			
			try {
				ob3.createNewFile();
			} catch (IOException eob3) {
			
				eob3.printStackTrace();
			}
		}
		
		File obj1 = new File("maine\\teja.txt");
		if(obj1.exists())
			{
				//System.out.println("FILE ALREADY EXISTS");
			}
		else
			{
				try {
					obj1.createNewFile();
				} catch (IOException e1) {
			
					e1.printStackTrace();
			}
		}
		
		File obj2 = new File("maine\\manoj.txt");
		if(obj2.exists())
			{
				//System.out.println("FILE ALREADY EXISTS");
			}
		else
			{
				try {
					obj2.createNewFile();
				} catch (IOException e2) {
			
					e2.printStackTrace();
			}
		}
		File obj3 = new File("maine\\sathvik.txt");
		if(obj3.exists())
			{
				//System.out.println("FILE ALREADY EXISTS");
			}
		else
			{
				try {
					obj3.createNewFile();
				} catch (IOException e3) {
			
					e3.printStackTrace();
			}
		}
		File obj4 = new File("maine\\priyanka.txt");
		if(obj4.exists())
			{
				//System.out.println("FILE ALREADY EXISTS");
			}
		else
			{
				try {
					obj4.createNewFile();
				} catch (IOException e4) {
			
					e4.printStackTrace();
			}
		}
		
		File obj5 = new File("maine\\arvindh.txt");
		if(obj5.exists())
			{
				//System.out.println("FILE ALREADY EXISTS");
			}
		else
			{
				try {
					obj5.createNewFile();
				} catch (IOException e5) {
			
					e5.printStackTrace();
			}
		}
		
		File obj6 = new File("maine\\team.txt");
		if(obj6.exists())
			{
				//System.out.println("FILE ALREADY EXISTS");
			}
		else
			{
				try {
					obj6.createNewFile();
				} catch (IOException e6) {
			
					e6.printStackTrace();
			}
		}
		
		File obj7 = new File("maine\\anand.txt");
		if(obj7.exists())
			{
				//System.out.println("FILE ALREADY EXISTS");
			}
		else
			{
				try {
					obj7.createNewFile();
				} catch (IOException e7) {
			
					e7.printStackTrace();
			}
		}
		
		File obj8 = new File("maine\\pavani.txt");
		if(obj8.exists())
			{
				//System.out.println("FILE ALREADY EXISTS");
			}
		else
			{
				try {
					obj8.createNewFile();
				} catch (IOException e8) {
			
					e8.printStackTrace();
			}
		}
		
		File obj9 = new File("maine\\priya.pdf");
		if(obj9.exists())
			{
				//System.out.println("FILE ALREADY EXISTS");
			}
		else
			{
				try {
					obj9.createNewFile();
				} catch (IOException e9) {
			
					e9.printStackTrace();
			}
		}
		
		File obj10 = new File("maine\\anand.doc");
		if(obj10.exists())
			{
				//System.out.println("FILE ALREADY EXISTS");
			}
		else
			{
				try {
					obj10.createNewFile();
				} catch (IOException e10) {
			
					e10.printStackTrace();
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.print("		 							 ");
		System.out.println("W	E	L	C	O	M	E");
		System.out.print("	  						 		 ");
		System.out.println("................................................");
		System.out.println(" ");
		System.out.print("	  						 	");
		System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
		System.out.print("	  						 	");
		System.out.println("THIS	 IS	 THE	 APPLICATION	 FOR	 FILE	 OPERATIONS");
		System.out.print("	  						 	");
		System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		int s=2;
		while(s==2)
		{
		System.out.println("===================================");
		System.out.println("PLEASE CHOOSE THE FOLLOWING OPTIONS");
		System.out.println("===================================");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("FOR RETRIEVING ALL FILES CHOOSE: 1.");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("FOR DOING FILE OPERATIONS CHOOSE: 2.");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("TO LOG OUT PLEASE CHOOSE OPTION: 3.");
		System.out.println(" ");
		System.out.println(" ");
		
		int option = 0;
		try
		{
		 option = input.nextInt();
		}
		catch(Exception to)
		{
			System.out.println("");
		}
		System.out.println(" ");
		System.out.println(" ");
		
		
		switch(option)
		{
		case 1:
			File arr[] = obj.listFiles();
			System.out.println("-----------------------------------------");
			System.out.println("THE FOLLOWING ARE THE FILES IN THE FOLDER");
			System.out.println("-----------------------------------------");
			System.out.println(" ");
			System.out.println();
			for(int i=0; i<arr.length; i++)
			{
				System.out.println(i+1+"). "+arr[i]);
				System.out.println(" ");
			}
			int p =2;
			while(p==2) 
			{
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("IF YOU WANT TO CONTINUE ON FILE OPERATIONS PLEASE PRESS < Y > OR PRESS < N > TO LOGOUT");
			System.out.println("......................................................................................");
			System.out.println(" ");
			System.out.println(" ");
			String y_n = input.next();
			System.out.println();
			System.out.println();
			if(y_n.equals("y")|| y_n.equals("Y"))
			{
				System.out.println();
				System.out.println();
				p=4;
				break;
			}
			else if(y_n.equals("n")|| y_n.equals("N"))
			{
				System.out.print("										  ");
				System.out.println("YOU   CHOOSED   TO   LOGOUT ");
				System.out.print("										 ");
				System.out.print("-----*-----*-----*-----*-----");
				System.out.println(" ");
				System.out.println(" ");
				System.out.print("											     ");
				System.out.println("Bye !!");
				System.out.print("											     ");
				System.out.println("^^^^^^");
				p=4;
				s=4;
				break;
			}
			else
			{
				System.out.print("										  ");
				System.out.println("PLEASE GIVE AN APPROPRIATE ANSWER");
				System.out.print("										  ");
				System.out.println(":):):):):):):):):):):):):):):):):)");
				System.out.println();
				System.out.println();
			}
			}
			break;
		case 2:
			int t=2;
			
			System.out.println("YOU HAVE CHOOSED FOR FILE OPERATIONS");
			System.out.println("------------------------------------");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			
			
			while(t==2)
			{
			System.out.println("====================================");
			System.out.println("PLEASE CHOOSE THE FOLLOWING OPTIONS");
			System.out.println("====================================");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("TO ADD FILE/FOLDER PLEASE CHOOSE: 1.");
			System.out.println(" ");
			System.out.println("TO DELETE THE FILE/FOLDER CHOOSE: 2.");
			System.out.println(" ");
			System.out.println("TO LIST THE FILES BY NAME CHOOSE: 3.");
			System.out.println(" ");
			System.out.println("TO RETURN TO PREVIOUS MENU CHOOSE: 4.");
			System.out.println(" ");
			System.out.println("TO LOG OUT PLEASE CHOOSE OPTION: 5.");
			System.out.println(" ");
			
			int opt = 0;
			
			try
			{
			opt = input.nextInt();
			}
			catch(Exception c)
			{
				System.out.println("");
			}
			System.out.println(" ");
			System.out.println(" ");
			
			switch(opt)
			{
			case 1:
			{
				System.out.println("YOU HAVE CHOSED TO ADD FILE/FOLDER");
				System.out.println("----------------------------------");
				System.out.println(" ");
				System.out.println(" ");
				
				int ab = 10;
				while(ab == 10)
				{
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("IF YOU WANT TO ADD FILE PLEASE PRESS < A > OR PRESS < B > TO ADD FOLDER");
					System.out.println(".......................................................................");
				
				System.out.println(" ");
				System.out.println(" ");
				
				String filefold = input.next();
				if(filefold.equals("a") || filefold.equals("A"))
				{
				System.out.println(" ");
				System.out.println("==========================================");
				System.out.println("PLEASE ENTER THE FILE NAME YOU WANT TO ADD");
				System.out.println("==========================================");
				System.out.println(" ");
				String add = input.next();
				System.out.println(" ");
				System.out.println(" ");
				File obj11 = new File("maine\\"+add);
				if(obj11.exists())
				{
					System.out.println("FILE ALREADY EXISTED");
					
					if(obj11.exists())
					{
						System.out.println();
						System.out.println();
						System.out.println("PLEASE TRY AGAIN");
					}
				}
				else {
				try {
					obj11.createNewFile();
					System.out.println(add+"  FILE CREATED SUCCESSFULLY  :)");
				} catch (IOException e11) {
					// TODO Auto-generated catch block
					e11.printStackTrace();
				}
				}
				System.out.println(" ");
				System.out.println(" ");
				ab = 11;
				}
				
				else if(filefold.equals("b") || filefold.equals("B"))
				{
				System.out.println(" ");
				System.out.println("============================================");
				System.out.println("PLEASE ENTER THE FOLDER NAME YOU WANT TO ADD");
				System.out.println("============================================");
				System.out.println(" ");
				String add = input.next();
				System.out.println(" ");
				System.out.println(" ");
				File obj11 = new File("maine\\"+add);
				if(obj11.exists())
				{
					System.out.println("FOLDER ALREADY EXISTED");
					
					if(obj11.exists())
					{
						System.out.println();
						System.out.println();
						System.out.println("PLEASE TRY AGAIN");
					}
				}
				else {
				try {
					obj11.mkdir();
					System.out.println(add+"  FOLDER CREATED SUCCESSFULLY  :)");
				} catch (Exception e11) {
					// TODO Auto-generated catch block
					e11.printStackTrace();
				}
				}
				System.out.println(" ");
				System.out.println(" ");
				
				ab = 11;
				}
				
				else
				{
					System.out.print("										  ");
					System.out.println("PLEASE GIVE AN APPROPRIATE ANSWER");
					System.out.print("										  ");
					System.out.println(":):):):):):):):):):):):):):):):):)");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
				}
				
				}
	
				
				int a =2;
				while(a==2) 
				{
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("IF YOU WANT TO CONTINUE ON FILE OPERATIONS PLEASE PRESS < Y > OR PRESS < N > TO LOGOUT");
				System.out.println("......................................................................................");
				System.out.println(" ");
				System.out.println(" ");
				String y_n = input.next();
				System.out.println();
				System.out.println();
				if(y_n.equals("y")|| y_n.equals("Y"))
				{
					System.out.println();
					System.out.println();
					a=4;
					break;
				}
				else if(y_n.equals("n")|| y_n.equals("N"))
				{
					System.out.print("										  ");
					System.out.println("YOU   CHOOSED   TO   LOGOUT ");
					System.out.print("										 ");
					System.out.print("-----*-----*-----*-----*-----");
					System.out.println(" ");
					System.out.println(" ");
					System.out.print("											     ");
					System.out.println("Bye !!");
					System.out.print("											     ");
					System.out.println("^^^^^^");
					a=4;
					s=4;
					t=4;
					break;
				}
				else
				{
					
					System.out.print("										  ");
					System.out.println("PLEASE GIVE AN APPROPRIATE ANSWER");
					System.out.print("										  ");
					System.out.println(":):):):):):):):):):):):):):):):):)");
					System.out.println();
					System.out.println();
					System.out.println(" ");
				}
				}
				
				break;
				}
			case 2:
			{
				System.out.println("YOU HAVE CHOOSED TO DELETE THE FILE/FOLDER");
				System.out.println("------------------------------------------");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("===============================================================================");
				System.out.println("PLEASE ENTER THE NAME OF FILE/FOLDER THAT YOU WANT TO DELETE FROM THE FOLLOWING");
				System.out.println("===============================================================================");
				System.out.println(" ");
				File f1 = new File("maine");
				File arr3[] = f1.listFiles();
				for (int i=0; i<arr3.length; i++)
				{
					System.out.println(i+1+")."+arr3[i]);
					System.out.println(" ");
				}
				System.out.println(" ");
				String del = input.next();
				System.out.println(" ");
				System.out.println(" ");
				
				try
				{
				File obj12 = new File("maine\\"+del);
				if(obj12.delete())
				{
					System.out.println(del+"  DELETED SUCCESSFULLY :)");
					System.out.println(" ");
					System.out.println(" ");
				}
				else
				{
					System.out.println("FILE NOT FOUNT");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("PLEASE TRY AGAIN");
					System.out.println(" ");
					System.out.println(" ");
				}
				}
				catch(Exception e12)
				{
					e12.printStackTrace();
				}
				
				int b =2;
				while(b==2) 
				{
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("IF YOU WANT TO CONTINUE ON FILE OPERATIONS PLEASE PRESS < Y > OR PRESS < N > TO LOGOUT");
				System.out.println("......................................................................................");
				System.out.println(" ");
				System.out.println(" ");
				String y_n = input.next();
				System.out.println();
				System.out.println();
				if(y_n.equals("y")|| y_n.equals("Y"))
				{
					System.out.println();
					System.out.println();
					b=4;
					break;
				}
				else if(y_n.equals("n")|| y_n.equals("N"))
				{
					System.out.print("										  ");
					System.out.println("YOU   CHOOSED   TO   LOGOUT ");
					System.out.print("										 ");
					System.out.print("-----*-----*-----*-----*-----");
					System.out.println(" ");
					System.out.println(" ");
					System.out.print("											     ");
					System.out.println("Bye !!");
					System.out.print("											     ");
					System.out.println("^^^^^^");
					b=4;
					s=4;
					t=4;
					break;
				}
				else
				{
					
					System.out.print("										  ");
					System.out.println("PLEASE GIVE AN APPROPRIATE ANSWER");
					System.out.print("										  ");
					System.out.println(":):):):):):):):):):):):):):):):):)");
					System.out.println();
					System.out.println();
				}
				}
				
				break;
			}
			
			case 3:
			{
				System.out.println("YOU HAVE CHOOSED TO LIST THE FILES");
				System.out.println("----------------------------------");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("=========================================================================================");
				System.out.println("PLEASE SPECIFY THE FILE NAME OR FILE EXTENTION THAT YOU WANT TO LISTOUT FROM THE FOLLOWING");
				System.out.println("==========================================================================================");
				System.out.println(" ");
				
				File f2 = new File("maine");
				File arr4[] = f2.listFiles();
				for(int i=0; i<arr4.length; i++)
				{
					System.out.println(i+1+")."+arr4[i]);
					System.out.println(" ");
				}
				String list = input.next();
				String convertLO = list.toLowerCase();
				String convertUp = list.toUpperCase();
				
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("THE FILES THAT START WITH "+"<"+list+">"+" ARE LISTED BELOW");
				
				File obj13 = new File("maine");
				File arr1[] = obj13.listFiles();
				for (int i=0; i<arr1.length; i++)
				{
					if(arr1[i].getName().startsWith(convertLO))
					{
						
						System.out.println(i+1+")."+arr1[i]);
													
					}
					else if((arr1[i].getName().startsWith(convertUp)))
							{
								System.out.println(i+1+")."+arr1[i]);
							}
					
				}
				System.out.println(" ");
				System.out.println(" ");
				
				int c =2;
				while(c==2) 
				{
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("IF YOU WANT TO CONTINUE ON FILE OPERATIONS PLEASE PRESS < Y > OR PRESS < N > TO LOGOUT");
				System.out.println("......................................................................................");
				System.out.println(" ");
				System.out.println(" ");
				String y_n = input.next();
				System.out.println();
				System.out.println();
				if(y_n.equals("y")|| y_n.equals("Y"))
				{
					System.out.println();
					System.out.println();
					c = 4;
					break;
				}
				else if(y_n.equals("n")|| y_n.equals("N"))
				{
					System.out.print("										  ");
					System.out.println("YOU   CHOOSED   TO   LOGOUT ");
					System.out.print("										 ");
					System.out.print("-----*-----*-----*-----*-----");
					System.out.println(" ");
					System.out.println(" ");
					System.out.print("											     ");
					System.out.println("Bye !!");
					System.out.print("											     ");
					System.out.println("^^^^^^");
					c=4;
					s=4;
					t=4;
					break;
				}
				else
				{
					
					System.out.print("										  ");
					System.out.println("PLEASE GIVE AN APPROPRIATE ANSWER");
					System.out.print("										  ");
					System.out.println(":):):):):):):):):):):):):):):):):)");
					System.out.println();
					System.out.println();
				}
				}
				
				break;
			}
			
			case 4:
			{
				System.out.println("YOU HAVE CHOOSED TO RETURN BACK TO MAIN MENU");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				
				t=3;
				break;
			}
			case 5:
			{
				System.out.print("										  ");
				System.out.println("YOU   CHOOSED   TO   LOGOUT ");
				System.out.print("										 ");
				System.out.print("-----*-----*-----*-----*-----");
				System.out.println(" ");
				System.out.println(" ");
				System.out.print("											     ");
				System.out.println("Bye !!");
				System.out.print("											     ");
				System.out.println("^^^^^^");
				t=3;
				s=3;
				break;
			}
			default:
				System.out.print("										 		   ");
				System.out.println("INVALID INPUT ");
				System.out.print("										 		   ");
				System.out.println(".............");
				System.out.println(" ");
				System.out.print("												  ");
				System.out.println("PLEASE TRY AGAIN");
				System.out.print("												  ");
				System.out.println(":):):):):):):):)");
				System.out.println(" ");
				System.out.println(" ");
				
				input.nextLine();
				break;
			}
			}
			
			break;
			
		case 3:
			System.out.print("										  ");
			System.out.println("YOU   CHOOSED   TO   LOGOUT ");
			System.out.print("										 ");
			System.out.print("-----*-----*-----*-----*-----");
			System.out.println(" ");
			System.out.println(" ");
			System.out.print("											     ");
			System.out.println("Bye !!");
			System.out.print("											     ");
			System.out.println("^^^^^^");
			s=3;
			break;
			
			default:
				System.out.print("										 		   ");
				System.out.println("INVALID INPUT ");
				System.out.print("										 		   ");
				System.out.println(".............");
				System.out.println(" ");
				System.out.print("												  ");
				System.out.println("PLEASE TRY AGAIN");
				System.out.print("												  ");
				System.out.println(":):):):):):):):)");
				System.out.println(" ");
				System.out.println(" ");
				input.nextLine();
				break; 
		}
		}

	}

}
