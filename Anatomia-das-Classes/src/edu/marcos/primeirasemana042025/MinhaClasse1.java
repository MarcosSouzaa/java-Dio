package edu.marcos.primeirasemana042025;

public class MinhaClasse1 {
     
    public static void main(String [] args){

        // Retornando nome completo

        String primeiroNome = "Marcos";
        String segundoNome = "Souza";
        String nomeCompleto = chamarNomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto); // chama: Marcos Souza

        //*****************************************************************************************************

        //Retornando resultado da soma de dois números

        int numeroUm = 54;
        int numeroDois= 56;
        String resultadoDaSoma = somar(numeroUm, numeroDois);

        System.out.println(resultadoDaSoma);
    }

    //************************** MÉTODOS ***********************************************************************

     //Método chamar Nome Completo
     public static String chamarNomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
     }

     //Método somar
     public static String somar (int numeroUm, int numeroDois){
        return "Resultado da soma: " + (numeroUm + numeroDois) ;
     }

     
}
