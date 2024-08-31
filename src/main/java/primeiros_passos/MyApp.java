/*package primeiros_passos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {

    @Autowired
    private Calculadora calculadora ;
    @Override
    public void run(String... args) throws Exception {

        System.out.println("O resultado é : " + calculadora.somar(5,6));
    }
}
// usando o @Component não usa o "new" para as instruções
//e para o @Component consiga ter outra dependencia de outro componente tem que usa o @Autowired para injetar outro componente !
*/