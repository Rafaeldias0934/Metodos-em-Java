package ExercitandoMetodos;

public class Main {
    public static void main(String[] args) {

        // ExercitandoMetodos.Calculadora
        System.out.println("Exercicios da calculadora");
        Calculadora.soma(35,41);
        Calculadora.subtracao(14,4);
        Calculadora.multiplicacao(200,10);
        Calculadora.divisao(40,10);

        // Hora do dia
        System.out.println("ExercitandoMetodos.Mensagem do dia: ");
        Mensagem.obterMensagem(1);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(20);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(100, 5);
    }
}