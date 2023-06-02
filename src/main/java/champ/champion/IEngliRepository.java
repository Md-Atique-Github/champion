package champ.champion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public interface IEngliRepository extends JpaRepository<Engli,Long>{
    
}
