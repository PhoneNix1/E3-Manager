package cn.lyj.e3mall.controller;

import cn.lyj.e3mall.entity.TbItem;
import cn.lyj.e3mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品管理Controller
 */
@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable int itemId){
        TbItem tbItem = itemService.getItemById(itemId);
        return tbItem;
    }
}
