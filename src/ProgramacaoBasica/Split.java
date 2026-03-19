package ProgramacaoBasica;

public class Split {
    public static void main (String[]args){
        String palavra = "apple potato sushi";

        String[] vect = palavra.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println("Vect 1: " + word1 +"\nVect 2: " + word2 +"\nVect 3: " + word3);
    }
}
