package pattern.creational.abstractfactory.beans;

public interface Transactionable {

	Transaction sendTxn();
	
	Transaction queryTxn();
	
	Transaction reverseTxn();
}
