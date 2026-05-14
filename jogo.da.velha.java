package jogodavelha;
 
import java.util.Scanner;
 
public class JogoDaVelha {
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        // Tabuleiro como matriz simples
        char[][] tabuleiro = new char[3][3];
        inicializarTabuleiro(tabuleiro);
 
        char jogadorAtual = 'X';
 
        while (true) {
 
            mostrarTabuleiro(tabuleiro);
 
            System.out.println("Jogador " + jogadorAtual + ", informe linha e coluna:");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();
 
            if (marcarPosicao(tabuleiro, linha, coluna, jogadorAtual)) {
 
                if (existeVitoria(tabuleiro, jogadorAtual)) {
                    mostrarTabuleiro(tabuleiro);
                    System.out.println("Jogador " + jogadorAtual + " venceu!");
                    break;
                }
 
                if (estaCheio(tabuleiro)) {
                    mostrarTabuleiro(tabuleiro);
                    System.out.println("Empate!");
                    break;
                }
 
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
 
            } else {
                System.out.println("Posição inválida, tente novamente.");
            }
        }
 
        scanner.close();
    }
 
    // ================= FUNÇÕES =================
 
    static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }
 
    static boolean marcarPosicao(char[][] tabuleiro, int linha, int coluna, char jogador) {
        if (linha >= 0 && linha < 3 &&
            coluna >= 0 && coluna < 3 &&
            tabuleiro[linha][coluna] == ' ') {
 
            tabuleiro[linha][coluna] = jogador;
            return true;
        }
        return false;
    }
 
    static void mostrarTabuleiro(char[][] tabuleiro) {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }
 
    static boolean existeVitoria(char[][] tabuleiro, char jogador) {
 
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador &&
                tabuleiro[i][1] == jogador &&
                tabuleiro[i][2] == jogador) {
                return true;
            }
 
            if (tabuleiro[0][i] == jogador &&
                tabuleiro[1][i] == jogador &&
                tabuleiro[2][i] == jogador) {
                return true;
            }
        }
 
        if (tabuleiro[0][0] == jogador &&
            tabuleiro[1][1] == jogador &&
            tabuleiro[2][2] == jogador) {
            return true;
        }
 
        if (tabuleiro[0][2] == jogador &&
            tabuleiro[1][1] == jogador &&
            tabuleiro[2][0] == jogador) {
            return true;
        }
 
        return false;
    }
 
    static boolean estaCheio(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}