
public class Teste {
    
    //O Poliformismo acontece ao chamar o método mover(), cada brinquedo se move de forma diferente usando o mesmo método.
  
    public static void main(String[] args) {

      
        CadastroBrinquedo cadastro = new CadastroBrinquedo();

        Brinquedo brinquedo1 = new Carro("Carro", 0, 2);
      
        Brinquedo brinquedo2 = new Barco("Barco", 0, 4);

      
        Brinquedo brinquedo3 = new Aviao("Avião", 0, 5);


        cadastro.adicionarBrinquedo(brinquedo1);
      
        cadastro.adicionarBrinquedo(brinquedo2);
      
        cadastro.adicionarBrinquedo(brinquedo3);
      
        cadastro.Mover();
        
        System.out.println(brinquedo1);
        System.out.println(brinquedo2);
        System.out.println(brinquedo3);

    }
}
    

