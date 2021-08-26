package gedev.technobel.searchentreprise.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "historic")
public class Historic {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Integer entreprise_ID;
    private Date consulted_date;
    private Integer user_ID;
    private String job_platform;

    public Historic(){
        super();
    }

    public Historic(Long id) {
        super();
        this.id = id;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEntreprise_ID() {
        return entreprise_ID;
    }

    public void setEntreprise_ID(Integer entreprise_ID) {
        this.entreprise_ID = entreprise_ID;
    }

    public Date getConsulted_date() {
        return consulted_date;
    }

    public void setConsulted_date(Date consulted_date) {
        this.consulted_date = consulted_date;
    }

    public Integer getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(Integer user_ID) {
        this.user_ID = user_ID;
    }

    public String getJob_platform() {
        return job_platform;
    }

    public void setJob_platform(String job_platform) {
        this.job_platform = job_platform;
    }
}
