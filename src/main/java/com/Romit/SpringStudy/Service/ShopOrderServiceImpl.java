package com.Romit.SpringStudy.Service;

import com.Romit.SpringStudy.entity.ShopOrder;
import com.Romit.SpringStudy.mapper.ShopOrderMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author 李锐(Romit.Lee)
 * @date 2019/12/1 1:48
 */
@Service
public class ShopOrderServiceImpl extends ServiceImpl<ShopOrderMapper, ShopOrder> implements ShopOrderService{

	@Override
	public int insertList(List<ShopOrder> list){
		 return shopOrderMapper.insertList(list);
	}




    @Autowired
    private ShopOrderMapper shopOrderMapper;

}
