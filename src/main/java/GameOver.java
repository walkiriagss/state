public class GameOver implements JogoEstado{

    private GameOver() {};
    private static GameOver instance = new GameOver();
    public static GameOver getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Game-Over";
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
        return "Vitoria Não Realizada";
    }

    public String pausar(Jogo jogo) {
        return "Jogo Pausado Não Realizado";
    }

}
