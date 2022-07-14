import java.util.Random;
public class A2 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int runs,ones,twos,threes,fours,sixes,zeroes;
		runs=ones=twos=threes=fours=sixes=zeroes=0;
		for(int i=1; i<=30; i++) {
			int thisBall=5;
			while(thisBall==5)
				thisBall = rand.nextInt(0,7);
			if(thisBall == 0)
				zeroes++;
			else if(thisBall == 1)
				ones++;
			else if(thisBall == 2)
				twos++;
			else if(thisBall == 3)
				threes++;
			else if(thisBall == 4)
				fours++;
			else if(thisBall == 6)
				sixes++;
			runs = runs+thisBall;
	}
		double sr = runs/30;
		System.out.println("Total runs : "+runs);
		System.out.println("Zeroes : "+zeroes);
		System.out.println("Ones : "+ones);
		System.out.println("Twos : "+twos);
		System.out.println("Threes : "+threes);
		System.out.println("Fours : "+fours);
		System.out.println("Sixes : "+sixes);
		System.out.println("Strike Rate :"+sr);
}
}
