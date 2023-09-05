package sia.tacocloud.data;

import java.util.Optional;

import sia.tacocloud.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long>{

  TacoOrder save(TacoOrder order);

  Optional<TacoOrder> findById(Long id);

}