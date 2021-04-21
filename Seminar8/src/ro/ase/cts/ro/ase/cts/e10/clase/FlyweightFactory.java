package ro.ase.cts.ro.ase.cts.e10.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,FlyweightAbstract> clienti;

    public FlyweightFactory() {
        this.clienti = new HashMap<>();
    }

    public FlyweightAbstract getClient(String nrTel){
        FlyweightAbstract client = clienti.get(nrTel);
        if(client == null){
            client = new Client("Andrei", nrTel,"email@test.ro");
            clienti.put(nrTel, client);
        }
        return client;
    }
}
