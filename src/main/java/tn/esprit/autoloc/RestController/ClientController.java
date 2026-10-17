package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Client;
import tn.esprit.autoloc.Services.IClient;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
@RequiredArgsConstructor
public class ClientController {

    private final IClient iClient;

    @PostMapping("/AddClient")
    public Client ajouterClientt(@RequestBody Client client) {
        return iClient.ajouterClient(client);
    }

    @GetMapping("/GetALL")
    public List<Client> getAll() {
        return iClient.recupererClients();
    }

    @GetMapping("/GetCLient/{id}")
    public Client getClient(@PathVariable Long id) {
        return iClient.recupererClienByid(id);
    }

    @DeleteMapping("/DeleteCLient/{id}")
    public void deleteClient(@PathVariable Long id) {
        iClient.supprimerClient(id);
    }

    @PutMapping("/UpdateCLient")
    public Client updateClientt(@RequestBody Client client) {
        return iClient.modifierClient(client);
    }
}