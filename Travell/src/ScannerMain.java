import java.util.Scanner;

public class ScannerMain {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cpf;
		String email;
		String senha;
		String data_nascimento;
		
		
		System.out.println("Digite o seu CPF: ");
		cpf = s.nextInt();
		System.out.println("Digite o seu Email: ");
		email = s.nextLine();
		System.out.println("Digite a sua senha: ");
		senha = s.nextLine();
		System.out.println("Digite a sua data de nascimento: ");
		data_nascimento = s.nextLine();
				
				System.out.println("Dados cadastrais:\nCpf: " + cpf + "\nEmail: " + email + "\nSenha: " + senha + "\nData de nascimento: ");
				
	}

}
