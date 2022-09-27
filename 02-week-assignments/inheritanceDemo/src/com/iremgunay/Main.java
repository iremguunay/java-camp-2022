package com.iremgunay;

public class Main {

    public static void main(String[] args) {

        LoanUI loanUI = new LoanUI();
        loanUI.loanCalculate(new TeacherLoanManager());
        loanUI.loanCalculate(new FarmLoanManager());
        loanUI.loanCalculate(new SoldierLoanManager());

    }
}
