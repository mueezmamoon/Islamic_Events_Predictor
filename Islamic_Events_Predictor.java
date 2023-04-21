import java.io.*;
import java.util.*;

class Islamic_Events_Predictor
{
			int cho;
			static Scanner sc = new Scanner(System.in);
			String [] hijriMonths = {"Muharram","Safar","Rabi' al-'Awwal","Rabi' ath-Thani","Jumada al-'Ula","Jummadul Ukhra","Rajab","Sha'ban","Ramadan","Shawwal","Dhul Qiadah","Dhul Hijjah"};
			String [] gregMonths = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
	
	
	void conv_ramadan(int year)
	{
			int toStart,till;
			double startHij = 0,startMonth=0,startDay=0,temp=0;
			
			double gregYear=0, gregMonth=0,gregDay=0;
			/*
			System.out.println("\n100 year start timetable: ");
			System.out.println("\nChoose year to start from: ");
			year = sc.nextInt();
		*/
		
			startHij = 1.030658*((year+((1.0/12.0)+(1.0/365.25)))-621.616);
			startMonth = 1.0 + (startHij - (int)startHij) * 12.0;
			startDay = (startMonth - (int)startMonth) * 29.5;
			
			System.out.println("1st Jan "+year+" is "+(int)startDay+" "+hijriMonths[(int)startMonth - 1]+" "+(int)startHij);
			
					toStart = (int)startHij;
					System.out.print("Print timetable for the next (years): ");
					till=sc.nextInt();
		
		
		int lim = (toStart+till);
			System.out.println("RAMADAN | GREGORIAN");
			System.out.println("_______ | _________");
		while(toStart<=lim)
		{
			gregYear=621.616+(0.970255*(toStart+(1.0/12.0)*((int)1.0/29.5+((int)9.0-1.0))));
			gregMonth = (gregYear - (int)gregYear) * 12;
			gregDay = (gregMonth - (int)gregMonth) * 30.475;
			
			if((int)gregMonth == 0)
			gregMonth = 12;
			
			gregDay = (gregDay < 1) ? Math.round(gregDay) : gregDay;
			

			System.out.println("\n"+toStart+"    |    "+(int)gregDay+"-"+gregMonths[(int)gregMonth-1]+"-"+(int)gregYear);
		
			toStart++;
		}
		
		System.out.println("-------------------------------------\nDo you want to go to main menu or exit the program?");
		System.out.println("\n\n1. Go to the main menu");
		System.out.println("2. Exit");
		do
		{
		System.out.println("\nEnter your choice: ");
		cho = sc.nextInt();
		
		if(cho==1)
		main(null);
		
		if(cho==2)
		System.exit(0);
	}while(cho == 0 || cho<1 || cho>2);
		
	}
	
	
		void conv_eid_fitr(int year)
	{
			int toStart,till;
			double startHij = 0,startMonth=0,startDay=0,temp=0;
			
			double gregYear=0, gregMonth=0,gregDay=0;
			/*
			System.out.println("\n100 year start timetable: ");
			System.out.println("\nChoose year to start from: ");
			year = sc.nextInt();
		*/
		
			startHij = 1.030658*((year+((1.0/12.0)+(1.0/365.25)))-621.616);
			startMonth = 1.0 + (startHij - (int)startHij) * 12.0;
			startDay = (startMonth - (int)startMonth) * 29.5;
			
			System.out.println("1st Jan "+year+" is "+(int)startDay+" "+hijriMonths[(int)startMonth - 1]+" "+(int)startHij);
			
					toStart = (int)startHij;
					System.out.print("Print timetable for the next (years): ");
					till=sc.nextInt();
		
		
		int lim = (toStart+till);
			System.out.println("EID-UL-FITR | GREGORIAN");
			System.out.println("___________ | _________");
		do
		{
			gregYear=621.616+(0.970255*(toStart+(1.0/12.0)*((int)1.0/29.5+((int)10.0-1.0))));
			gregMonth = (gregYear - (int)gregYear) * 12;
			gregDay = (gregMonth - (int)gregMonth) * 30.475;
			
			if((int)gregMonth == 0)
			gregMonth = 12;
			
			gregDay = (gregDay < 1) ? Math.round(gregDay) : gregDay;
			

			System.out.println("\n"+toStart+"\t    |    "+(int)gregDay+"-"+gregMonths[(int)gregMonth-1]+"-"+(int)gregYear);
		
			toStart++;
		}while(toStart<=lim);
	}
	
	void conv_eid_adha(int year)
	{
			int toStart,till;
			double startHij = 0,startMonth=0,startDay=0,temp=0;
			
			double gregYear=0, gregMonth=0,gregDay=0;
			/*
			System.out.println("\n100 year start timetable: ");
			System.out.println("\nChoose year to start from: ");
			year = sc.nextInt();
		*/
		
			startHij = 1.030658*((year+((1.0/12.0)+(1.0/365.25)))-621.616);
			startMonth = 1.0 + (startHij - (int)startHij) * 12.0;
			startDay = (startMonth - (int)startMonth) * 29.5;
			
			System.out.println("1st Jan "+year+" is "+(int)startDay+" "+hijriMonths[(int)startMonth - 1]+" "+(int)startHij);
			
					toStart = (int)startHij;
					System.out.print("Print timetable for the next (years): ");
					till=sc.nextInt();
		
		
		int lim = (toStart+till);
			System.out.println("EID-UL-ADHA | GREGORIAN");
			System.out.println("___________ | _________");
		while(toStart<=lim)
		{
			gregYear=621.616+(0.970255*(toStart+(1.0/12.0)*((int)10.0/29.5+((int)12.0-1.0))));
			gregMonth = (gregYear - (int)gregYear) * 12;
			gregDay = (gregMonth - (int)gregMonth) * 30.475;
			
			if((int)gregMonth == 0)
			gregMonth = 12;
			
			gregDay = (gregDay < 1) ? Math.round(gregDay) : gregDay;
			

			System.out.println("\n"+toStart+"\t    |    "+(int)gregDay+"-"+gregMonths[(int)gregMonth-1]+"-"+(int)gregYear);
		
			toStart++;
		}
	}
	
	public static void main(String args[])
	{
		
		Islamic_Events_Predictor e = new Islamic_Events_Predictor();
	
		int year,event;

			
			
			
			System.out.println("\nWelcome to future Islamic Events Date Predictor");
			
			System.out.println("\n\nChoose event whose Dates are to be predicted:");
			System.out.println("\n1. Ramadan");
			System.out.println("\n2. Eid-ul-Fitr");
			System.out.println("\n3. Eid-ul-Adha");
			
			
			do
			{
				System.out.print("\nEnter event choice: ");
				event = sc.nextInt();
			}while(event<=0 || event == 0 || event>3);
			
			if(event == 1)
			{
			System.out.println("\n------------------------------\nRamadan start date predictor:");
			
			
			
			do
			{
					System.out.println("Enter any year after 622 C.E.");
					year = sc.nextInt();
			}while(year<=622);
			
			e.conv_ramadan(year);
		}
		
		if(event == 2)
			{
			System.out.println("\n---------------------------------\nEid-Ul-Fitr date predictor:");
			
			
			
			do
			{
			System.out.println("Enter any year after 622 C.E.");	
			year = sc.nextInt();
			}while(year<=622);
			
			e.conv_eid_fitr(year);
		}
		
		if(event == 3)
			{
			System.out.println("\n---------------------------------\nEid-Ul-Adha date predictor:");
				
			
			
			do
			{
			System.out.println("Enter any year after 622 C.E.");	
			year = sc.nextInt();
			}while(year<=622);
			
			e.conv_eid_adha(year);
		}
	
	}


}
