package pattern.creational.abstractfactory;

import pattern.creational.abstractfactory.beans.BankTxn;
import pattern.creational.abstractfactory.beans.Transaction;
import pattern.creational.abstractfactory.beans.Transactionable;

public class BankTxnFactory implements TransactionAbstractFactory {

	private String chargeInd;
	private String swiftCode;
	private String type;
	
	private Transaction txn = new BankTxn();
	
	public BankTxnFactory() {
		this.type = "";
		this.chargeInd = "";
		this.swiftCode = "";
	}

	public BankTxnFactory(String type,String chargeInd, String swiftCode,
			String txnId, String drAccount, String benBankCode,
			String dao, String paymentDetails, String narration,
			String sourceBranch, String crAccount, String amount, String mobileNo) {
		this.type = type;
		this.chargeInd = chargeInd;
		this.swiftCode = swiftCode;
		
		this.txn.setTxnId(txnId);
		this.txn.setSourceAccount(drAccount);
		this.txn.setSortCode(benBankCode);
		this.txn.setProfitCenter(dao);
		this.txn.setPaymentPurpose(paymentDetails);
		this.txn.setNarration(narration);
		this.txn.setClearingCode(sourceBranch);
		this.txn.setBenAccount(crAccount);
		this.txn.setAmount(amount); 
	}

	@Override
	public Transactionable createTxn() {
		return new BankTxn(this.type, this.chargeInd,this.swiftCode, this.txn);
	}
}
