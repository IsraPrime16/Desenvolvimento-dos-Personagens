public class Mago extends Personagem {
    private int mana;

    // Construtor
    public Mago(String nome, int vida, int forca, int mana) {
        super(nome, vida, forca);
        this.mana = mana;
    }

    
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    
    @Override
    public void exibirInfo() {
        super.exibirInfo(); 
        System.out.println("Mana: " + mana);
    }
}