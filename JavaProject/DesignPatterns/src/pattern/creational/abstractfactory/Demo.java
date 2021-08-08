package pattern.creational.abstractfactory;

import pattern.creational.abstractfactory.beans.Transactionable;

public class Demo {

	public static void main(String[] args) {

		Transactionable txn = TransactionFactory.createTransaction(
				new BankTxnFactory("RTGS", "Ben", "KENEX29920", "QRRETEY8181", "100011235673426", "68320", "4012",
						"Goods delivery payment", "Vendor Payment", "01402", "11235673426", "10000.00", "254718953974"));
		
		
		txn = TransactionFactory.createTransaction(
				new MpesaTxnFactory("B2C", "Ben", "KENEX29920", "QRRETEY8181", "100011235673426", "68320", "4012",
						"Goods delivery payment", "Vendor Payment", "01402", "11235673426", "10000.00", "254718953974"));
		
		txn = TransactionFactory.createTransaction(
				new PesaLinkTxnFactory("B2A", "Ben", "KENEX29920", "QRRETEY8181", "100011235673426", "68320", "4012",
						"Goods delivery payment", "Vendor Payment", "01402", "11235673426", "10000.00", "254718953974"));
		
		
		txn.sendTxn();
		txn.queryTxn();
		txn.reverseTxn();

	}

}
