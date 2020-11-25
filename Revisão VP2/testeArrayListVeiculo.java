import java.util.*;
import java.util.Scanner;

public class testeArrayListVeiculo {
    public static void main(String[] args) {
        ArrayList<VeiculoNovo> veiculos = new ArrayList<VeiculoNovo>();

        Scanner scan = new Scanner(System.in);
        String escolha="";

        while (!escolha.equalsIgnoreCase("listar")) {
            System.out.println("Escolha a opção \n- carro\n- caminhão\n- listar");
            escolha = scan.next();

            if(escolha.equalsIgnoreCase("carro")){
                
                System.out.print("Digite o placa: ");
                String placa = scan.next();

                System.out.print("Digite o chassi: ");
                long chassi = scan.nextLong();

                System.out.print("Digite o ano: ");
                int ano = scan.nextInt();

                System.out.print("Digite o peso: ");
                int peso = scan.nextInt();

                System.out.print("Digite a velocidade máxima: ");
                float velocMax = scan.nextFloat();

                System.out.print("Digite o preço: ");
                float preco = scan.nextFloat();

                System.out.print("Digite a capacidade: ");
                int capacidade = scan.nextInt();

                System.out.print("Digite a cor: ");
                String cor = scan.next();

                System.out.print("Digite o modelo: ");
                String modelo = scan.next();
                
                CarroPasseio carro = new CarroPasseio(placa, chassi, ano, peso, velocMax, preco, capacidade, cor,
                        modelo);

                veiculos.add(carro);

            } else if(escolha.equalsIgnoreCase("caminhao")){
                System.out.print("Digite o placa: ");
                String placa = scan.next();

                System.out.print("Digite o chassi: ");
                long chassi = scan.nextLong();

                System.out.print("Digite o ano: ");
                int ano = scan.nextInt();

                System.out.print("Digite o peso: ");
                int peso = scan.nextInt();

                System.out.print("Digite a velocidade máxima: ");
                float velocMax = scan.nextFloat();

                System.out.print("Digite o preço: ");
                float preco = scan.nextFloat();

                System.out.print("Digite a capacidade: ");
                int capacidade = scan.nextInt();
                
                System.out.print("Digite as toneladas: ");
                float toneladas = scan.nextFloat();

                System.out.print("Digite a alturaMax: ");
                float alturaMax = scan.nextFloat();

                System.out.print("Digite o comprimento: ");
                float comprimento = scan.nextFloat();
                
                CaminhaoVP2 caminhao = new CaminhaoVP2( placa, chassi, ano, peso, velocMax,  preco,  capacidade,
                 toneladas,  alturaMax,  comprimento);

                veiculos.add(caminhao);
            }
        }
        for(VeiculoNovo veiculo : veiculos){
            veiculo.exibir();
        }
    }
}
