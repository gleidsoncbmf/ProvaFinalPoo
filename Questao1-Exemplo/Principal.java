
public class Principal {

   
    public static void main(String[] args) {
        
        Controle c1 = new Controle(false, "Preto", "Samsung", 30);
        Mouse m1 = new Mouse(true, "Razer", 30);
        
        System.out.println(c1);
        System.out.println(m1);
        
        //Poliformismo ao executar o metodo aplicarDesconto e SobreCarga ao usar o mesmo método na mesma classe com execuções diferentes.
        c1.aplicarDesconto();
        m1.aplicarDesconto(5.2);
        m1.aplicarDesconto();
        m1.aplicarDesconto(true, 5);
        
        
        System.out.println(c1);
        System.out.println(m1);
    }
    
}
