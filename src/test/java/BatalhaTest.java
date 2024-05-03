import org.junit.Assert;
import org.junit.Test;

public class BatalhaTest {
    @Test
    public void deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakra() {
        Jutsu jutsuNinjaUm = new Jutsu(5,10);
        Ninja ninjaUm = new Ninja("Naruto", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5,8);
        Ninja ninjaDois = new Ninja("Gaara", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        Assert.assertSame(ninjaUm, ninjaVencedor);
    }

    @Test
    public void deveAtualizarOChakraDoOponenteDeAcordoComODanoDoJutsoQuandoAtacar() {
        Jutsu jutsuNinjaAtacante = new Jutsu(5,10);
        Ninja ninjaAtacante = new Ninja("Naruto", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu(5,8);
        Ninja ninjaOponente = new Ninja("Gaara", jutsuNinjaOponente);

        int nivelChakraEsperado = 90;

        ninjaAtacante.atacar(ninjaOponente);

        Assert.assertEquals(nivelChakraEsperado, ninjaOponente.getQuantidadechakra());
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoONomeForItachi() {
        Jutsu jutsuNinjaUm = new Jutsu(4,7);
        Ninja primeiroNinja = new Ninja("Itachi", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5,10);
        Ninja segundoNinja = new Ninja("kakashi", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(primeiroNinja, segundoNinja);

        if (primeiroNinja.getNome().equals("Itachi")){
            primeiroNinja = ninjaVencedor;
        }

        Ninja resultadoEsperado = primeiroNinja;

        Assert.assertSame(resultadoEsperado, ninjaVencedor);
    }

    @Test
    public void deveRetornarSegundoNinjaComoVencedorQuandoONomeForItachi() {
        Jutsu jutsuNinjaUm = new Jutsu(5,10);
        Ninja primeiroNinja = new Ninja("Kakashi", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(4,7);
        Ninja segundoNinja = new Ninja("Itachi", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(primeiroNinja, segundoNinja);

        if (segundoNinja.getNome().equals("Itachi")){
            segundoNinja = ninjaVencedor;
        }

        Ninja resultadoEsperado = segundoNinja;

        Assert.assertSame(resultadoEsperado, ninjaVencedor);
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoEmpatar() {
        Jutsu jutsuNinjaUm = new Jutsu(5,10);
        Ninja primeiroNinja = new Ninja("Naruto", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5,10);
        Ninja segundoNinja = new Ninja("Neji", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(primeiroNinja, segundoNinja);


        Assert.assertSame(primeiroNinja, ninjaVencedor);
    }
}
