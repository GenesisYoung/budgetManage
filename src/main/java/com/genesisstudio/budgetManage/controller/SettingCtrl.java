package com.genesisstudio.budgetManage.controller;

import com.genesisstudio.budgetManage.domain.UserSettings;
import com.genesisstudio.budgetManage.service.impl.UserSettingsServiceImpl;
import com.genesisstudio.budgetManage.util.enums.Message;
import com.genesisstudio.budgetManage.util.vo.ResponseObjectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("setting")
public class SettingCtrl {
    @Autowired
    private UserSettingsServiceImpl userSettingsService;
    @RequestMapping("findSettings")
    public ResponseObjectVO findSettings(String id) {
        ResponseObjectVO vo = new ResponseObjectVO(Message.FAIL.getMsg(), false);
        UserSettings settings=userSettingsService.findByUserId(id);
        if (settings != null) {
            vo.setData(settings);
            vo.setMessage(Message.SUCCESS.getMsg());
        }
        return vo;
    }
    @PostMapping("updateSettings")
    public ResponseObjectVO updateSettings(@RequestBody UserSettings settings) {
        ResponseObjectVO vo = new ResponseObjectVO(Message.FAIL.getMsg(), false);
        boolean updated = userSettingsService.updateById(settings);
        if (updated) {
            vo.setMessage(Message.SUCCESS.getMsg());
            vo.setData(true);
        }
        return vo;
    }
}
