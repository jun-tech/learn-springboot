package org.juntech.goods.model;

import lombok.Data;

@Data
public class GoodsVO {

    /**
     * 商品id
     */
    private String id;

    /**
     * 商品名称
     */
    private String goodName;

    /**
     * 商品库存
     */
    private Integer stock;

}
