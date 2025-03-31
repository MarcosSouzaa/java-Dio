package edu.marcos.primeirasemana042025;

public class Operadores {

    public static void main(String[] args) {
        
        // String nomeCompleto = "LINGUAGEM" + "JAVA";
        // System.out.println(nomeCompleto); // LINGUAGEMJAVA

        // String concatenacao = "?";

        // concatenacao = 1+1+1+ "1";
        // System.out.println(concatenacao); //31

        // concatenacao = 1+"1"+1+1;        
        // System.out.println(concatenacao); //1111

        // concatenacao = 1+"1"+1+"1";        
        // System.out.println(concatenacao); //1111

        // concatenacao = "1"+1+1+1;
        // System.out.println(concatenacao); //1111

        // concatenacao ="1"+(1+1+1);        
        // System.out.println(concatenacao); //13  
        
        // *************************************************************************************************

        //Operações com unários

        // int numero = 5;
        // System.out.println(numero); //5

        // numero = - numero;
        // System.out.println(numero); //-5

        // numero = + numero; // aqui não mudo a condição negativa, só concateno
        // System.out.println(numero); //-5

        // numero = numero * (-1); //essa é a forma correta
        // System.out.println(numero);// 5

        // *************************************************************************************************

        // iNCREMENTAÇÃO

        // int numero = 6;

        // numero ++;
        // System.out.println(numero);// 7

        // System.out.println(numero++); // 7 aqui se aplica a regra: Eu quero imprimir esse valor e depois implementá-lo.
        // System.out.println(numero++); // 8 aqui na segunda impressão com implementação
        // System.out.println(numero++); // 9 aqui na terceira impressão com implementação
        
        // // Se eu quiser antecipar a incrementação, coloco os sinais ++ antes da variável 
        // int numero2 = 10;
        // System.out.println(++ numero2); // 11

        //   // *************************************************************************************************
        
        //  // DECREMENTO
         
        //  int numero3 = 10;
        //  System.out.println(numero3 --); //10
        //  System.out.println(numero3 --); //9
        //  System.out.println(numero3 --); //8

        //  int numero4 = 10;
        //  System.out.println(-- numero4);//9 com o sinal antes, decrementa imediatamente.
        //  System.out.println(numero4 --);//9 com o sinal -- depois, primeiro imprime o valor, na segunda vez decrementa
        //  System.out.println(numero4 --);//8 Aqui, decrementado.


        // *************************************************************************************************

        // NEGAÇÃO

        // boolean variavel = true;
        // System.out.println(variavel);//true

        // System.out.println(!variavel);//false - negando 

        // System.out.println(variavel);//true - a variável não alterou seu valor. Continua true.

        // //para inverter a variável para que seja false, preciso negar ela mesma:

        // variavel = !variavel;
        // System.out.println(variavel);//false

         // *************************************************************************************************

         // OPERADOR TERNÁRIO

         int a, b;

         a = 6;
         b = 5;

         //----------- USANDO IF E ELSE ---------------

        //  String resultado = "";
        //  if(a==b)
        //     resultado = "Verdadeiro";
        //  else
        //     resultado = "falso";

         //----------- USANDO OPERADOR TERNÁRIO ---------------
         
         String resultado = a == b ? "Verdadeiro" : "falso";
         System.out.println(resultado);

         int resultado2 = a == b ? 1 : 0;
         System.out.println(resultado2);
         





  
 
    }
}
