
package q4;


public class Carro extends Brinquedo implements BrinquedoMovivel{

  
    public Carro(String nome, int velocidade, int aceleracao){
      
        super(nome, velocidade, aceleracao);
       
    }

    @Override
    public boolean Mover(){

      
        velocidade = aceleracao*4;
          
            return true;
          
        
    }
    @Override
    public String toString() {
        String s ="[";
        s += " Velocidade Carro: " + velocidade;
        s+="]";
        return s;
    }
}
