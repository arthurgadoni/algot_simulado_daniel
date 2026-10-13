import java.util.Scanner;

public class algoritmo_simulado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fases_faceis;
        int fases_dificeis;
        int horas_faceis;
        int horas_dificeis;
        int horas_totais;
        double valor_total;

        System.out.print("Quantas fases faceis tem no jogo? ");
        fases_faceis = sc.nextInt();

        fases_dificeis = 96 - fases_faceis;
        horas_faceis = fases_faceis;
        horas_dificeis = fases_dificeis * 2;
        horas_totais = horas_faceis + horas_dificeis;
        valor_total = horas_totais * 5.0;

        System.out.println("Quantidade fases faceis é de: " + fases_faceis);
        System.out.println("Quantidade fases dificeis é de: " + fases_dificeis);
        System.out.println("Horas nas fases faceis é de: " + horas_faceis);
        System.out.println("Horas nas fases dificeis é de: " + horas_dificeis);
        System.out.println("Total de horas gastas ate concluir o jogo é de: " + horas_totais);
        System.out.printf("Valor em reais da jogatina é de: R$ %.2f%n", valor_total);

        sc.close();
    }
}