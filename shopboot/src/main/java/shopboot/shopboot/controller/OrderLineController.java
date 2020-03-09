package shopboot.shopboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shopboot.shopboot.model.OrderLine;
import shopboot.shopboot.service.OrderLineService;

import java.util.List;

@RestController
public class OrderLineController {

    @Autowired
    private OrderLineService orderLineService;

    @GetMapping("/allOrderLines")
    public List<OrderLine> readAllOrderLines() {
        return orderLineService.findAllOrderLines();
    }


    @GetMapping("/findOrdeLineBy/{id}")
    public OrderLine getOrderLineById(@PathVariable(name = "id") Integer id) {
        return orderLineService.findByIdOrderLine(id);
    }

    @PostMapping("/saveOrderLine")
    public void saveOrderLine(@RequestBody OrderLine orderLine) {
        orderLineService.saveOrderLine(orderLine);
    }

    @PostMapping("/updateOrderLine")
    public void updateOrderLine(@RequestBody OrderLine orderLine) {
        orderLineService.saveOrderLine(orderLine);
    }

    @GetMapping("/deleteOrderLine/{id}")
    public void deleteOrderLine(@PathVariable(name = "id") Integer id) {
        orderLineService.deleteOrderLineById(id);
    }


}
