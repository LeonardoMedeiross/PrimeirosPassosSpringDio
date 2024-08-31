/*package appDois;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class mainSpring {
    public static void main(String[] args) {SpringApplication.run(mainSpring.class,args);}
        @Bean
    public CommandLineRunner run(SistemaDeMensagens sistema)throws Exception{
            return args ->{
                sistema.enviarConfirmacaoCadastro();
                sistema.enviarBoasVindas();
                sistema.enviarConfirmacaoCadastro();
            };
        }
    }
*/