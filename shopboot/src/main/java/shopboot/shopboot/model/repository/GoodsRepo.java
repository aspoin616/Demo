package shopboot.shopboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shopboot.shopboot.model.Goods;

@Repository
public interface GoodsRepo extends JpaRepository<Goods, Integer> {
}
