package app;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConversorJson {
    @Autowired
    private Gson gson ;
    public ViaCepResponse converter (String, json String json){
        ViaCepResponse response = gson.fromJson(json,ViaCepResponse.class);
        return response ;
    }
}
//usar o @Component quando tem o acesso ao codigo fonte
