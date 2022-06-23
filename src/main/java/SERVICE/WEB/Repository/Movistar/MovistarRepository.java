package SERVICE.WEB.Repository.Movistar;

import SERVICE.WEB.Models.Movistar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovistarRepository extends JpaRepository<Movistar,Integer> {
}
