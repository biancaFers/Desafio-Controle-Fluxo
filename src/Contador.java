import java.util.Scanner;
public class Contador {
	public static void main(String[] args) {
            try (Scanner terminal = new Scanner(System.in)) {
                System.out.println("Digite o primeiro parâmetro");
                String parametroUm = terminal.nextLine(); //5;
                System.out.println("Digite o segundo parâmetro");
                String parametroDois = terminal.nextLine(); //15;

                try {
                    //chamando o método contendo a lógica de contagem
                    contar(parametroUm,parametroDois);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    
        static void contar(String parametroUm, String parametroDois) throws Exception {
            int numUm = Integer.parseInt(parametroUm);
            int numDois = Integer.parseInt(parametroDois);
            
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            if (numUm >= numDois) {
                throw new Exception("O segundo parâmetro deve ser maior que o primeiro");
            }

            for (int i = numUm; i <= numDois; i++) {
                System.out.println("Número: " + i);
            }
        }

    }
    

		