package ExercitandoMetodos;

public class Mensagem {

    public static void obterMensagem(int hora) {
        switch (hora) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 -> mensagemBomDia();
            case 12,13,14,15,16,17 -> mensagemBoaTarde();
            case 18,19,20,21,22,23 -> mensagemBoaNoite();
            default -> horaInvalida();
        }
    }
    public static void mensagemBomDia() {
        System.out.println(" Bom dia!! ");
    }
    public static void mensagemBoaTarde() {
        System.out.println(" Boa Tarde!! ");
    }

    public static void mensagemBoaNoite() {
        System.out.println(" Boa Noite!! ");
    }

    public static void horaInvalida() {
        System.out.println("Hora inválida");
    }
}
