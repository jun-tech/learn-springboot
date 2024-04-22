package org.juntech.goods.mapper;

import org.juntech.goods.entity.GoodsEntity;

import java.util.List;

public interface GoodsEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(GoodsEntity row);

    int insertSelective(GoodsEntity row);

    GoodsEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(GoodsEntity row);

    int updateByPrimaryKey(GoodsEntity row);

    List<GoodsEntity> selectList(int start, int limit);
}