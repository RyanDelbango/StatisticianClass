//Ryan Delbango
//n02394024
//September 24, 2018
//Java class to produce a Statistician.

public class Statistician
	{
	   private int length;
	   private double sum;
	   private double mean;
	   private double min;
	   private double max;

   public Statistician()
	{
	   length = 0;
	   max = 0;
	   mean = 0;
	   min = 0;
	   sum = 0;
	}

   public void addAll(Statistician addend)
	{
	   length = length + addend.length;
	   mean = (mean + addend.mean)/2;
	   sum = sum + addend.sum;
	   if(addend.max >= max){max = addend.max;}
	   else if(addend.min <= min){min = addend.min;}   
	}

   public void clear()
	{
	   length = 0;
	   max = 0;
	   mean = 0;
	   min = 0;
	   sum = 0;
	}

   public boolean equals(Statistician candidate)
	{
	   return (length == candidate.length) && (sum == candidate.sum) && (mean == candidate.mean) && (min == candidate.min) && (max == candidate.max);
	}

   public int length()
	{
	   return length;
	}

   public double maximum()
	{
	   if(max == 0 && length == 0){return Double.NaN;}
	   return max;
	}

   public double mean()
	{
	   if(mean == 0 && length == 0){return Double.NaN;}
	   return mean;
	}

   public double minimum()
	{
	   if(min == 0 && length == 0){return Double.NaN;}
	   return min;
	}

   public void next(double number)
	{
	   length++;
	   sum = number + sum;
	   mean = sum / (double) length;
	   if(number >= max){max = number;}
	   else if(number <= min){min = number;}
	}

   public double sum()
	{
	   return sum;
	}

   public static Statistician union (Statistician s1, Statistician s2)
	{
	   Statistician combine = new Statistician(); 
	   combine.length = (s1.length) + (s2.length);
	   combine.mean = ((s1.mean) + (s2.mean))/2;
	   combine.sum = (s1.sum) + (s2.sum);
	   if(s1.max >= s2.max){combine.max = s1.max;}
	   else if(s1.min <= s2.min){combine.min = s1.min;}
	   return combine;
	}
	}