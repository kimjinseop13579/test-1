package com.simple.mart;

public class FruitBuyer {
	int myMoney;
	int numOfApple;

	public FruitBuyer(int myMoney) {
		this.myMoney = myMoney;

	}

	public void buyApple(FruitSeller seller2, int money) {
		numOfApple += seller2.saleApple(money);
		myMoney -= money;
		showSaleResult();

	}

	private void showSaleResult() {
		System.out.println("사과 수 : " + numOfApple);
		System.out.println("잔액 : ");
	}

}
