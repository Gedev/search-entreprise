package gedev.technobel.searchentreprise.repository;

import gedev.technobel.searchentreprise.entity.Historic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricRepository extends JpaRepository<Historic, Long> {
//    public Historic findByName(String name);
}
