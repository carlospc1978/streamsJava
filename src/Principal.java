import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Log4j2
public class Principal {

    public static void main(String[] args) {

        List<String> stringsNomesDaMinhaFamilia = Arrays.asList("Carlos", "Tatiana", "Julia", "Laura");


        Scanner scanner = new Scanner(System.in);
        System.out.println("digite.:\n");
        String variavel = scanner.next();
        if(variavel.equals("123")){
            System.out.println("entre");
        }else{
            System.out.println("não entre");
        }

        stringsNomesDaMinhaFamilia.stream().forEach(s -> System.out.println(s));

    }

}
