import java.util.ArrayList;
public class emperorsNewGrove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Strings = new ArrayList<String>();
		Strings.add("Kuzco");
		Strings.add("Pacha");
		Strings.add("Yzma");
		Strings.add("Kronk");
		System.out.print("Original list: "+Strings);
		
		Strings.remove(1);
		Strings.add(2, "Chaca");
		Strings.add(3, "Tipo");
		Strings.add("Bucky");
		Strings.add("Pacha");
		System.out.print("\nModified List: "+Strings);
		System.out.print(Strings.size());
	}

}
