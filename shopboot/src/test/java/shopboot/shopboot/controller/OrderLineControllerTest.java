package shopboot.shopboot.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import shopboot.shopboot.model.OrderLine;
import shopboot.shopboot.service.OrderLineService;

import java.util.Collections;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class OrderLineControllerTest {


    @Mock
    private OrderLineService orderLineService;

    @InjectMocks
    private OrderLineController orderLineController;

    @Test
    public void readAllOrder_lines() throws Exception {
        when(orderLineService.findAllOrderLines()).thenReturn(Collections.singletonList(new OrderLine()));
        Assert.assertNotNull(orderLineController.readAllOrderLines());
        verify(orderLineService).findAllOrderLines();
    }
}