import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenarEstudantes {
    public static void main(String[] args) {
        String[] estudantes = {
            "Marcela Maria", "Augusto Fabio", "Breno Vinicius", "Weslley Ferreira",
            "César Augusto", "Gabriel Silva", "Diogo Freitas", "Eduardo Jose",
            "Emerson Vinicios", "Matheus da Silva", "Gabriel Felipe", "Nátali Isaltino",
            "Henrique Cezar", "Isadora Ribeiro", "Isadora Rodrigues", "João Reberth",
            "Lucas Alves", "André Luiz", "Vinícius Raphael", "Pedro Castro",
            "Marcus Paulo", "Maria Clara", "Daniela Teixeira", "Matheus Felipe",
            "Vinicius Garcia", "Paulo Vítor", "Arthur Maestri", "Pedro Rodrigues",
            "Rogério Lopes", "Thiago Luis", "Víctor Henrique", "Caio Alves",
            "Vinícius Paiva", "Lucas Marques", "Wesley Carvalho", "Lucas Ferreira"
        };

        List<String> listaDeEstudantes = Arrays.asList(estudantes);
        Collections.sort(listaDeEstudantes);

        for (String estudante : listaDeEstudantes) {
            System.out.println(estudante);
        }
    }
}
