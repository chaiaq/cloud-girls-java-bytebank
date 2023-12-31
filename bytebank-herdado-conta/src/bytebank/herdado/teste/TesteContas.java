package bytebank.herdado.teste;

import bytebank.herdado.modelos.ContaCorrente;
import bytebank.herdado.modelos.ContaPoupanca;
import bytebank.herdado.modelos.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException{
		
		/*
		int a = 3;
		int b = a / 0;
		*/
					
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());


	}

}
