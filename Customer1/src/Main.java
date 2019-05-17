import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String args[]) throws IOException, ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(ir);
		Customer c[]=new Customer[2];
		for(int i=0; i<2; i++){
			System.out.println("Enter the details of Customer "+(i+1)+":");
			String details=bf.readLine();
			String detail_split[]=details.split(",");
			long id=Long.parseLong(detail_split[0]);
			String name=detail_split[1];
			String mobileNumber=detail_split[2];
			Date birthDate=sdf.parse(detail_split[3]);
			double averageSpendAmount=Double.parseDouble(detail_split[4]);
			double totalAmount=Double.parseDouble(detail_split[5]);
			Date dateEnrolled=sdf.parse(detail_split[6]);
			Double rating=Double.parseDouble(detail_split[7]);
			c[i]=new Customer(id, name, mobileNumber, birthDate, averageSpendAmount, totalAmount, dateEnrolled, rating);
			
		}
		System.out.println();
		for(int i=0; i<2; i++){
			System.out.println("Details of customer "+(i+1)+":");
			System.out.println(c[i]);
			System.out.println();
		}
		if(c[0].equals(c[1])){
			System.out.println("Customer 1 is same as Customer 2");
		}
		else{
			System.out.println("Customer 1 and Customer 2 are different");
		}
		
	}
}
