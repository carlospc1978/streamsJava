import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.List;

@Log4j2
public class Principal {

    public static void main(String[] args) {

        List<String> stringsNomesDaMinhaFamilia = Arrays.asList("Carlos", "Tatiana", "Julia", "Laura");

        stringsNomesDaMinhaFamilia.stream().forEach(s -> System.out.println(s));
        stringsNomesDaMinhaFamilia.stream().forEach(s -> System.out.println(s));
        //work in master

    }

}
