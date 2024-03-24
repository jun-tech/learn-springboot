package org.juntech.goods.service.impl;

import org.juntech.goods.model.GoodsVO;
import org.juntech.goods.service.IGoodsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsService implements IGoodsService {
    @Override
    public List<GoodsVO> list(int pageNo, int pageSize) {
        List<GoodsVO> goodsVOList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            GoodsVO goodsVO = new GoodsVO();
            goodsVO.setId(i + "");
            goodsVO.setGoodName("商品" + i);
            goodsVO.setStock(100 + i);
            goodsVOList.add(goodsVO);
        }
        return goodsVOList;
    }
}
