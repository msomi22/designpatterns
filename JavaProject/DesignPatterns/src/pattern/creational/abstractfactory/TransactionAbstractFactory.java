package pattern.creational.abstractfactory;

import pattern.creational.abstractfactory.beans.Transactionable;

public interface TransactionAbstractFactory {

	Transactionable createTxn();
}
