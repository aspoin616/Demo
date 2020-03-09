package shopboot.shopboot.service;

import shopboot.shopboot.model.OrderLine;

import java.util.List;

public interface OrderLineService {

    List<OrderLine> findAllOrderLines();

    void saveOrderLine(OrderLine orderLine);

    void updateOrderLine(OrderLine orderLine);

    void deleteOrderLineById(Integer id);

    OrderLine findByIdOrderLine(Integer id);
}
