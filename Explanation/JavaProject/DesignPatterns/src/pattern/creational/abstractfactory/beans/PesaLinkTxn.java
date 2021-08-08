package pattern.creational.abstractfactory.beans;

public class PesaLinkTxn extends Transaction implements Transactionable {
	
	private String mobileNo;
	private String type;
	
	public PesaLinkTxn() {
		super();
		this.mobileNo = "";
		this.type = "";
	}
	
	public PesaLinkTxn(String mobileNo,String type, Transaction txn) {
		super(txn);
		this.mobileNo = mobileNo;
		this.type = type;
	}

	public Transaction generateTxn() {
		System.out.println(this.mobileNo);
		System.out.println(this.type + " Generate PesaLink Transaction " + this);
		return null;
	}

	@Override
	public Transaction sendTxn() {
		System.out.println(this.type + " Send PesaLink Transaction " + this);
		return null;
	}

	@Override
	public Transaction queryTxn() {
		System.out.println(this.type + " Query PesaLink Transaction " + this);
		return null;
	}

	@Override
	public Transaction reverseTxn() {
		System.out.println(this.type + " Reverse PesaLink Transaction " + this);
		return null;
	}

}
