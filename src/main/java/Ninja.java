public class Ninja {
    private  String nome;
    private int quantidadechakra = 100;
    private Jutsu jutsuPrincipal;

    public Ninja(String nome, Jutsu jutsuPrincipal) {
        this.nome = nome;
        this.jutsuPrincipal = jutsuPrincipal;
    }

    public void atacar(Ninja ninjaOponente){
        ninjaOponente.receberGolpe(jutsuPrincipal.getDanoNoOponente());
        quantidadechakra -= jutsuPrincipal.getChakraConsumido();
    }

    public void receberGolpe(int danoGolpeRecebido) {
        quantidadechakra -= danoGolpeRecebido;
    }

    public String getNome() {
        return nome;
    }
    public int getQuantidadechakra() {
        return quantidadechakra;
    }
}
