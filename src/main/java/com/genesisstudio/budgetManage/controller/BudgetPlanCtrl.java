package com.genesisstudio.budgetManage.controller;

import com.genesisstudio.budgetManage.domain.BudgetTable;
import com.genesisstudio.budgetManage.service.impl.BudgetTableServiceImpl;
import com.genesisstudio.budgetManage.util.enums.Message;
import com.genesisstudio.budgetManage.util.vo.BudgetPlanVO;
import com.genesisstudio.budgetManage.util.vo.ResponseObjectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("budgetPlan")
public class BudgetPlanCtrl {
    @Autowired
    private BudgetTableServiceImpl budgetTableService;
    @PostMapping("addPlan")
    public ResponseObjectVO addPlan(@RequestBody BudgetTable obj){
        ResponseObjectVO response = new ResponseObjectVO(Message.FAIL.getMsg(), false);
        boolean save = budgetTableService.save(obj);
        if(save){
            response = new ResponseObjectVO(Message.SUCCESS.getMsg(), true);
        }
        return response;
    }
    @PostMapping("updatePlan")
    public ResponseObjectVO updatePlan(@RequestBody BudgetTable obj){
        ResponseObjectVO response = new ResponseObjectVO(Message.FAIL.getMsg(), false);
        boolean update = budgetTableService.updateById(obj);
        if(update){
            response = new ResponseObjectVO(Message.SUCCESS.getMsg(), true);
        }
        return response;
    }

    @RequestMapping("fetchBudgetPlans")
    private ResponseObjectVO fetchBudgetPlans(Integer page, String id) {
        ResponseObjectVO responseObjectVO = new ResponseObjectVO(Message.NO_DATA.getMsg(), false);
        List<BudgetTable> budgetPlans=budgetTableService.latest(page,id);
        Long count=budgetTableService.count();
        responseObjectVO.setMessage(Message.SUCCESS.getMsg());
        ArrayList<BudgetPlanVO> budgetPlanVO = new ArrayList<>();
        for (BudgetTable budgetPlan : budgetPlans) {
            BudgetPlanVO vo = new BudgetPlanVO();
            vo.setId(budgetPlan.getBudgetId());
            vo.setName(budgetPlan.getBudgetName());
            vo.setDescription(budgetPlan.getDescription());
            vo.setBeginDate(budgetPlan.getBeginDate());
            vo.setTarget(budgetPlan.getBudgetTarget());
            vo.setCurrent(budgetPlan.getBudgetCurrent());
            vo.setTotal(count);
            budgetPlanVO.add(vo);
        }
        responseObjectVO.setData(budgetPlanVO);
        return responseObjectVO;
    }
    @RequestMapping("deletePlan")
    private ResponseObjectVO deletePlan(String id){
        ResponseObjectVO responseObjectVO = new ResponseObjectVO(Message.NO_DATA.getMsg(), false);
        boolean delete = budgetTableService.removeById(id);
        if(delete){
            responseObjectVO = new ResponseObjectVO(Message.SUCCESS.getMsg(), true);
        }
        return responseObjectVO;
    }
}
