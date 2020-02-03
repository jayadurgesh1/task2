package com.epam_task;

import java.util.Arrays;
public class App
{
	public static void main(String args[])
	{
	    int[] choco_wt= {210,10,30,140,90,60};
	    String[] choco_brand= {"a","t","j","s","j","d","f"};
	    String[] sweets = {"Vol", "BM", "For", "Maz"};
	    for (int i = 1; i < choco_wt.length; i++)
	    {
	        for (int j = i; j > 0; j--) 
	        {
	            if (choco_wt[j] < choco_wt[j - 1])
	            {
	                int temp = choco_wt[j];
	                choco_wt[j] = choco_wt[j - 1];
	                choco_wt[j - 1] = temp;
	            }
	        }
	    }
		for(int i=0;i<choco_wt.length;i++)
		{
			if(choco_wt[i]<100)
			{
				System.out.println("is in range"+choco_wt[i]);
			}
			else
			{
				System.out.println(choco_wt[i]);
			}
		}
		for(int i=0;i<choco_brand.length;i++)
		{
			System.out.println(choco_brand[i]+sweets[i]);
		}
	}
}