public class Batalha {

    private Ninja ninjaVencedor;
    public Ninja lutar(Ninja primeiroNinja, Ninja segundoNinja) {
        for (int i = 0; i < 3; i++) {
            primeiroNinja.atacar(segundoNinja);
        }
        for (int i = 0; i < 3; i++) {
            segundoNinja.atacar(primeiroNinja);
        }
        if (primeiroNinja.getQuantidadechakra() >= segundoNinja.getQuantidadechakra()) {
            return ninjaVencedor = primeiroNinja;
        } return ninjaVencedor = segundoNinja;
    }
}
