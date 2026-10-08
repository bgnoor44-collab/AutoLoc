package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Client;
import tn.esprit.autoloc.Entities.Maintenance;

import java.util.List;
import java.util.Set;
public interface IClient {
    Client ajouterClient(Client client);
    void supprimerClient(Long id);

    List<Client> recupererClients();
    Set<Client> findClients();
    Client recupererClienByid(Long id);
}
