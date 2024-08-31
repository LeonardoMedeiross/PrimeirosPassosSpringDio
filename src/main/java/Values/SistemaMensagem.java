package Values;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {
    //caso não achar um valor no properties ex nome estiver name coloque assim @Value("${name: Nome exemplo}"  para que nao dê a mensagem de erro )
    //assim usando so o @value , agora centralizando para um bean cria uma class
  /*  @Value("${nome}")
    private String nome ;
    @Value("${Email}")
    private String Email ;
    @Value("${telefones}")
    private List<Long> telefones =
            new ArrayList<>(Arrays.asList(new Long[]{4564623146L}));*/
    @Autowired
    private Remetente remetente;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por:"+
                remetente.getNome()
        +"\nE-mail:" + remetente.getEmail()
        +"\nTelefone para contato : "+ remetente.getTelefones());
        System.out.println("Cadastro aprovado");
    }
}
