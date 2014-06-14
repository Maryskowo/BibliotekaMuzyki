import java.util.ArrayList;


public class Utwory {

	String nazwaUtworu;
	int czasUtworu;
	//int czas = 0;
	//int czas2 = czas;//w sekundach
	String wykonawcy;
	String wykonawcy2;
	String kompozytor;
	int numerUtworu;
	
	
	public Utwory( String nazwaUtworu, int czasUtworu, String wykonawcy, int numerUtworu ){
		this.nazwaUtworu = nazwaUtworu;
		this.czasUtworu = czasUtworu;
		this.wykonawcy = wykonawcy;
		//czas = czas + czasUtworu;
	}
	
	public Utwory( String nazwaUtworu, int czasUtworu, String wykonawcy, String kompozytor, int numerUtworu ){
		this.nazwaUtworu = nazwaUtworu;
		this.czasUtworu = czasUtworu;
		this.wykonawcy = wykonawcy;
		this.kompozytor = kompozytor;
		//czas = czas + czasUtworu;
	}
	
	public String getNazwaUtwor( ){
		return this.nazwaUtworu;
	}
	
	public int getCzasUtworu(){
		return this.czasUtworu;
	}
	
	public String getWykonawcy(){
		return this.wykonawcy;
	}
	public String getKompozytor(){
		return this.kompozytor;
	}
	
	public int getNmerUtworu(){
		return this.numerUtworu;
	}

	public String getTylkoWykonwcy( Utwory utwor ){
		
		/*for(int i = 0; listaUtworow.size()> i; i++){
			wykonawcy2 = "\n" + wykonawcy2 + "\n" + listaUtworow.get(i).getWykonawcy();
		}*/
		return utwor.getWykonawcy();
	}
	/*public int getCzas(){
		return this.czas;
	}*/
	
	@Override
	public String toString() {
		return "Utwory " + nazwaUtworu + ", czasUtworu="
				+ czasUtworu + ", wykonawcy=" + wykonawcy + ", kompozytor="
				+ kompozytor + ", numerUtworu=" + numerUtworu + "\n";
		
	}
	
	public void setNazwaUtworu( String nazwaUtworu ){
		this.nazwaUtworu = nazwaUtworu;
	}
	
	public void setCzasUtworu( int czasUtworu ){
		this.czasUtworu = czasUtworu;
	}
	
	public void setWykonawcy( String wykonawcy ){
		this.wykonawcy = wykonawcy;
	}
	
	public void setKompozytor( String kompozytor ){
		this.kompozytor = kompozytor;
	}
	
	public void setNumerUtworu( int numerUtworu ){
		this.numerUtworu = numerUtworu;
	}
}
