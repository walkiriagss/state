import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogoTest {

    Jogo jogo;

    @BeforeEach
    public void setUp() {
        jogo = new Jogo();
    }

    // Jogo Start

    @Test
    public void naoDeveStartarJogoStartado() {
        jogo.setEstado(Start.getInstance());
        assertEquals("Jogo não inicado", jogo.comecar());
    }

    @Test
    public void devePlayJogoStartado() {
        jogo.setEstado(Start.getInstance());
        assertEquals("Jogo em andamendo", jogo.jogar());
    }

    @Test
    public void NaoDevePerderJogoStartado() {
        jogo.setEstado(Start.getInstance());
        assertEquals("Game Over Não Realizado", jogo.perder());
    }

    @Test
    public void NaoDeveGanharJogoStartado() {
        jogo.setEstado(Start.getInstance());
        assertEquals("Vitória Não Realizada", jogo.ganhar());
    }

    @Test
    public void NaoDevePausarJogoStartado() {
        jogo.setEstado(Start.getInstance());
        assertEquals("Jogo Pausado Não Realizado", jogo.pausar());
    }

    // Jogo Play

    @Test
    public void naoDeveStartarJogoPlay() {
        jogo.setEstado(Play.getInstance());
        assertEquals("Jogo não inicado", jogo.comecar());
    }

    @Test
    public void naoDevePlayJogoPlay() {
        jogo.setEstado(Play.getInstance());
        assertEquals("Jogo em andamendo Não Realizado", jogo.jogar());
    }

    @Test
    public void devePerderJogoPlay() {
        jogo.setEstado(Play.getInstance());
        assertEquals("Game Over", jogo.perder());
    }

    @Test
    public void deveGanharJogoPlay() {
        jogo.setEstado(Play.getInstance());
        assertEquals("Vitória !!!!!!!!", jogo.ganhar());
    }

    @Test
    public void devePausarJogoPlay() {
        jogo.setEstado(Play.getInstance());
        assertEquals("Jogo Pausado ", jogo.pausar());
    }

    //GameOver

    @Test
    public void naoDeveStartarJogoGameOver() {
        jogo.setEstado(GameOver.getInstance());
        assertEquals("Jogo não inicado", jogo.comecar());
    }

    @Test
    public void naoDevePlayJogoGameOver() {
        jogo.setEstado(GameOver.getInstance());
        assertEquals("Jogo em andamendo Não Realizado", jogo.jogar());
    }

    @Test
    public void NaoDevePerderJogoGameOver() {
        jogo.setEstado(GameOver.getInstance());
        assertEquals("Game Over Não Realizado", jogo.perder());
    }

    @Test
    public void naoDeveGanharJogoGameOver() {
        jogo.setEstado(GameOver.getInstance());
        assertEquals("Vitoria Não Realizada", jogo.ganhar());
    }

    @Test
    public void NaoDevePausarJogoGameOver() {
        jogo.setEstado(GameOver.getInstance());
        assertEquals("Jogo Pausado Não Realizado", jogo.pausar());
    }

    //Vitoria

    @Test
    public void naoDeveStartarJogoVitoria() {
        jogo.setEstado(Vitoria.getInstance());
        assertEquals("Jogo não inicado", jogo.comecar());
    }

    @Test
    public void naoDevePlayJogoVitoria() {
        jogo.setEstado(Vitoria.getInstance());
        assertEquals("Jogo em andamendo Não Realizado", jogo.jogar());
    }

    @Test
    public void NaoDevePerderJogoVitoria() {
        jogo.setEstado(Vitoria.getInstance());
        assertEquals("Game Over Não Realizado", jogo.perder());
    }

    @Test
    public void naoDeveGanharJogoVitoria() {
        jogo.setEstado(Vitoria.getInstance());
        assertEquals("Vitória Não Realizada", jogo.ganhar());
    }

    @Test
    public void NaoDevePausarJogoVitoria() {
        jogo.setEstado(Vitoria.getInstance());
        assertEquals("Jogo Pausado Não Realizado", jogo.pausar());
    }

    //Pausar

    @Test
    public void DeveStartarJogoPausar() {
        jogo.setEstado(Pausa.getInstance());
        assertEquals("Jogo Inicado", jogo.comecar());
    }

    @Test
    public void DevePlayJogoPausa() {
        jogo.setEstado(Pausa.getInstance());
        assertEquals("Jogo em andamendo", jogo.jogar());
    }

    @Test
    public void NaoDevePerderJogoPausa() {
        jogo.setEstado(Pausa.getInstance());
        assertEquals("Game Over Não Realizado", jogo.perder());
    }

    @Test
    public void naoDeveGanharJogoPausa() {
        jogo.setEstado(Pausa.getInstance());
        assertEquals("Vitória Não Realizada", jogo.ganhar());
    }

    @Test
    public void NaoDevePausarJogoPausa() {
        jogo.setEstado(Pausa.getInstance());
        assertEquals("Jogo Pausado Não Realizado", jogo.pausar());
    }

}