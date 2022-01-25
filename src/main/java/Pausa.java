public class Pausa implements JogoEstado{

    private Pausa() {};
    private static Pausa instance = new Pausa();
    public static Pausa getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pausa";
    }

    public String comecar(Jogo jogo) {
        jogo.setEstado(Start.getInstance());
        return "Jogo Inicado";
    }

    public String jogar(Jogo jogo) {
        jogo.setEstado(Play.getInstance());
        return "Jogo em andamendo";
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
