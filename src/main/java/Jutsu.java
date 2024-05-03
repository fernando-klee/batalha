public class Jutsu {
    private int chakraConsumido;
    private int danoNoOponente;

    public Jutsu(int chakraConsumido, int danoNoOponente) {
        this.chakraConsumido = chakraConsumido;
        this.danoNoOponente = danoNoOponente;
    }

    public int getChakraConsumido() {
        return chakraConsumido;
    }

    public int getDanoNoOponente() {
        return danoNoOponente;
    }
}
