package edu.marcos.primeirasemana042025;

public class Operadores {

    public static void main(String[] args) {
        
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto); // LINGUAGEMJAVA

        String concatenacao = "?";

        concatenacao = 1+1+1+ "1";
        System.out.println(concatenacao); //31

        concatenacao = 1+"1"+1+1;        
        System.out.println(concatenacao); //1111

        concatenacao = 1+"1"+1+"1";        
        System.out.println(concatenacao); //1111

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao); //1111

        concatenacao ="1"+(1+1+1);        
        System.out.println(concatenacao); //13   
    }
}
