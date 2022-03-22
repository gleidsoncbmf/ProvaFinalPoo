public class Barco extends Brinquedo implements BrinquedoMovivel{

  

    public Barco(String nome, int velocidade, int aceleracao) {

      
        super(nome, velocidade, aceleracao);
       
      
    }

    @Override
    public boolean Mover(){
            
        velocidade = (aceleracao * 3) + 10;
        return true;
      
        
    }
    @Override
    public String toString() {
        String s ="[";
        s += " Velocidade Barco: " + velocidade;
        s+="]";
        return s;
    }
}
