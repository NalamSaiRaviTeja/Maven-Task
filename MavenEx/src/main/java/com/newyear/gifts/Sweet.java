package com.newyear.gifts;

public class Sweet extends Ranges{
	public int totalWeight(int sweets[],int num)
	{
		int total=0;
		for(int i=0;i<num;i++)
		{
			total+=sweets[i];
		}
		return (total);
	}
	public int totalCandies(int min,int max,int[] sweets,int cnt)
	{
		int count=0;
		for(int i=0;i<cnt;i++)
		{
			if(sweets[i]>=min && sweets[i]<=max)
				count++;
		}
		return count;
	}
}
