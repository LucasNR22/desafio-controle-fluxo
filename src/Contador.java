import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner lerTela = new Scanner(System.in);

        int firstNumeber, secondNumber;

        System.out.println("Digite o primeto numero: ");
        firstNumeber = lerTela.nextInt();
        System.out.println("Digite o segundo numero: ");
        secondNumber = lerTela.nextInt();
        
        try {
            contar(firstNumeber, secondNumber); 
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o priomeiro.");
        }
        
        lerTela.close();

    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois ){
            throw new ParametrosInvalidosException();
        }else {
            int contagem = parametroDois - parametroUm;
            for (int i = 0; i <= contagem; i++){
                System.out.println("Numero "+ i);
            }
        }
	}
}
