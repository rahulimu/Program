package interview.misc_programs_2025;

import java.util.ArrayList;

public class PrintEmployeeNameWithHighestSalary {

	public static void main(String[] args) {
		String[] names = { "Alex", "Priya", "James", "Alex", "Sofia" };
		int[] salaries = { 70000, 85000, 65000, 92000, 92000 };

		ArrayList<String> highestPaidNames=new ArrayList<>();
		int highestSalary = 0;
		
		for(int i=0;i<names.length;i++)
		{
			if(highestSalary<salaries[i])
			{
				highestSalary=salaries[i];
				highestPaidNames.clear();
				highestPaidNames.add(names[i]);
			}
			else if(highestSalary==salaries[i])
			{
				highestPaidNames.add(names[i]);
			}
		}
		System.out.println("Employee with highest Salary: ");
		for(String name:highestPaidNames)
		{
			System.out.println("Name: "+name+" salary: "+highestSalary);
		}

		
	}
}