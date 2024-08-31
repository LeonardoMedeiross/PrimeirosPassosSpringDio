/*package app;

import primeiros_passos.PrimeirosPassosApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringPrimeirosPassos {

    public static void main(String[] args) {
        SpringApplication.run(PrimeirosPassosApplication.class, args);
    }

    @Bean
    public CommandLineRunner run (ConversorJson conversorJson) throws Exception{
      return args ->{
        String json =  "\"cep\": \"01001-000\" , \"logaduro\": \"Praça da Sé \" , \"localidade \" : \"São Paulo\" " ;
        ViaCepResponse response =conversorJson.converter(json);
          System.out.println("Dados do Cep : " + response);
      };
    }
}*/
