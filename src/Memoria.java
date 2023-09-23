import java.util.ArrayList;
public class Memoria {
	ArrayList<Celula> C = new ArrayList<Celula>();
	public Memoria() {
		C.add(new Celula(false, false, false, false));
		C.add(new Celula(false, false, false, true));
		C.add(new Celula(false, false, true,  false));
		C.add(new Celula(false, false, true,  true));
		C.add(new Celula(false, true,  false, false));
		C.add(new Celula(false, true,  false, true));
		C.add(new Celula(false, true,  true,  false));
		C.add(new Celula(false, true,  true,  true));
		C.add(new Celula(true,  false, false, false));
		C.add(new Celula(true,  false, false, true));
		C.add(new Celula(true,  false, true,  false));
		C.add(new Celula(true,  false, true,  true));
		C.add(new Celula(true,  true,  false, false));
		C.add(new Celula(true,  true,  false, true));
		C.add(new Celula(true,  true,  true,  true));	 
	}
	public Celula getC(int x) {
		return C.get(x);
	}
	
}
