package hello.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Arthur on 09/12/2015.
 */
@Entity
public class Pizza {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String nom;

    @Column
    private String description;

    @Column
    private double prix;

    public Pizza() {
    }

    public Pizza(String nom) {
        this.nom = nom;
    }

    public Pizza(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    public Pizza(String nom,String description,double prix) {
        this.prix = prix;
        this.description = description;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
