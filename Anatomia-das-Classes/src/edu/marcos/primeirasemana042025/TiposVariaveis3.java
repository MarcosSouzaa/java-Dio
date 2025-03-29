package edu.marcos.primeirasemana042025;

public class TiposVariaveis3 {

    public static void main(String[] args) {

        //tipos em java

        byte idade = 123;
        short ano = 2025;
        int cep = 21070333; // se começar com zero, é melhor usar String
        long cpf = 987765432109L; // TEM QUE USAR O L e se começar com zero é melhor usar String
        float pi = 3.14f; // tem que usar o f
        double salario = 1275.53;
        boolean falso = true;
        char meuChar = 'A';
        String meuNomeCompleto ="Marcos Antonio Silva de Souza";

        //CONSTANTE, precisa usar a palavra reservada final e por convenção
        // é escrita em MAIÚSCULA.

        final double VALOR_DE_PI = 3.1416;    

        System.out.println(idade);
        System.out.println(ano);
        System.out.println(cep);
        System.out.println(cpf);
        System.out.println(pi);
        System.out.println(salario);
        System.out.println(falso);
        System.out.println(meuChar);
        System.out.println(meuNomeCompleto);
        System.out.println(VALOR_DE_PI);


    }
    
}
