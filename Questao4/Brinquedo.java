
    public abstract class Brinquedo{
  
    public String nome;
    public int velocidade;
    public int aceleracao;
   

    public Brinquedo(String nome, int velocidade, int aceleracao){
      
      
        this.nome = nome;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
      
    }
    
    public String getNome() {
      
        return nome;
      
    }

    public void setNome(String nome) {
      
        this.nome = nome;
      
    }

    public int getVelocidade() {
      
        return velocidade;
      
    }

    public void setVelocidade(int velocidade) {
      
        this.velocidade = velocidade;
      
    }

    public int getAceleracao() {
      
        return aceleracao;
      
    }

    public void setAceleracao(int aceleracao) {
      
        this.aceleracao = aceleracao;
      
    }
}
    

