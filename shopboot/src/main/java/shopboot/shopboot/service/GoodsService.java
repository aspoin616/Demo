package shopboot.shopboot.service;

import shopboot.shopboot.model.Goods;

import java.util.List;


public interface GoodsService {

    List<Goods> findAllGoods();

    void saveGood(Goods goods);

    void updateGood(Goods goods);

    void deleteGood(Goods goods);

    Goods findByIdGood(Integer id);

    List<Goods> findAllGoodsPrice();

}
