public class testeRemedio {
      public static void main(String[] args) {
        
        Remedio teste1=new Remedio(1234,"Dipirona");
        teste1.setDataDeFabricacao("14/5/2020");
        teste1.setPreco(55.60);
        teste1.reduzirPreco(10.60);
        teste1.setValidade(5);
        teste1.imprimir();
        if(teste1.ehValido(2)){
            System.out.println("É valido");
        }
        else{
            System.out.println("Não é válido");
        }
        
        teste1.aumentarPreco(20.0);
        teste1.imprimir();
        
         Remedio teste2=new Remedio(12356,"Nimesulida","20/07/2020",90);
      }
    
}
