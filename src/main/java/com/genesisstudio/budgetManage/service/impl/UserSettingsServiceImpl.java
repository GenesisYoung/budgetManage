package com.genesisstudio.budgetManage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.genesisstudio.budgetManage.domain.UserSettings;
import com.genesisstudio.budgetManage.service.UserSettingsService;
import com.genesisstudio.budgetManage.mapper.UserSettingsMapper;
import org.springframework.stereotype.Service;

/**
* @author genesis-young
* @description 针对表【user_settings】的数据库操作Service实现
* @createDate 2024-07-28 17:43:41
*/
@Service
public class UserSettingsServiceImpl extends ServiceImpl<UserSettingsMapper, UserSettings>
    implements UserSettingsService{

}




