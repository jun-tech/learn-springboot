package org.juntech.goods.service.impl;

import org.juntech.goods.entity.GoodsEntity;
import org.juntech.goods.mapper.GoodsEntityMapper;
import org.juntech.goods.model.GoodsVO;
import org.juntech.goods.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsService implements IGoodsService {

    @Autowired
    private GoodsEntityMapper goodsEntityMapper;

    @Override
    public List<GoodsVO> list(int pageNo, int pageSize) {
        List<GoodsVO> goodsVOList = new ArrayList<>();
        List<GoodsEntity> goodsEntityList = goodsEntityMapper.selectList((pageNo-1) * pageSize,pageSize);
        for(GoodsEntity goodsEntity : goodsEntityList){
            GoodsVO goodVO = new GoodsVO();
            goodVO.setId(goodsEntity.getId());
            goodVO.setStock(goodsEntity.getStockNum());
            goodVO.setGoodName(goodsEntity.getGoodName());
            goodsVOList.add(goodVO);
        }
        return  goodsVOList;
    }
}
