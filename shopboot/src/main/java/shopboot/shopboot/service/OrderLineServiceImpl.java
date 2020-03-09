package shopboot.shopboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shopboot.shopboot.model.Goods;
import shopboot.shopboot.model.OrderLine;
import shopboot.shopboot.model.repository.OrderLineRepo;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderLineServiceImpl implements OrderLineService {

    @Autowired
    private OrderLineRepo orderLineRepo;

    public List<OrderLine> findAllOrderLines() {
        return orderLineRepo.findAll();
    }

    public void saveOrderLine(OrderLine orderLine) {
        orderLineRepo.save(orderLine);
    }

    public void updateOrderLine(OrderLine orderLine) {
        orderLineRepo.save(orderLine);
    }

    public void deleteOrderLineById(Integer id) {
        orderLineRepo.deleteById(id);
    }

    public OrderLine findByIdOrderLine(Integer id) {
        return orderLineRepo.findById(id).orElse(new OrderLine());
    }
}
