public class Play implements JogoEstado{

    private Play() {};
    private static Play instance = new Play();
    public static Play getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Play";
    }

    public String comecar(Jogo jogo) {
        return "Jogo não inicado";
    }

    public String jogar(Jogo jogo) {
        return "Jogo em andamendo Não Realizado";
    }

    public String perder(Jogo jogo) {
        jogo.setEstado(GameOver.getInstance());
        return "Game Over";
    }

    public String ganhar(Jogo jogo) {
        jogo.setEstado(Vitoria.getInstance());
        return "Vitória !!!!!!!!";
    }

    public String pausar(Jogo jogo) {
        jogo.setEstado(Pausa.getInstance());
        return "Jogo Pausado ";
    }


}
