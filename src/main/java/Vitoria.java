public class Vitoria implements JogoEstado{

    private Vitoria() {};
    private static Vitoria instance = new Vitoria();
    public static Vitoria getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Vitoria";
    }

    public String comecar(Jogo jogo) {
        return "Jogo não inicado";
    }

    public String jogar(Jogo jogo) {
        return "Jogo em andamendo Não Realizado";
    }

    public String perder(Jogo jogo) {
        return "Game Over Não Realizado";
    }

    public String ganhar(Jogo jogo) {
        return "Vitória Não Realizada";
    }

    public String pausar(Jogo jogo) {
        return "Jogo Pausado Não Realizado";
    }

}
