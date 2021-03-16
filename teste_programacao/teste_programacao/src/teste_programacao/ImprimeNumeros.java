package teste_programacao;

import java.util.ArrayList;

public class ImprimeNumeros {
	
	
	public void imprimir(){
		MultiploTres tres = new MultiploTres();
		MultiploCinco cinco = new MultiploCinco();
		MultiploQuinze quinze = new MultiploQuinze();
		
		for (int i = 1; i < 101; i++) {
			
			if(quinze.search(i)){
				System.out.println("fizzbuzz " + "\n");
			}else if(tres.search(i)){
				System.out.println("fizz " + "\n");
			}else if(cinco.search(i)){
				System.out.println("buzz" + "\n");
			}else{
				System.out.println(i + "\n");
			}
		}
	}
	
	public void imprimir2(){
		Operacao op = new Operacao();
		ArrayList<String> tres = new ArrayList<String>();
		ArrayList<String> cinco = new ArrayList<String>();
		ArrayList<String> sete = new ArrayList<String>();
		ArrayList<String> retorno = new ArrayList<String>();
		for (int i = 1; i < 101; i++) {
			tres.add(op.search(i, 3, "fizz"));
			cinco.add(op.search(i, 5, "buzz"));
			sete.add(op.search(i, 7, "sete"));
		}
		
		for (int i = 0; i < tres.size(); i++) {
			if (tres.get(i).equals("") && cinco.get(i).equals("") && sete.get(i).equals("")){
				retorno.add(i, Integer.toString(i+1));
			}else {
				retorno.add(i, tres.get(i) + cinco.get(i) + sete.get(i));
			}
		}
		
		for (int i = 0; i < retorno.size(); i++) {
			System.out.println(retorno.get(i));
		}
	}
	
}
