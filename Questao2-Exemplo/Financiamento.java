public class Financiamento {
    
    public  Double valorTotal;
    public  Double entrada;
    public  int parcelas;

    
    
    public Financiamento(Double valorTotal, Double entrada, Integer parcelas) {
        
        
        if ( entrada < valorTotal * 0.15){
            throw new RuntimeException("A entrada deve ser de pelo menos 15%");
        }
        else if (parcelas <6){
            throw new RuntimeException("O numero minimo de parcelas deve ser 6"); 
        }
        
        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }
    
    
    
    public double prestacao(){
        
        return(valorTotal - entrada)/parcelas;
    }
    
    
}
