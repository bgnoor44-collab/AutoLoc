package tn.esprit.autoloc.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipement;

    @Column(nullable = false, length = 100)
    private String libelle;


    @ManyToMany(mappedBy = "equipements", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Vehicule> vehicules = new ArrayList<>();
}