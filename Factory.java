package Factory;
import java.io.*;

public class Factory {
	public static void main(String[] args)throws java.io.IOException{ 
       	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;
        
        int salary, cantTables;
        double icentiveFinal;
        
        out.println("salary:");
        salary=Integer.parseInt(in.readLine());
        out.println("Tables:");
        cantTables=Integer.parseInt(in.readLine());
        
        icentiveFinal=icentive(salary,cantTables);
        out.println("The icentive is "+icentiveFinal);
        
	}
	 static double icentive (int psalary, int pcontTables) {
		double icentive=0;
		if (pcontTables>=11&pcontTables<=25){
			icentive=(psalary*0.20);
		}
			if (pcontTables>=25){
				icentive=(psalary*0.10);
			}
			
		return icentive;
	}
	
}
