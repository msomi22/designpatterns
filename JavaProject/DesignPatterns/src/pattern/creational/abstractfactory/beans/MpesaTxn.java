package pattern.creational.abstractfactory.beans;

public class MpesaTxn extends Transaction implements Transactionable {

	private String mobileNo;
	private String type;
	
	public MpesaTxn() {
		super();
	}
	
	public MpesaTxn(String type,String mobileNo, Transaction txn) {
		super(txn);
		this.mobileNo = mobileNo;
		this.type = type;
	}
	
	public Transaction generateTxn() {
		System.out.println(this.mobileNo);
		System.out.println(this.type + " Generate Mpesa Transaction " + this);
		return null;
	}

	@Override
	public Transaction sendTxn() {
		generateTxn();
		System.out.println(this.type + " Send Mpesa Transaction " + this);
		return null;
	}

	@Override
	public Transaction queryTxn() {
		System.out.println(this.type + " Query Mpesa Transaction " + this);
		return null;
	}

	@Override
	public Transaction reverseTxn() {
		System.out.println(this.type + " Reverse Mpesa Transaction " + this);
		return null;
	}

}
