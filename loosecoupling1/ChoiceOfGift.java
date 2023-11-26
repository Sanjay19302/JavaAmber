package com.loosecoupling1;

public class ChoiceOfGift{
	private Examination eg;
	ChoiceOfGift(Examination k){
		this.eg=k;
	}
	public void gift() {
		eg.gift();
	}
}
