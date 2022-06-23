package SERVICE.WEB.Repository.Tigo;

import SERVICE.WEB.Models.Tigo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TigoRepository extends JpaRepository<Tigo,Integer> {
}
