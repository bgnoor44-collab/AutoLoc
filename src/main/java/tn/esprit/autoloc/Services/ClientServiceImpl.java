package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Client;
import tn.esprit.autoloc.Repositories.ClientRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements IClient{
    private final ClientRepository clientRepository;
    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void supprimerClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> recupererClients() {
        return clientRepository.findAll();
    }

    @Override
    public Set<Client> findClients() {
        return new HashSet<>(clientRepository.findAll());
    }

    @Override
    public Client recupererClienByid(Long id) {
        return clientRepository.findById(id).orElseThrow();
    }
    @Override
    public Client modifierClient(Client client) {
        if (clientRepository.existsById(client.getIdClient())) {
            return clientRepository.save(client);
        }
        throw new RuntimeException("Client introuvable avec l'id : " + client.getIdClient());
    }
}
