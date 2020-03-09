package shopboot.shopboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shopboot.shopboot.model.Goods;
import shopboot.shopboot.model.OrderLine;
import shopboot.shopboot.service.GoodsService;

import java.util.List;

@RestController
public class ShopController {

    private GoodsService goodsService;

    @Autowired
    public ShopController(GoodsService goodsServise) {
        this.goodsService = goodsServise;
    }


    @GetMapping("/allgoods")
    public List<Goods> readAllGoods() {
        return goodsService.findAllGoods();
    }

    @GetMapping("/allGoodsOver")
    public List<Goods> readAllOrderLinesOverprise() {
        return goodsService.findAllGoodsPrice();
    }

    @GetMapping("/findGoodBy/{id}")
    public Goods getGoodById(@PathVariable(name = "id") Integer id) {
        return goodsService.findByIdGood(id);
    }

    @PostMapping("/saveGood")
    public void saveGood(@RequestBody Goods goods) {
        goodsService.saveGood(goods);
    }

    @PostMapping("/updateGood")
    public void updateGood(@RequestBody Goods goods) {
        goodsService.updateGood(goods);
    }

    @GetMapping("/deleteGood/{id}")
    public void deleteGood(@RequestBody Goods goods) {
        goodsService.deleteGood(goods);
    }


}
