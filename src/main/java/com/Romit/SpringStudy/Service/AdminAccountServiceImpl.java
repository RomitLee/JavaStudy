package com.Romit.SpringStudy.Service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.Romit.SpringStudy.mapper.AdminAccountMapper;
import com.Romit.SpringStudy.entity.AdminAccount;
import com.Romit.SpringStudy.Service.AdminAccountService;

/**
 * 此文件由 IntelliJ IDEA. 2019.3版本创建
 * \* 创建人: 李锐(Romit.Lee)
 * \* 创建日期: 2020/3/5
 * \* 创建时间: 15:18
 * \* 描述:
 * \
 */
@Service
public class AdminAccountServiceImpl extends ServiceImpl<AdminAccountMapper, AdminAccount> implements AdminAccountService {

}


