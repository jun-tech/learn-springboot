package org.juntech.goods.controller;

import org.juntech.goods.model.GoodsVO;
import org.juntech.goods.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;

    @GetMapping("/list")
    @ResponseBody
    public List<GoodsVO> list(int pageNo, int pageSize) {
        return goodsService.list(pageNo, pageSize);

    }
}
