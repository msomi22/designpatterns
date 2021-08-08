package pattern.creational.builder;

public class Transaction {

	private String amount;
	private String txnId;
	private String drAccount;
	private String crAccount;
	private String narration;
	private String sourceBranch;

	private String mobileNo;
	private String businessNo;
	private String destBranch;
	private String swiftCode;
	private String paymentPurpose;
	private String profitCenter;

	private Transaction(TransactionBuilder builder) {
		this.amount = builder.amount;
		this.txnId = builder.txnId;
		this.drAccount = builder.drAccount;
		this.crAccount = builder.crAccount;
		this.narration = builder.narration;
		this.sourceBranch = builder.sourceBranch;
		this.mobileNo = builder.mobileNo;
		this.businessNo = builder.businessNo;
		this.destBranch = builder.destBranch;
		this.swiftCode = builder.swiftCode;
		this.paymentPurpose = builder.paymentPurpose;
		this.profitCenter = builder.profitCenter;
	}

	public String getAmount() {
		return amount;
	}

	public String getTxnId() {
		return txnId;
	}

	public String getDrAccount() {
		return drAccount;
	}

	public String getCrAccount() {
		return crAccount;
	}

	public String getNarration() {
		return narration;
	}

	public String getSourceBranch() {
		return sourceBranch;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getBusinessNo() {
		return businessNo;
	}

	public String getDestBranch() {
		return destBranch;
	}

	public String getSwiftCode() {
		return swiftCode;
	}

	public String getPaymentPurpose() {
		return paymentPurpose;
	}

	public String getProfitCenter() {
		return profitCenter;
	}

	@Override
	public String toString() {
		return "Transaction [amount=" + amount + ", txnId=" + txnId + ", drAccount=" + drAccount + ", crAccount="
				+ crAccount + ", narration=" + narration + ", sourceBranch=" + sourceBranch + ", mobileNo=" + mobileNo
				+ ", businessNo=" + businessNo + ", destBranch=" + destBranch + ", swiftCode=" + swiftCode
				+ ", paymentPurpose=" + paymentPurpose + ", profitCenter=" + profitCenter + "]";
	}

	public static class TransactionBuilder {

		private String amount;
		private String txnId;
		private String drAccount;
		private String crAccount;
		private String narration;
		private String sourceBranch;

		private String mobileNo;
		private String businessNo;
		private String destBranch;
		private String swiftCode;
		private String paymentPurpose;
		private String profitCenter;

		public TransactionBuilder(String amount, String txnId, 
				String drAccount, String crAccount, String narration,
				String sourceBranch) {
			this.amount = amount;
			this.txnId = txnId;
			this.drAccount = drAccount;
			this.crAccount = crAccount;
			this.narration = narration;
			this.sourceBranch = sourceBranch;

			this.mobileNo = "";
			this.businessNo = "";
			this.destBranch = "";
			this.swiftCode = "";
			this.paymentPurpose = "";
			this.profitCenter = "";
		}

		public TransactionBuilder setSourceBranch(String sourceBranch) {
			this.sourceBranch = sourceBranch;
			return this;
		}

		public TransactionBuilder setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
			return this;
		}

		public TransactionBuilder setBusinessNo(String businessNo) {
			this.businessNo = businessNo;
			return this;
		}

		public TransactionBuilder setDestBranch(String destBranch) {
			this.destBranch = destBranch;
			return this;
		}

		public TransactionBuilder setSwiftCode(String swiftCode) {
			this.swiftCode = swiftCode;
			return this;
		}

		public TransactionBuilder setPaymentPurpose(String paymentPurpose) {
			this.paymentPurpose = paymentPurpose;
			return this;
		}

		public TransactionBuilder setProfitCenter(String profitCenter) {
			this.profitCenter = profitCenter;
			return this;
		}
		
		public Transaction build() {
			return new Transaction(this);
		}

	}
}
