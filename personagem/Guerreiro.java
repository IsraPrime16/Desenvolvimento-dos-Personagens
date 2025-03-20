public class Guerreiro extends Personagem {
    private String espada;

    
    public Guerreiro(String nome, int vida, int forca, String espada) {
        super(nome, vida, forca); 
        this.espada = espada;
    }

    
    public String getEspada() {
        return espada;
    }

    public void setEspada(String espada) {
        this.espada = espada;
    }

    
    @Override
    public void exibirInfo() {
        super.exibirInfo(); 
        System.out.println("Espada: " + espada);
    }
}