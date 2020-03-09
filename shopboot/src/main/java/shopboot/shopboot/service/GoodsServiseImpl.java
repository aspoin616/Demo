package shopboot.shopboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shopboot.shopboot.model.Goods;
import shopboot.shopboot.model.repository.GoodsRepo;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GoodsServiseImpl implements GoodsService {

    @Autowired
    private GoodsRepo goodsRepo;


    public List<Goods> findAllGoods() {
        return goodsRepo.findAll();
    }

    public void saveGood(Goods goods) {
        goodsRepo.save(goods);
    }

    public void updateGood(Goods goods) {
        goodsRepo.save(goods);
    }

    public void deleteGood(Goods goods) {
        goodsRepo.delete(goods);
    }

    public Goods findByIdGood(Integer id) {
        return goodsRepo.findById(id).orElse(new Goods());
    }

    public List<Goods> findAllGoodsPrice() {

         List<Goods> overprise = goodsRepo.findAll();
         List<Goods> getresult = overprise.stream().filter(g -> g.getPrice() > 10)
                .collect(Collectors.toList());
        return getresult;
    }
}
