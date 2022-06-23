package SERVICE.WEB.Repository.Comcel;

import SERVICE.WEB.Models.Comcel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComcelRepository extends JpaRepository<Comcel,Integer> {
}
