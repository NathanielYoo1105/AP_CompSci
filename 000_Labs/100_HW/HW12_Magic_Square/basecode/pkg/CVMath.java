package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static void specialSquare(int num){
		int specials = 0;
		int count = 1;
		int sCount = count * count;
		while(specials < num){
			boolean check1 = false;
			int sum = 0;
			int a = 0;
			while(a <= sCount && !check1){
				sum += a;
				if(sum == sCount)
					check1 = true;
				a++;
			}
			if(check1){
				specials++;
				System.out.println(sCount);
			}
			count++;
			sCount = count * count;
		}
	}
	
}
