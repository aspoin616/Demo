package shopboot.shopboot.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import shopboot.shopboot.model.OrderLine;
import shopboot.shopboot.model.repository.OrderLineRepo;

import java.util.Collections;
import java.util.Optional;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class OrderLineServiceImplTest {

    @Mock
    private OrderLineRepo orderLineRepo;

    @InjectMocks
    private OrderLineServiceImpl orderLineService;

    @Test
    public void findAllOrderLines() {
        when(orderLineRepo.findAll()).thenReturn(Collections.singletonList(new OrderLine()));
        Assert.assertNotNull(orderLineService.findAllOrderLines());
        verify(orderLineRepo).findAll();
    }

    @Test
    public void saveOrderLine() {
        when(orderLineRepo.save(new OrderLine())).thenReturn((new OrderLine()));
        orderLineService.saveOrderLine(new OrderLine());
        verify(orderLineRepo).save(new OrderLine());
    }

    @Test
    public void deleteOrderLine() {
        orderLineService.deleteOrderLineById(anyInt());
        verify(orderLineRepo).deleteById(anyInt());
    }

    @Test
    public void findByIdOrderLine() {
        when(orderLineRepo.findById(anyInt())).thenReturn(Optional.of(new OrderLine()));
        Assert.assertNotNull(orderLineService.findByIdOrderLine(anyInt()));
        verify(orderLineRepo).findById(anyInt());
    }
}