// public class Javaex {

//     public static void main(String[] args) {
//         ex03();
//     }


//     public static void ex03(){
//         int action;
//         int valor;
//         ContaBancaria conta = new ContaBancaria();
//         System.out.print("digite o numero da conta: ");
//         conta.setNumConta(Console.leitor.nextInt());
//         Console.leitor.nextLine();
//         System.out.print("digite o titular da conta: ");
//         conta.setTitularConta(Console.leitor.nextLine());
//         System.out.print("digite o saldo da conta: ");
//         conta.setSaldo(Console.leitor.nextFloat());
//         do {
//             System.out.println("\nqual operaçao deseja realizar?");
//             System.out.println("1 - depositar dinheiro");
//             System.out.println("2 - sacar dinheiro");
//             System.out.println("3 - informacoes da conta");
//             System.out.println("4 - sair do banco");
//             action = Console.leitor.nextInt();
//             switch (action) {
//                 case 1:
//                     System.out.println("quanto quer depositar? ");
//                     valor = Console.leitor.nextInt();
//                     conta.depositar(valor);
//                     break;
//                 case 2:
//                     System.out.println("quanto quer sacar? ");
//                     valor = Console.leitor.nextInt();
//                     conta.sacar(valor);
//                     break;
//                 case 3:
//                     conta.exibirInfo();
//                     break;
//                 case 4:
//                     System.out.println("ATE BREVE!!!");
//                     break;
//                 default:
//                     System.out.println("ERROR!!!! NUMERO INVALIDO! ");
//                     break;
//             }

//         } while (action != 4);
//     }
// }

public class Javaex {

    public static void main(String[] args) {
        ex03();
    }


    public static void ex03(){
        int action;
        int valor;
        Jogador jogador = new Jogador();
        System.out.print("digite o nome do jogador: ");
        jogador.setNome(Console.leitor.nextLine());
        System.out.print("digite o nivel do jogador: ");
        jogador.setNivel(Console.leitor.nextInt());
        Console.leitor.nextLine();
        System.out.print("digite a pontuacao do jogador: ");
        jogador.setPontuacao(Console.leitor.nextInt());
        do {
            System.out.println("\nqual operaçao deseja realizar?");
            System.out.println("1 - aumentar nivel");
            System.out.println("2 - aumentar pontuacao");
            System.out.println("3 - informacoes da conta");
            System.out.println("4 - sair");
            action = Console.leitor.nextInt();
            switch (action) {
                case 1:
                    System.out.println("quantos niveis quer subir? ");
                    valor = Console.leitor.nextInt();
                    jogador.subirNivel(valor);
                    break;
                case 2:
                    System.out.println("quanto quer aumentar a pontuacao?  ");
                    valor = Console.leitor.nextInt();
                    jogador.mudarPontuacao(valor);
                    break;
                case 3:
                    jogador.exibirInfo();
                    break;
                case 4:
                    System.out.println("ATE BREVE!!!");
                    break;
                default:
                    System.out.println("ERROR!!!! NUMERO INVALIDO! ");
                    break;
            }

        } while (action != 4);
    }
}
