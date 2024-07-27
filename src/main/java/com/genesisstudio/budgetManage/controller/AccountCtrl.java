package com.genesisstudio.budgetManage.controller;

import com.genesisstudio.budgetManage.domain.AccountTable;
import com.genesisstudio.budgetManage.service.impl.AccountTableServiceImpl;
import com.genesisstudio.budgetManage.util.enums.Message;
import com.genesisstudio.budgetManage.util.vo.LoginVO;
import com.genesisstudio.budgetManage.util.vo.ResponseObjectVO;
import com.genesisstudio.budgetManage.util.vo.AccountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("account")
@Transactional
public class AccountCtrl{
    @Autowired
    private AccountTableServiceImpl accountTableService;
    @PostMapping("register")
    public ResponseObjectVO register(@RequestBody AccountVO obj) {
        ResponseObjectVO response = new ResponseObjectVO(Message.FAIL.getMsg(), false);
        if(obj!=null){
            AccountTable accountTable = new AccountTable();
            accountTable.setAccountName(obj.getName());
            accountTable.setAccountEmail(obj.getEmail());
            String password = DigestUtils.md5DigestAsHex(obj.getPassword().getBytes(StandardCharsets.UTF_8));
            accountTable.setAccountPassword(password);
            boolean save = accountTableService.save(accountTable);
            if(save){
                response.setMessage(Message.SUCCESS.getMsg());
                response.setData(true);
            }
        }
        return response;
    }
    @PostMapping("login")
    public ResponseObjectVO login(@RequestBody AccountVO obj) {
        ResponseObjectVO response = new ResponseObjectVO(Message.FAIL.getMsg(), false);
        if(obj!=null){
            AccountTable accountTable = new AccountTable();
            accountTable.setAccountEmail(obj.getEmail());
            String password = DigestUtils.md5DigestAsHex(obj.getPassword().getBytes(StandardCharsets.UTF_8));
            accountTable.setAccountPassword(password);
            AccountTable login = accountTableService.login(accountTable);
            if(login!=null){
                response.setMessage(Message.SUCCESS.getMsg());
                response.setData(new LoginVO(true,login.getAccountName(),login.getAccountId()));
            }else{
                response.setMessage(Message.LOGIN_FAIL.getMsg());
            }
        }
        return response;
    }
    @RequestMapping("checkMail")
    public ResponseObjectVO checkMail(String email){
        ResponseObjectVO response = new ResponseObjectVO(Message.FAIL.getMsg(), false);
        AccountTable byEmail = accountTableService.findByEmail(email);
        if(byEmail==null){
            response.setMessage(Message.SUCCESS.getMsg());
            response.setData(true);
        }
        return response;
    }
}
