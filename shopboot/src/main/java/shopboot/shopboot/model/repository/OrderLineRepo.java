package shopboot.shopboot.model.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shopboot.shopboot.model.OrderLine;

@Repository
public interface OrderLineRepo extends JpaRepository<OrderLine, Integer> {
}
