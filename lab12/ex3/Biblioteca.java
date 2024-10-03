package lab12.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Java Anti-Stress", "Omodionah", "2020", "123-456-789"));
        livros.add(new Livro("A Guerra dos Padrões", "Jorge Omel", "2019", "987-654-321"));
        livros.add(new Livro("A Procura da Luz", "Khumatkli", "2018", "456-123-789"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirBiblioteca(livros);
            System.out.println(">> <livro>, <operação: (1)regista; (2)requisita; (3)devolve; (4)reserva; (5)cancela");
            System.out.print(">> ");
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            if (parts.length != 2) {
                System.out.println("Entrada inválida. Tente novamente.");
                continue;
            }

            try {
                int livroIndex = Integer.parseInt(parts[0].trim()) - 1;
                int operacao = Integer.parseInt(parts[1].trim());

                if (livroIndex < 0 || livroIndex >= livros.size()) {
                    System.out.println("Livro inválido. Tente novamente.");
                    continue;
                }

                Livro livro = livros.get(livroIndex);
                switch (operacao) {
                    case 1:
                        livro.regista();
                        break;
                    case 2:
                        livro.requisita();
                        break;
                    case 3:
                        livro.devolve();
                        break;
                    case 4:
                        livro.reserva();
                        break;
                    case 5:
                        livro.cancelaReserva();
                        break;
                    default:
                        System.out.println("Operação inválida");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida");
            }
        }
        scanner.close();
    }

    private static void exibirBiblioteca(List<Livro> livros) {
        System.out.println("*** Biblioteca ***");
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            System.out.println((i + 1) + " " + livro.getTitulo() + " " + livro.getAutor() + " " + livro.getEstado());
        }
    }
}

