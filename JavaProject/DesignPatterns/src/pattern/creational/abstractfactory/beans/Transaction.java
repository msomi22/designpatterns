package pattern.creational.abstractfactory.beans;

public class Transaction {
	private String txnId;
	private String amount;
	private String sourceAccount;
	private String benAccount;
	private String narration;//source
	private String paymentPurpose;//ben
	private String sortCode;//Dest bank
	private String clearingCode;//source bank >> KCB
	private String profitCenter;
	
	public Transaction() {
		this.txnId = "";
		this.amount = "";
		this.sourceAccount = "";
		this.benAccount = "";
		this.narration = "";
		this.paymentPurpose = "";
		this.sortCode = "";
		this.clearingCode = "";
		this.profitCenter = "";
	}
	
	public Transaction(Transaction txn) {
		this.txnId = txn.getTxnId();
		this.amount = txn.getAmount();
		this.sourceAccount = txn.getSourceAccount();
		this.benAccount = txn.getBenAccount();
		this.narration = txn.getNarration();
		this.paymentPurpose = txn.getPaymentPurpose();
		this.sortCode = txn.getSortCode();
		this.clearingCode = txn.getClearingCode();
		this.profitCenter = txn.getProfitCenter();
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getSourceAccount() {
		return sourceAccount;
	}

	public void setSourceAccount(String sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public String getBenAccount() {
		return benAccount;
	}

	public void setBenAccount(String benAccount) {
		this.benAccount = benAccount;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public String getPaymentPurpose() {
		return paymentPurpose;
	}

	public void setPaymentPurpose(String paymentPurpose) {
		this.paymentPurpose = paymentPurpose;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public String getClearingCode() {
		return clearingCode;
	}

	public void setClearingCode(String clearingCode) {
		this.clearingCode = clearingCode;
	}

	public String getProfitCenter() {
		return profitCenter;
	}

	public void setProfitCenter(String profitCenter) {
		this.profitCenter = profitCenter;
	}

	@Override
	public String toString() {
		return "Transaction [txnId=" + txnId + ", amount=" + amount + ", sourceAccount=" + sourceAccount
				+ ", benAccount=" + benAccount + ", narration=" + narration + ", paymentPurpose=" + paymentPurpose
				+ ", sortCode=" + sortCode + ", clearingCode=" + clearingCode + ", profitCenter=" + profitCenter + "]";
	}
	
}
