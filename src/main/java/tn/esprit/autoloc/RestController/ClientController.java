package tn.esprit.autoloc.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Client;
import tn.esprit.autoloc.Services.IClient;

import java.util.List;
@Tag(name = "Client", description = "the Client API")
@RestController
@RequestMapping("/api/Client")
@RequiredArgsConstructor
public class ClientController {

    private final IClient iClient;
    @Operation(summary = "Add a new client", description = "This endpoint allows you to add a new client to the system.", tags = { "Client" })
    @PostMapping("/AddClient")
    public Client ajouterClientt(@RequestBody Client client) {
        return iClient.ajouterClient(client);
    }
    @Operation(summary = "Get all clients", description = "This endpoint retrieves a list of all clients in the system.", tags = { "Client" })
    @GetMapping("/GetALL")
    public List<Client> getAll() {
        return iClient.recupererClients();
    }
    @Operation(summary = "Get a client by ID", description = "This endpoint retrieves a specific client by their unique ID.", tags = { "Client" })
    @GetMapping("/GetCLient/{id}")
    public Client getClient(@PathVariable Long id) {
        return iClient.recupererClienByid(id);
    }
    @Operation(summary = "Delete a client by ID", description = "This endpoint allows you to delete a specific client by their unique ID.", tags = { "Client" })
    @DeleteMapping("/DeleteCLient/{id}")
    public void deleteClient(@PathVariable Long id) {
        iClient.supprimerClient(id);
    }
    @Operation(summary = "Update a client", description = "This endpoint allows you to update the details of an existing client.", tags = { "Client" })
    @PutMapping("/UpdateCLient")
    public Client updateClientt(@RequestBody Client client) {
        return iClient.modifierClient(client);
    }
}