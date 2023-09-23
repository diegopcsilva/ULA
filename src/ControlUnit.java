import java.util.Scanner;

public class ControlUnit {

	public static void main(String[] args) {
		
		
			boolean A1 = false;
			boolean A2 = false;
			boolean A3 = false;
			boolean A4 = false;
			boolean B1 = false;
			boolean B2 = false;
			boolean B3 = false;
			boolean B4 = false;
			boolean S1 = false;
			boolean S2 = false;
			boolean S3 = false;
			boolean S4 = false;
			boolean F1 = false;
			boolean F2 = false;
			boolean F3 = false;
			boolean F4 = false;
			boolean F5 = false;
			boolean barramento1 = false;
			boolean barramento2 = false;
			boolean barramento3 = false;
			boolean barramento4 = false;
			for ( ; ; ) {
			int choice = 0;
			//boolean choiceBoolean;
			@SuppressWarnings("resource")
			Scanner user_input = new Scanner(System.in);
			Memoria memoria = new Memoria();
			System.out.println("Menu Principal ULA\n");
			System.out.println("\t1. Definir registrador A");
			System.out.println("\t2. Definir registrador B");
			System.out.println("\t3. Ler registrador A(Acc)");
			System.out.println("\t4. Ler registrador B");
			System.out.println("\t5. Ler registrador de flags");
			System.out.println("\t6. Definir operação");
			System.out.println("\t7. Executar ULA\n");
			System.out.println("Escolha a opção=>");
			choice = user_input.nextInt();
			switch (choice) {
			case 1:
				int mem;
				System.out.println("digite o endereço de memória de 0 a 15 para registrador A");
				mem = user_input.nextInt();
				barramento1 = memoria.getC(mem).isC1();
				barramento2 = memoria.getC(mem).isC2();
				barramento3 = memoria.getC(mem).isC3();
				barramento4 = memoria.getC(mem).isC4();
				/*
				System.out.println("Bit 2 - Segundo Menos significativo");
				barramento2 = user_input.nextBoolean();
				System.out.println("Bit 3 - Segundo Mais significativo");
				barramento3 = user_input.nextBoolean();
				System.out.println("Bit 4 - Mais significativo");
				barramento4 = user_input.nextBoolean();*/
				break;
			case 2:
				System.out.println("digite o endereço de memória de 0 a 15 para registrador B");
				mem = user_input.nextInt();
				barramento1 = memoria.getC(mem).isC1();
				barramento2 = memoria.getC(mem).isC2();
				barramento3 = memoria.getC(mem).isC3();
				barramento4 = memoria.getC(mem).isC4();
				break;
			case 3:
				A1 = barramento1;
				A2 = barramento2;
				A3 = barramento3;
				A4 = barramento4;
				break;
			case 4:
				B1 = barramento1;
				B2 = barramento2;
				B3 = barramento3;
				B4 = barramento4;
				break;
			case 5:
				//flags maior, menor, Cout

				break;
			case 6:
				System.out.println("Escolha a operação");
				System.out.println(
						"0 = And, 1 = Or, 2 = Not, 3 = Nand, 4 = Nor, 5 = Xor, 6 = Exor, 7 = And com B invertido");
				System.out.println("8 = Add, 9 =Sub, 10=Mult ,11= A+1 , 12= A+2, 13=A+10, 14= A-1 , 15= A-2 ");
				System.out.println("digite um número de 0 a 15 ");
				mem = user_input.nextInt();
				barramento1 = memoria.getC(mem).isC1();
				barramento2 = memoria.getC(mem).isC2();
				barramento3 = memoria.getC(mem).isC3();
				barramento4 = memoria.getC(mem).isC4();

				break;
			case 7:
				PortasLogicas pt = new PortasLogicas();
				PortasLogicas pt2 = new PortasLogicas();
				PortasLogicas pt3 = new PortasLogicas();
				PortasLogicas pt4 = new PortasLogicas();
				PortasLogicas pt5 = new PortasLogicas();
				PortasLogicas pt6 = new PortasLogicas();
				PortasLogicas pt7 = new PortasLogicas();
				PortasLogicas pt8 = new PortasLogicas();
				PortasLogicas pt12 = new PortasLogicas();
				PortasLogicas pt13 = new PortasLogicas();
				PortasLogicas pt14 = new PortasLogicas();
				PortasLogicas pt15 = new PortasLogicas();
				PortasLogicas pt16 = new PortasLogicas();
				PortasLogicas pt17 = new PortasLogicas();
				PortasLogicas pt18 = new PortasLogicas();
				PortasLogicas pt19 = new PortasLogicas();
				PortasLogicas pt20 = new PortasLogicas();
				PortasLogicas pt21 = new PortasLogicas();
				PortasLogicas pt22 = new PortasLogicas();
				PortasLogicas pt23 = new PortasLogicas();
				PortasLogicas pt24 = new PortasLogicas();
				PortasLogicas pt25 = new PortasLogicas();
				PortasLogicas pt26 = new PortasLogicas();
				PortasLogicas pt27 = new PortasLogicas();
				PortasLogicas pt28 = new PortasLogicas();
				PortasLogicas pt29 = new PortasLogicas();
				PortasLogicas pt30 = new PortasLogicas();
				PortasLogicas pt31 = new PortasLogicas();
				
				S1 = barramento1;
				S2 = barramento2;
				S3 = barramento3;
				S4 = barramento4;

				if (!S4) {
					F1 = pt.Mux8(pt.And(A1, B1), pt.Or(A1, B1), pt.Not(A1), pt.Nand(A1, B1), pt.Nor(A1, B1),
							pt.Xor(A1, B1), pt.Exor(A1, B1), pt.And(A1, !B1), S1, S2, S3);
					F2 = pt.Mux8(pt.And(A2, B2), pt.Or(A2, B2), pt.Not(A2), pt.Nand(A2, B2), pt.Nor(A2, B2),
							pt.Xor(A2, B2), pt.Exor(A2, B2), pt.And(A2, !B2), S1, S2, S3);
					F3 = pt.Mux8(pt.And(A3, B3), pt.Or(A3, B3), pt.Not(A3), pt.Nand(A3, B3), pt.Nor(A3, B3),
							pt.Xor(A3, B3), pt.Exor(A3, B3), pt.And(A3, !B3), S1, S2, S3);
					F4 = pt.Mux8(pt.And(A4, B4), pt.Or(A4, B4), pt.Not(A4), pt.Nand(A4, B4), pt.Nor(A4, B4),
							pt.Xor(A4, B4), pt.Exor(A4, B4), pt.And(A4, !B4), S1, S2, S3);
				} else {
					F1 = pt.Mux8(pt.Add(A1, B1, false), pt5.Add(A1, !B1, true), pt.And(A1, B1),
							pt12.Add(A1, false, true), pt16.Add(A1, false, false), pt20.Add(A1, false, false),
							pt24.Add(A1, !true, true), pt28.Add(A1, !false, true), S1, S2, S3);
					F2 = pt2.Mux8(pt2.Add(A2, B2, pt.isCout()), pt6.Add(A2, !B2, pt5.isCout()),
							pt.Xor(pt.And(A1, B2), pt.And(B1, A2)), pt13.Add(A2, false, pt12.isCout()),
							pt17.Add(A2, true, pt16.isCout()), pt21.Add(A2, true, pt21.isCout()),
							pt25.Add(A2, !false, pt24.isCout()), pt29.Add(A2, !true, pt28.isCout()), S1, S2, S3);
					F3 = pt3.Mux8(pt3.Add(A3, B3, pt2.isCout()), pt7.Add(A3, !B3, pt6.isCout()),
							pt.And(pt.And(A2, B2), pt.Nand(A1, B1)), pt14.Add(A3, false, pt13.isCout()),
							pt18.Add(A3, false, pt17.isCout()), pt22.Add(A3, false, pt21.isCout()),
							pt26.Add(A3, !false, pt25.isCout()), pt30.Add(A3, !false, pt29.isCout()), S1, S2, S3);
					F4 = pt4.Mux8(pt4.Add(A4, B4, pt3.isCout()), pt8.Add(A4, !B4, pt7.isCout()),
							pt.And(pt.And(A1, B1), pt.And(A2, B2)), pt15.Add(A4, false, pt14.isCout()),
							pt19.Add(A4, false, pt18.isCout()), pt23.Add(A4, true, pt22.isCout()),
							pt27.Add(A4, !false, pt26.isCout()), pt31.Add(A4, !false, pt30.isCout()), S1, S2, S3);
					//soma                                    sub                        multi                                     +1 							            +2							+10
					if (!S3 && !S2 && !S1)
						F5 = pt4.isCout();
					if (!S3 && !S2 && S1)
						F5 = pt8.isCout();
					if (!S3 && S2 && S1)
						F5 = pt15.isCout();
					if (S3 && !S2 && !S1)
						F5 = pt19.isCout();
					if (S3 && !S2 && S1)
						F5 = pt23.isCout();
				}

				System.out.println(F1);
				System.out.println(F2);
				System.out.println(F3);
				System.out.println(F4);
				System.out.println();
				System.out.println(F5);

				break;

			}
		}
		//pt.Mux8(soma, sub, mult(usa cout,A+1, A+1?,A+2, I7, I8, S1, S2, S3);
		//mult  2 dig em cada operando
		
	}

}
