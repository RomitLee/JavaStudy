package com.Romit.SpringStudy.Service;
import java.util.List;

import com.Romit.SpringStudy.entity.ShopOrder;
import com.baomidou.mybatisplus.extension.service.IService;
    /**
 * @author 李锐(Romit.Lee)
 * @date 2019/12/1 1:48
 */
public interface ShopOrderService extends IService<ShopOrder>{



	int insertList(List<ShopOrder> list);



}
