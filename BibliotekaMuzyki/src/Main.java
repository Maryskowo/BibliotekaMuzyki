import java.util.ArrayList;




public class Main {

	public static void main(String[] args) {
		
		//ArrayList listaPlyt = new ArrayList();
		ArrayList<Plyty> listaPlyt = new ArrayList<Plyty>();
		
		ArrayList<Utwory> plyta1 = new ArrayList<Utwory>();
		ArrayList<Utwory> plyta2 = new ArrayList<Utwory>();
		ArrayList<Utwory> plyta3 = new ArrayList<Utwory>();

		
		Utwory muzyka1 = new Utwory( "test1", 120, "Random1", 1);
		Utwory muzyka2 = new Utwory( "test2", 120, "Random2","Krzywa reka", 2);
		Utwory muzyka3 = new Utwory( "test3", 120, "Random3", 3);
		

		
		plyta1.add(muzyka1);
		plyta1.add(muzyka2);
		plyta1.add(muzyka3);
		Plyty pierwsza = new Plyty( "Plyteczka", plyta1, 1);
		listaPlyt.add(pierwsza);
		
		
		plyta2.add(muzyka3);
		Plyty druga = new Plyty( "akzcetylP", plyta2, 2);
		listaPlyt.add(druga);
		
		
		plyta3.add(muzyka1);
		plyta3.add(muzyka2);
		Plyty trzecia = new Plyty( "Ktoras", plyta3, 3);
		listaPlyt.add(trzecia);
		
		/*for(Utwory utwory : plyta1){
			System.out.print( utwory.getNazwaUtwor() + utwory.getCzasUtworu() + utwory.getWykonawcy() + utwory.getNmerUtworu() +"\n" );
		}*/
		
		System.out.println(pierwsza.toString()+"\n");
		System.out.println(druga.toString()+"\n"); //szczególowe info p³yty
		System.out.println(trzecia.getListaPlyt(listaPlyt)+"\n"); // lista plyt
		System.out.println(pierwsza.getWykonawcy(pierwsza)); // wykonawcy na danej plycie
		System.out.println(pierwsza.getInfoUtwory(pierwsza, 1)); // info o wybranym utworze z wybranej plyty
		
		//System.out.println(pierwsza.getCzasPlyty(plyta1));
		//System.out.println(Utwory.czas);
		//System.out.println(plyta1.get(0));
	}

}
