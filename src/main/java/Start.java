public class Start implements JogoEstado{

    private Start() {};
    private static Start instance = new Start();
    public static Start getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Start";
    }

    public String comecar(Jogo jogo) {
        return "Jogo não inicado";
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
