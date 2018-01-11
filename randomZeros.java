import java.util.ArrayList;
public class randomZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numsRandom = new ArrayList<Integer>();
		for (int i=0; i< 10; i++)
		{
			numsRandom.add((int)(Math.random()*99+1));
		}
		System.out.print("Random List: "+numsRandom);
		
		
		for (int i=0; i< numsRandom.size(); i++)
		{
			numsRandom.set(i, 0);
		}
		System.out.print("\nModified List: "+numsRandom);
	}

}
