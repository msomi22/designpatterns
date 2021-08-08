package pattern.creational.abstractfactory;

import pattern.creational.abstractfactory.beans.Transactionable;

public class TransactionFactory {
	
	public static Transactionable createTransaction(TransactionAbstractFactory taf) {
		return taf.createTxn();
	}

}
