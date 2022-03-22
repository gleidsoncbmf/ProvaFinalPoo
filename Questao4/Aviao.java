public class Aviao extends Brinquedo implements BrinquedoMovivel{

  

    public Aviao(String nome, int velocidade, int aceleracao) {

      
        super(nome, velocidade, aceleracao);
        
      
    }

    @Override
    public boolean Mover(){
        
        velocidade = (aceleracao*100) + 50;
                return true;
        
    }
    @Override
    public String toString() {
        String s ="[";
        s += " Velocidade Avião: " + velocidade;
        s+="]";
        return s;
    }
        
      
}
