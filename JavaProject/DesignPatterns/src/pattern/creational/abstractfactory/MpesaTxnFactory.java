package pattern.creational.abstractfactory;

import pattern.creational.abstractfactory.beans.MpesaTxn;
import pattern.creational.abstractfactory.beans.Transaction;
import pattern.creational.abstractfactory.beans.Transactionable;

public class MpesaTxnFactory implements TransactionAbstractFactory {

	private String mobileNo;
	private String type;
	
	private Transaction txn = new MpesaTxn();
	
	public MpesaTxnFactory() {
		this.mobileNo = "";
		this.type = "";
	}
	
	public MpesaTxnFactory(String type,String chargeInd, String swiftCode,
			String txnId, String drAccount, String benBankCode,
			String dao, String paymentDetails, String narration,
			String sourceBranch, String crAccount, String amount, String mobileNo) {
		this.type = type;
		this.mobileNo = mobileNo;
		
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
		return new MpesaTxn(this.type, this.mobileNo, this.txn);
	}


}
