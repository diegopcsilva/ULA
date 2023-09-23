


public class PortasLogicas {
	private boolean Cout = false;
	
	public PortasLogicas() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean And(boolean A,boolean B){
		return A && B;
	}
	public boolean Or(boolean A,boolean B){
		return A || B;
	}
	public boolean Not(boolean A){
		return !A;
	}
	public boolean Nand(boolean A, boolean B) {  
	   return !(And(A,B));
	}
	public boolean Nor(boolean A, boolean B) {  
		return !(Or(A,B));
	}
	public boolean Xor(boolean A, boolean B) {  
	   return And(!A,B) || And(A,!B);  
	}
	public boolean Exor(boolean A, boolean B) {  
		return And(A,B) || And(!A,!B);  
	}
	public boolean Mux8(boolean I1,boolean I2,boolean I3,boolean I4,boolean I5,boolean I6,boolean I7,boolean I8 ,boolean S1,boolean S2,boolean S3){
		return !S3&!S2&!S1&I1 | !S3&!S2&S1&I2 | !S3&S2&!S1&I3 | !S3&S2&S1&I4 | S3&!S2&!S1&I5 | S3&!S2&S1&I6 | S3&S2&!S1&I7 | S3&S2&S1&I8;
	}
	public boolean Mux4(boolean I1,boolean I2,boolean I3,boolean I4,boolean S1,boolean S2){
		return Or(Or(And(And(!S1,!S2),I1),And(And(!S1,S2),I2)),Or(And(And(S1,!S2),I3),And(And(S1,S2),I4)));
	}
	public boolean Mux2(boolean I1,boolean I2, boolean S1){
		return Or(And(S1,I1),And(!S1,I2));
	}
	public boolean Add(boolean A,boolean B,boolean Cin){
		Cout = Or(And(Cin,Xor(A,B)),And(A,B));
		return Xor(Cin,Xor(A,B));
	}
	
	public boolean isCout() {return Cout;}
	public void setCout(boolean cout) {Cout = cout;}
}

