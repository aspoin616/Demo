package shopboot.shopboot.model.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import shopboot.shopboot.model.OrderLine;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class OrderLineRepoTest {
    @Autowired
    private OrderLineRepo orderLineRepo;


    @Test
    public void testFindAll() {
        List<OrderLine> result = orderLineRepo.findAll();
        assertEquals(1, result.size());
    }

}