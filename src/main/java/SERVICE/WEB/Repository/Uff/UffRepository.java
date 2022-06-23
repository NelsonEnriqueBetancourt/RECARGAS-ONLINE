package SERVICE.WEB.Repository.Uff;

import SERVICE.WEB.Models.Uff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UffRepository extends JpaRepository<Uff,Integer> {
}
