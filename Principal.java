import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Conta c1 = new Conta(123,"Poupança","Jailson",2000);
		
		System.out.println(c1.getDescricao());
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha a opção: Saque(1) ou Deposito(2) !");
		int numero = entrada.nextInt();
		switch(numero){
			case 1:
		       System.out.println("Opção Escolhida: Saque !");
		       
		       System.out.println("Digite o valor do Saque: ");
		       c1.saque = scan.nextDouble();
		       
		       if(c1.saque > c1.saldo){
		    	   System.out.println("Você não tem Dinheiro o Suficiente!");
		       }
		       
		       if(c1.saque <= c1.saldo){
		       c1.getSaque();
		       System.out.println("Olá " + c1.nome + " voçê fez um saque de: " +c1.saque+ " Resta em sua conta: " +c1.saldo + " R$.");
		       }
		       break;
		       
		       
		       
		     case 2:
		       System.out.println("Opção Escolhida: Deposito !");
		       
		       System.out.println("Digite o valor do Deposito: ");
		       c1.deposito = scan.nextDouble();
		       
		       if(c1.deposito <= 0) {
		    	   System.out.println("O deposito não pode ser menor ou igual a 0 R$");
		       }
		       
		       if(c1.deposito > 0){
		       c1.getDeposito();
		       System.out.println("Olá " + c1.nome + " voçê fez um Deposito de: " +c1.deposito+ " Possui em sua conta: " +c1.saldo + " R$.");
		       }
		       break;
		       
		     default:
		         System.out.println("Opção Invalida ! Escolha a opção: Saque(1) ou Deposito(2) !");
		}
			
	}

}
