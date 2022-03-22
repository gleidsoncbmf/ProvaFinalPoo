
public class Mouse extends EquipamentoEletronico implements Controlador {
    
    //atributos
    private boolean ligado;
    
   
    
    //Construtor
    public Mouse(boolean ligado, String marca, double preço){
        this.ligado = ligado;
        this.marca = marca;
        this.preço = preço;
        
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }


    @Override
    public void aplicarDesconto() {
        preço = preço * 0.70;
    }
    
    public void aplicarDesconto(double valor) {
        preço = preço -valor;
    }
    public void aplicarDesconto(boolean des, double porcentagem) {
        if (des == true){
            porcentagem = 100 - porcentagem;
            porcentagem = porcentagem  * 0.01;
            preço = preço*porcentagem;
        }
        
               
        
        
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
        s += " Marca: " + marca;
        s += " Preço: " + preço;
        s+="]";
        return s;
    }
    
    
    
    
}
