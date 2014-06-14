import java.util.ArrayList;


public class Plyty {

	String nazwaPlyty;
	Utwory utwor;
	int czas; // w minutach
	//String utwory;
	int numerPlyty;
	ArrayList<Utwory> listaUtworow;
	String tekst = "";
	
	//int ilosc;
	
	public Plyty( String nazwa, ArrayList listaUtworow, int numerPlyty ){
		this.nazwaPlyty = nazwa;
		this.listaUtworow = listaUtworow;
		//ilosc = iloscUtworow;
		this.numerPlyty = numerPlyty;
		//czas = czas.czas;
		
		
	}

	void dodaj( Utwory utwor ){
		
	}
	/*void wypisz(){
		System.out.println(nazwaPlyty);
		System.out.println(numerPlyty);
		//System.out.println(utwor.nazwaUtworu);
		//System.out.println(utwor.czasUtworu);
		System.out.println(listaUtworow);
	}*/

	public String getNazwaPlyty(){
		return this.nazwaPlyty;
	}
	
	public int getNumerPlyty(){
		return this.numerPlyty;
	}
	
	public String getListaPlyt( ArrayList<Plyty> listaPlyt ){
		
		for(int i = listaUtworow.size() - 1; i>=0 ; i--){
			nazwaPlyty = nazwaPlyty + "\n" + listaPlyt.get(i).getNazwaPlyty();
		}
		return "Plyty w bibliotece:\n" + nazwaPlyty;
	}
	
	
	/*public String getWykonawcy( ArrayList<Utwory> listaUtworow ){
		
		for(int i = listaUtworow.size() - 1; i>=0 ; i--){
			nazwaPlyty = nazwaPlyty + "\n" + listaUtworow.get(i).getWykonawcy();
		}
		return "" + nazwaPlyty;
	}*/
	
	public String getWykonawcy( Plyty plyta ){
		this.listaUtworow = plyta.listaUtworow;
		for(int i = 0; plyta.listaUtworow.size() > i; i++ ){
			utwor = plyta.listaUtworow.get(i);
			tekst = tekst + utwor.getTylkoWykonwcy(utwor) + "\n";
		}
		return "Wykonawcy:\n" + tekst;
	}
	
	public String getInfoUtwory( Plyty plyta, int i ){
		return "Informacje o utworze:\n" + plyta.listaUtworow.get(i);
	}
	
	public int getCzasPlyty( ArrayList<Utwory> listaUtworow ){
		for(int i = 0; listaUtworow.size()>i; i++){
			czas = czas + listaUtworow.get(i).getCzasUtworu();
		}
		return this.czas / 60;
	}
	
	

	@Override
	public String toString() {
		return "Plyty " + nazwaPlyty + ", czas=" + getCzasPlyty(listaUtworow)
				+ ", numerPlyty=" + numerPlyty
				+ ", listaUtworow=\n" + listaUtworow;
	}



	public void setNazwaPlyty( String nazwaPlyty ){
		this.nazwaPlyty = nazwaPlyty;
	}
	
	public void setNumerPlyty( int numerPlyty ){
		this.numerPlyty = numerPlyty;
	}
	
	
}
