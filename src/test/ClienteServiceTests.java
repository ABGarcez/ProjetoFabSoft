import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.univille.projfabsoft01.service.ClienteService;


@SpringBootTest
@ContextConfiguration
@ActiveProfiles(profiles = "test")
@DirtiesContext(classmode = DirtiesContext.classmode.BEFORE_EACH_TEST_METHOD)
public class ClienteServiceTests {

    @Autowired
    private ClienteService service;

    @Test
    void getAllClienteFindAll(){
        var newCliente = new Cliente();
        newCliente.setNome("Rafa");
        newCliente.setEndereco("Rua ksjdhavk 69");
        service.save(newCliente);

        var listaClientes = new service.getAll();
        assertEquals(listaClientes.get(0).getNome(), "Rafa");
        
    }
    
}
