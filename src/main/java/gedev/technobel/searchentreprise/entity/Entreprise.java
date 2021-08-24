package gedev.technobel.searchentreprise.entity;

import javax.persistence.*;

@Entity
@Table(name = "entreprises")
public class Entreprise {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int number_of_employees;
    private String type_of_entreprise;

    public Entreprise() {
        super();
    }

    public Entreprise(Long id, String name, int number_of_employees, String type_of_entreprise) {
        super();
        this.id = id;
        this.name = name;
        this.number_of_employees = number_of_employees;
        this.type_of_entreprise = type_of_entreprise;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber_of_employees() {
        return number_of_employees;
    }

    public void setNumber_of_employees(int number_of_employees) {
        this.number_of_employees = number_of_employees;
    }

    public String getType_of_entreprise() {
        return type_of_entreprise;
    }

    public void setType_of_entreprise(String type_of_entreprise) {
        this.type_of_entreprise = type_of_entreprise;
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number_of_employees=" + number_of_employees +
                ", type_of_entreprise='" + type_of_entreprise + '\'' +
                '}';
    }
}

