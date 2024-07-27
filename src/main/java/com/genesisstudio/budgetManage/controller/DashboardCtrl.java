package com.genesisstudio.budgetManage.controller;

import com.genesisstudio.budgetManage.domain.BudgetTable;
import com.genesisstudio.budgetManage.domain.ExpenseInMonth;
import com.genesisstudio.budgetManage.domain.IncomeInMonth;
import com.genesisstudio.budgetManage.service.impl.*;
import com.genesisstudio.budgetManage.util.enums.Message;
import com.genesisstudio.budgetManage.util.object.*;
import com.genesisstudio.budgetManage.util.vo.ResponseObjectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("dashboard")
public class DashboardCtrl {
    @Autowired
    private IncomeTableServiceImpl incomeTableService;
    @Autowired
    private ExpenseTableServiceImpl expenseTableService;
    @Autowired
    private IncomeInMonthServiceImpl incomeInMonthService;
    @Autowired
    private ExpenseInMonthServiceImpl expenseInMonthService;

    @RequestMapping("fetchData")
    public ResponseObjectVO fetchData( Integer page, String id) {
        Series series;
        ResponseObjectVO responseObjectVO = new ResponseObjectVO(Message.NO_DATA.getMsg(), false);
        List<IncomeInMonth> incomes = incomeInMonthService.latest(page, 6, id);
        if (!incomes.isEmpty()) {
            ArrayList<String> incomeDates = new ArrayList<>();
            ArrayList<Double> incomeData = new ArrayList<>();

            for (IncomeInMonth income : incomes) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(income.getStartDate());
                int month = calendar.get(Calendar.MONTH);
                incomeDates.add(convertMonthAsString(month));
                incomeData.add(income.getIncomeTotal());
            }

            List<ExpenseInMonth> expenses = expenseInMonthService.latest(page, 6, id);
            ArrayList<Double> expenseData = new ArrayList<>();
            if (!incomes.isEmpty()) {
                for (ExpenseInMonth income : expenses) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(income.getStartDate());
                    expenseData.add(income.getExpenseTotal());
                }
            }
            String[] array = incomeDates.toArray(new String[0]);
            Double[] incomesData = incomeData.toArray(new Double[0]);
            Double[] expensesData = expenseData.toArray(new Double[0]);
            series = new Series(incomesData, expensesData);
            Income income = new Income(series);
            Expense expense = new Expense(series);
            long count = incomeInMonthService.count();
            count-=6;
            DashboardData dashboardData = new DashboardData(array, income, expense,count);
            responseObjectVO.setData(dashboardData);
            responseObjectVO.setMessage(Message.SUCCESS.getMsg());
        }
        return responseObjectVO;
    }
    private String convertMonthAsString(int month) {
        String monthAsString = "";
        switch (month) {
            case 1:
                monthAsString = "Jan";
            case 2:
                monthAsString = "Feb";
            case 3:
                monthAsString = "Mar";
            case 4:
                monthAsString = "Apr";
            case 5:
                monthAsString = "May";
            case 6:
                monthAsString = "Jun";
            case 7:
                monthAsString = "Jul";
            case 8:
                monthAsString = "Aug";
            case 9:
                monthAsString = "Sep";
            case 10:
                monthAsString = "Oct";
            case 11:
                monthAsString = "Nov";
            case 12:
                monthAsString = "Dec";
        }
        return monthAsString;
    }
}
