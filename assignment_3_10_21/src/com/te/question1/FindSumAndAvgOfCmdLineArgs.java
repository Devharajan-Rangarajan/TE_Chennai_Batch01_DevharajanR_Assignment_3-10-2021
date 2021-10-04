package com.te.question1;

public class FindSumAndAvgOfCmdLineArgs {

	public static void main(String[] args) {

		int[] nums = new int[args.length];
		int sum = 0;
		
		System.out.println("The numbers entered are : ");
		
		for (int i = 0; i < args.length; i++) {

			nums[i] = Integer.parseInt(args[i]);
			System.out.print(nums[i] + " ");
			sum+=nums[i];
			
		}
		System.out.println();
		System.out.println("The sum of the numbers given is '"+sum+"' and the Average of is '"
							+(double)sum/nums.length+"'");
		
	}

}
