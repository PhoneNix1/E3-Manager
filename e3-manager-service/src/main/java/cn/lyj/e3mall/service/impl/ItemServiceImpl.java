package cn.lyj.e3mall.service.impl;

import cn.lyj.e3mall.dao.TbItemDao;
import cn.lyj.e3mall.service.ItemService;
import cn.lyj.e3mall.entity.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品管理Service
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemDao itemMapper;

    @Override
    public TbItem getItemById(int itemId){
        // 根据主键查询
        TbItem item = itemMapper.queryById(itemId);
        return  item;
    }
}
