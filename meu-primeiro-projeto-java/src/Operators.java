public class Operators {
    public static void main(String [] args) {
        // Atributtion: =
        String nome = "Daniel";
        
        // Arithmetic: +, -, *, /, always remember to use the right type so you won't loose data.
        double somaDecimal = 10.5 + 15;
        int soma = 4 + 5;
        int sub = 4 - 5;
        int mult = 4 * 5;
        int div = 4 / 5;
        int modulo = 4 % 5;
        double resultado = (10.6 + 7) + (20 / 4); 
        String concatenar = "Manoel" + "Gomes"; // + operator has other feature called concat.

        // Unary: +, -, ++, -- Unary operators change the variable value to positive or negative.
        int number = 5;

        int number2 = - 5;
        System.out.println(number2);

        int numero3 = 5;
        
        int numero4 = numero3 + 1;
        System.out.println(numero4);

        System.out.println(++ numero4); // Increases the value before print
        System.out.println(-- numero4); // Decreases the value before print
    
        // Ternary operator is a alternative way to use if and else
        String resultado1;
        
        int a = 5;
        int b = 6;
        //if (a==b) {
        //    resultado1 = "Verdadeiro";
        //    System.out.println(resultado1);
        //}
        //else {
        //    resultado1 = "Falso";
        //    System.out.println(resultado1);
        //}
        String resultado2 = a==b ?"verdadeiro" : "falso";

        // Relational Operator: Relational operators compares 2 values, return a boolean value.
        // == - equals to
        // >= - equals or is bigger than
        // > - bigger than
        // <= - equals or is smaller than
        // < - smaller than
        // != - different than
        System.out.println("Is a bigger than b?" + resultado2);

        // Logic operators: Boolean algebra AND (&&) OR (||)

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("Condições são verdadeiras");
        }
        else {
            System.out.println("Condições são falsas");
        }

    }
}
