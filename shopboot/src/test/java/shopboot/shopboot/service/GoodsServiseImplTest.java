package shopboot.shopboot.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import shopboot.shopboot.model.Goods;
import shopboot.shopboot.model.repository.GoodsRepo;

import java.util.List;

import static java.util.Collections.singletonList;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GoodsServiseImplTest {

    @Mock
    private GoodsRepo goodsRepo;
    @InjectMocks
    private GoodsServiseImpl goodsService;

    @Test
    public void findAllGoods() {
        when(goodsRepo.findAll()).thenReturn(singletonList(new Goods()));
        List<Goods> result = goodsService.findAllGoods();
        Assert.assertNotNull(result);
        verify(goodsRepo).findAll();
    }

    @Test
    public void saveGood() {
        when(goodsRepo.save(new Goods())).thenReturn(new Goods());
        goodsService.saveGood(new Goods());
        verify(goodsRepo).save(new Goods());

    }

    @Test
    public void deleteGood() {
        goodsService.deleteGood(new Goods());
        verify(goodsRepo).delete(new Goods());
    }

    @Test
    public void findByIdGood() {
        goodsService.findByIdGood(anyInt());
        verify(goodsRepo).findById(anyInt());
    }
}