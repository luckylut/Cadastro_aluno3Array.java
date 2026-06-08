import static java.lang.IO.*;

public class Main {

    public static void main(String[] args) {

        // Arrays dos alunos
        String nomes[] = new String[10];
        int idades[] = new int[10];
        String cursos[] = new String[10];

        // Controle
        int totalAlunos = 0;
        int opcao = 0;

        // Menu principal
        while (opcao != 5) {

            println("\n===== MENU =====");
            println("1 - Cadastrar aluno");
            println("2 - Listar alunos");
            println("3 - Buscar aluno");
            println("4 - Remover aluno");
            println("5 - Sair");

            println("Escolha uma opção:");
            opcao = Integer.parseInt(readln());

            // ======================
            // CADASTRAR ALUNO
            // ======================
            if (opcao == 1) {

                if (totalAlunos < 10) {

                    println("Nome:");
                    String nome = readln();

                    println("Idade:");
                    int idade =
                            Integer.parseInt(readln());

                    println("Curso:");
                    String curso = readln();

                    // Salvar nos arrays
                    nomes[totalAlunos] = nome;
                    idades[totalAlunos] = idade;
                    cursos[totalAlunos] = curso;

                    totalAlunos++;

                    println("Aluno cadastrado!");
                } else {
                    println("Limite de 10 alunos atingido!");
                }
            }

            // ======================
            // LISTAR ALUNOS
            // ======================
            else if (opcao == 2) {

                if (totalAlunos == 0) {

                    println("Nenhum aluno cadastrado.");

                } else {

                    println("\n=== ALUNOS ===");

                    for (int i = 0;
                         i < totalAlunos;
                         i++) {

                        println(
                                "\nAluno " + (i + 1)
                        );

                        println(
                                "Nome: " +
                                        nomes[i]
                        );

                        println(
                                "Idade: " +
                                        idades[i]
                        );

                        println(
                                "Curso: " +
                                        cursos[i]
                        );
                    }
                }
            }

            // ======================
            // BUSCAR ALUNO
            // ======================
            else if (opcao == 3) {

                println(
                        "Digite o nome do aluno:"
                );

                String busca = readln();

                boolean encontrado = false;

                for (int i = 0;
                     i < totalAlunos;
                     i++) {

                    if (nomes[i]
                            .equalsIgnoreCase(
                                    busca
                            )) {

                        println(
                                "Aluno encontrado!"
                        );

                        println(
                                "Nome: " +
                                        nomes[i]
                        );

                        println(
                                "Idade: " +
                                        idades[i]
                        );

                        println(
                                "Curso: " +
                                        cursos[i]
                        );

                        encontrado = true;
                    }
                }

                if (encontrado == false) {

                    println(
                            "Aluno não encontrado."
                    );
                }
            }

            // ======================
            // REMOVER ALUNO
            // ======================
            else if (opcao == 4) {

                println(
                        "Digite o nome do aluno para remover:"
                );

                String remover =
                        readln();

                int posicao = -1;

                // Procurar aluno
                for (int i = 0;
                     i < totalAlunos;
                     i++) {

                    if (nomes[i]
                            .equalsIgnoreCase(
                                    remover
                            )) {

                        posicao = i;
                    }
                }

                // Se encontrou
                if (posicao != -1) {

                    // Puxar elementos
                    for (int i = posicao;
                         i < totalAlunos - 1;
                         i++) {

                        nomes[i] =
                                nomes[i + 1];

                        idades[i] =
                                idades[i + 1];

                        cursos[i] =
                                cursos[i + 1];
                    }

                    totalAlunos--;

                    println(
                            "Aluno removido!"
                    );

                } else {

                    println(
                            "Aluno não encontrado."
                    );
                }
            }

            // ======================
            // SAIR
            // ======================
            else if (opcao == 5) {

                println(
                        "Programa encerrado."
                );
            }

            // Opção inválida
            else {

                println(
                        "Opção inválida!"
                );
            }
        }
    }
}