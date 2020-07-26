package com.newyear.gifts;

public class Chocolate {
	public int totalWeight(int chocholate[],int n)
	{
		int total=0;
		for(int i=0;i<n;i++)
		{
			total+=chocholate[i];
		}
		return (total);
	}
	public int totalCandies(int min,int max,int chocholate[],int c)
	{
		int count=0;
		for(int i=0;i<c;i++)
		{
			if(chocholate[i]>=min && chocholate[i]<=max)
				count+=1;
		}
		return (count);
	}
}
