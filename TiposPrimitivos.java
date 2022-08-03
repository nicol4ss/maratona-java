public class TiposPrimitivos {
    public static void main(String[] args) {

        int idade = 10;//  4 bytes === +- -2 billions to +2 billions
        long numeroGrande = 1000000;//  8 bytes === gigantesco
        double salarioDouble = 2000;//  8 bytes === 1.7 ± e308
        float salarioFloat = 2000;// 4 bytes === 3.4 ± e38 
        byte idadeByte = 127;// 1 byte === -128 to 127
        short idadeShort = 10;// 2 bytes === -32768 to 32767
        boolean verdadeiro = true;// 1 bit === 0 or 1 
        boolean falso = false;// 1 bit === 0 or 1 
        char caracter =  'A';// 2 bytes === qualquer caracter da tabela ASCII ou UNICODE
        

        // Casting --> Compilador não entende a tipagem é resolvido:
        // As iniciais dos tipos são considerados como especificação
        float salarioFloat2 = 2000.0f;//  Colocando um f especificando q é float
        double salarioDouble2 = 2000.0d;//  Ou um d especificando que é double
        

        // A Maneira de "forçar" colocar um tipo em outra da seguinte forma:
        //O L no final do numero long especifica que ele é um long
        // E quer converter o long em int para fazer caber no tamanho de um int
        int idade2 = (int) 100000000000000L;// Porem isso vai ser cortado uns bytes
        float salarioFloat3 = (float) 4000.0d;// é possivel tb mas se perde bytes

        // String é uma classe
        String nome = "Treinando tipos primitivos";

        System.out.println(idade);
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caracter);
        System.out.println(salarioFloat2);
        System.out.println(salarioDouble2);
        System.out.println(idade2);
        System.out.println(salarioFloat3);
        System.out.println(nome);
    }
}