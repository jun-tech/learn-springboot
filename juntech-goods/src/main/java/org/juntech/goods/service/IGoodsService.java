package org.juntech.goods.service;

import org.juntech.goods.model.GoodsVO;

import java.util.List;

public interface IGoodsService {

    /**
     * 获取商品列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<GoodsVO> list(int pageNo, int pageSize);
}
