
//Classe herdando Classe mãe e implementando EquipamentoEletronico
public class Controle extends EquipamentoEletronico implements Controlador {
    
    //atributos
    private boolean ligado;
    private String cor;
    
   
    
    //Construtor
    public Controle(boolean ligado, String cor, String marca, double preço) {
        this.ligado = ligado;
        this.cor = cor;
        this.marca = marca;
        this.preço = preço;
        
    }

    //Metodos
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
     public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    } 

    @Override
    public void ligar() {
        this.setLigado(true);
        
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        
    }

    
    @Override
    public String toString() {
        String s ="[";
        s += " Ligado: " + ligado;
        s += "; Cor: " + cor;
        s += "; Marca: " + marca;
        s += "; Preço: " + preço;
        s+="]";
        return s;
    }

    @Override
    public void aplicarDesconto() {
        preço = preço * 0.80;
    }

    
    
    
    
    
}
