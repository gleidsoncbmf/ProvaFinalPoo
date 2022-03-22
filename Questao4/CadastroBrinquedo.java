
import java.util.ArrayList;

public class CadastroBrinquedo{
  

    ArrayList<Brinquedo> brinquedos = new ArrayList<>();
    ArrayList<BrinquedoMovivel> brinquedo = new ArrayList<>();

    public void adicionarBrinquedo(Brinquedo x){

      
        brinquedo.add((BrinquedoMovivel) x);
        brinquedos.add(x);
      
    
    }


    public void Mover(){
        
        System.out.println("Todos se Movendo");
      
        for (int i = 0; i < brinquedos.size(); i++){
            
          
            if (brinquedos.get(i).getNome().equals("Carro") && brinquedo.get(i).Mover()){
              
                
            } 
          
          if (brinquedos.get(i).getNome().equals("Barco") && brinquedo.get(i).Mover()){
            
                
            } 
          
          if (brinquedos.get(i).getNome().equals("Avião") && brinquedo.get(i).Mover()){
              
                
            }
          
    }
        
    }

    
   }
     
