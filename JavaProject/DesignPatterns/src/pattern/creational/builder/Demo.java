package pattern.creational.builder;

public class Demo {

	public static void main(String[] args) {
		
		Transaction txn = new Transaction.TransactionBuilder("100.00"
				, "QWERT662372UI", "11223883922", "12283839922", 
				"Vendor Paymenmt", "68230")
				.setPaymentPurpose("Construction Payment-July 2021")
				.setMobileNo("254718953974")
				.setBusinessNo("255255")
				.build();
		
		System.out.println(txn);

	}

}
