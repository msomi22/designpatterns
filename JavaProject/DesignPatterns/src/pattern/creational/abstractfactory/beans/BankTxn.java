package pattern.creational.abstractfactory.beans;

public class BankTxn extends Transaction implements Transactionable {
	
	private String type;
	private String chargeInd;
	private String swiftCode;
	
	public BankTxn() {
		super();
	}

	public BankTxn(String type, String chargeInd, String swiftCode, Transaction txn) {
		super(txn);
		this.type = type;
		this.chargeInd = chargeInd;
		this.swiftCode = swiftCode; 
	}

	private Transaction generateTxn() {
		System.out.println("" + this.chargeInd + " " + this.swiftCode);
		System.out.println(this.type + " Generate Bank Transaction " + this);
		return null;
	}

	@Override
	public Transaction sendTxn() {
		generateTxn();
		System.out.println(this.type + " Send Bank Transaction " + this);
		return null;
	}

	@Override
	public Transaction queryTxn() {
		System.out.println(this.type + " Query Bank Transaction " + getTxnId());
		return null;
	}

	@Override
	public Transaction reverseTxn() {
		System.out.println(this.type + " Reverse Bank Transaction " + getTxnId());
		return null;
	}

}
