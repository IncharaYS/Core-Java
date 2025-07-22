class BillRunner{
	public static void main(String Bill[]){
	System.out.println("\nmain started\n");	
	
	Bill firstBill=new Bill();
	firstBill.billId=1;
	firstBill.planType="Quaterly";
	firstBill.billAmount=456.00d;
	firstBill.billIssueDate="21/6/25";
	firstBill.paymentMethod="Online";
	firstBill.dueDate="21/7/25";
	firstBill.billAmountWithTax=456.00d;
	firstBill.isTaxInclusive=true;
	firstBill.isBillPaid=false;
	firstBill.isBillOverDue=false;
	
	System.out.println("Bill Id is: "+firstBill.billId);
	System.out.println("Bill plan type is: "+firstBill.planType);
	System.out.println("Bill amount is: "+firstBill.billAmount);
	System.out.println("Bill issue date is: "+firstBill.billIssueDate);
	System.out.println("Bill payment method is: "+firstBill.paymentMethod);
	System.out.println("Bill due date is: "+firstBill.dueDate);
	System.out.println("Bill amount with tax is: "+firstBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+firstBill.isTaxInclusive);
	System.out.println("Is bill paid: "+firstBill.isBillPaid);
	System.out.println("Is bill over due: "+firstBill.isBillOverDue+"\n");
	
	
	Bill secondBill=new Bill();
	secondBill.billId=2;
	secondBill.planType="Monthly";
	secondBill.billAmount=250.00;
	secondBill.billIssueDate="21/5/25";
	secondBill.paymentMethod="Cash";
	secondBill.dueDate="21/6/25";
	secondBill.billAmountWithTax=277.00;
	secondBill.isTaxInclusive=false;
	secondBill.isBillPaid=true;
	secondBill.isBillOverDue=false;
	
	System.out.println("Bill Id is: "+secondBill.billId);
	System.out.println("Bill plan type is: "+secondBill.planType);
	System.out.println("Bill amount is: "+secondBill.billAmount);
	System.out.println("Bill issue date is: "+secondBill.billIssueDate);
	System.out.println("Bill payment method is: "+secondBill.paymentMethod);
	System.out.println("Bill due date is: "+secondBill.dueDate);
	System.out.println("Bill amount with tax is: "+secondBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+secondBill.isTaxInclusive);
	System.out.println("Is bill paid: "+secondBill.isBillPaid);
	System.out.println("Is bill over due: "+secondBill.isBillOverDue+"\n");
	
	
	Bill thirdBill=new Bill();
	thirdBill.billId=3;
	thirdBill.planType="Monthly";
	thirdBill.billAmount=200.00d;
	thirdBill.billIssueDate="3/5/25";
	thirdBill.paymentMethod="Card";
	thirdBill.dueDate="3/6/25";
	thirdBill.billAmountWithTax=200.00d;
	thirdBill.isTaxInclusive=true;
	thirdBill.isBillPaid=false;
	thirdBill.isBillOverDue=false;
	
	System.out.println("Bill Id is: "+thirdBill.billId);
	System.out.println("Bill plan type is: "+thirdBill.planType);
	System.out.println("Bill amount is: "+thirdBill.billAmount);
	System.out.println("Bill issue date is: "+thirdBill.billIssueDate);
	System.out.println("Bill payment method is: "+thirdBill.paymentMethod);
	System.out.println("Bill due date is: "+thirdBill.dueDate);
	System.out.println("Bill amount with tax is: "+thirdBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+thirdBill.isTaxInclusive);
	System.out.println("Is bill paid: "+thirdBill.isBillPaid);
	System.out.println("Is bill over due: "+thirdBill.isBillOverDue+"\n");
	
	
	Bill forthBill=new Bill();
	forthBill.billId=4;
	forthBill.planType="Half-Yearly";
	forthBill.billAmount=800.00;
	forthBill.billIssueDate="6/9/24";
	forthBill.paymentMethod="Cash";
	forthBill.dueDate="6/10/24";
	forthBill.billAmountWithTax=867.98d;
	forthBill.isTaxInclusive=false;
	forthBill.isBillPaid=false;
	forthBill.isBillOverDue=true;
	
	System.out.println("Bill Id is: "+forthBill.billId);
	System.out.println("Bill plan type is: "+forthBill.planType);
	System.out.println("Bill amount is: "+forthBill.billAmount);
	System.out.println("Bill issue date is: "+forthBill.billIssueDate);
	System.out.println("Bill payment method is: "+forthBill.paymentMethod);
	System.out.println("Bill due date is: "+forthBill.dueDate);
	System.out.println("Bill amount with tax is: "+forthBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+forthBill.isTaxInclusive);
	System.out.println("Is bill paid: "+forthBill.isBillPaid);
	System.out.println("Is bill over due: "+forthBill.isBillOverDue+"\n");
	
	
	Bill fifthBill=new Bill();
	fifthBill.billId=5;
	fifthBill.planType="Yearly";
	fifthBill.billAmount=1300.00;
	fifthBill.billIssueDate="3/5/24";
	fifthBill.paymentMethod="Cash";
	fifthBill.dueDate="3/6/24";
	fifthBill.billAmountWithTax=1300.00;
	fifthBill.isTaxInclusive=true;
	fifthBill.isBillPaid=true;
	fifthBill.isBillOverDue=false;
	
	System.out.println("Bill Id is: "+fifthBill.billId);
	System.out.println("Bill plan type is: "+fifthBill.planType);
	System.out.println("Bill amount is: "+fifthBill.billAmount);
	System.out.println("Bill issue date is: "+fifthBill.billIssueDate);
	System.out.println("Bill payment method is: "+fifthBill.paymentMethod);
	System.out.println("Bill due date is: "+fifthBill.dueDate);
	System.out.println("Bill amount with tax is: "+fifthBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+fifthBill.isTaxInclusive);
	System.out.println("Is bill paid: "+fifthBill.isBillPaid);
	System.out.println("Is bill over due: "+fifthBill.isBillOverDue+"\n");
	
	
	Bill sixthBill=new Bill();
	sixthBill.billId=6;
	sixthBill.planType="Mounthly";
	sixthBill.billAmount=150.00;
	sixthBill.billIssueDate="21/3/25";
	sixthBill.paymentMethod="Cash";
	sixthBill.dueDate="21/4/25";
	sixthBill.billAmountWithTax=150.00;
	sixthBill.isTaxInclusive=true;
	sixthBill.isBillPaid=true;
	sixthBill.isBillOverDue=false;
	
	System.out.println("Bill Id is: "+sixthBill.billId);
	System.out.println("Bill plan type is: "+sixthBill.planType);
	System.out.println("Bill amount is: "+sixthBill.billAmount);
	System.out.println("Bill issue date is: "+sixthBill.billIssueDate);
	System.out.println("Bill payment method is: "+sixthBill.paymentMethod);
	System.out.println("Bill due date is: "+sixthBill.dueDate);
	System.out.println("Bill amount with tax is: "+sixthBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+sixthBill.isTaxInclusive);
	System.out.println("Is bill paid: "+sixthBill.isBillPaid);
	System.out.println("Is bill over due: "+sixthBill.isBillOverDue+"\n");
	
	
	Bill seventhBill=new Bill();
	seventhBill.billId=7;
	seventhBill.planType="Yearly";
	seventhBill.billAmount=450.00;
	seventhBill.billIssueDate="7/8/23";
	seventhBill.paymentMethod="Card";
	seventhBill.dueDate="7/9/23";
	seventhBill.billAmountWithTax=478.98;
	seventhBill.isTaxInclusive=false;
	seventhBill.isBillPaid=false;
	seventhBill.isBillOverDue=true;
	
	System.out.println("Bill Id is: "+seventhBill.billId);
	System.out.println("Bill plan type is: "+seventhBill.planType);
	System.out.println("Bill amount is: "+seventhBill.billAmount);
	System.out.println("Bill issue date is: "+seventhBill.billIssueDate);
	System.out.println("Bill payment method is: "+seventhBill.paymentMethod);
	System.out.println("Bill due date is: "+seventhBill.dueDate);
	System.out.println("Bill amount with tax is: "+seventhBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+seventhBill.isTaxInclusive);
	System.out.println("Is bill paid: "+seventhBill.isBillPaid);
	System.out.println("Is bill over due: "+seventhBill.isBillOverDue+"\n");
	
	
	Bill eightBill=new Bill();
	eightBill.billId=8;
	eightBill.planType="Quaterly";
	eightBill.billAmount=400.00;
	eightBill.billIssueDate="8/9/23";
	eightBill.paymentMethod="UPI";
	eightBill.dueDate="8/10/23";
	eightBill.billAmountWithTax=450.00;
	eightBill.isTaxInclusive=false;
	eightBill.isBillPaid=false;
	eightBill.isBillOverDue=true;
	
	System.out.println("Bill Id is: "+eightBill.billId);
	System.out.println("Bill plan type is: "+eightBill.planType);
	System.out.println("Bill amount is: "+eightBill.billAmount);
	System.out.println("Bill issue date is: "+eightBill.billIssueDate);
	System.out.println("Bill payment method is: "+eightBill.paymentMethod);
	System.out.println("Bill due date is: "+eightBill.dueDate);
	System.out.println("Bill amount with tax is: "+eightBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+eightBill.isTaxInclusive);
	System.out.println("Is bill paid: "+eightBill.isBillPaid);
	System.out.println("Is bill over due: "+eightBill.isBillOverDue+"\n");
	
	
	Bill ninethBill=new Bill();
	ninethBill.billId=9;
	ninethBill.planType="half-yearly";
	ninethBill.billAmount=800.00;
	ninethBill.billIssueDate="31/10/24";
	ninethBill.paymentMethod="Online";
	ninethBill.dueDate="1/12/24";
	ninethBill.billAmountWithTax=800.00;
	ninethBill.isTaxInclusive=true;
	ninethBill.isBillPaid=true;
	ninethBill.isBillOverDue=false;
	
	System.out.println("Bill Id is: "+ninethBill.billId);
	System.out.println("Bill plan type is: "+ninethBill.planType);
	System.out.println("Bill amount is: "+ninethBill.billAmount);
	System.out.println("Bill issue date is: "+ninethBill.billIssueDate);
	System.out.println("Bill payment method is: "+ninethBill.paymentMethod);
	System.out.println("Bill due date is: "+ninethBill.dueDate);
	System.out.println("Bill amount with tax is: "+ninethBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+ninethBill.isTaxInclusive);
	System.out.println("Is bill paid: "+ninethBill.isBillPaid);
	System.out.println("Is bill over due: "+ninethBill.isBillOverDue+"\n");
	
	
	Bill tenthBill=new Bill();
	tenthBill.planType="Monthly";
	tenthBill.billId=10;
	tenthBill.billAmount=150.00;
	tenthBill.billIssueDate="24/5/21";
	tenthBill.paymentMethod="Card";
	tenthBill.dueDate="24/6/21";
	tenthBill.billAmountWithTax=150.00;
	tenthBill.isTaxInclusive=true;
	tenthBill.isBillPaid=false;
	tenthBill.isBillOverDue=false;
	
	System.out.println("Bill Id is: "+tenthBill.billId);
	System.out.println("Bill plan type is: "+tenthBill.planType);
	System.out.println("Bill amount is: "+tenthBill.billAmount);
	System.out.println("Bill issue date is: "+tenthBill.billIssueDate);
	System.out.println("Bill payment method is: "+tenthBill.paymentMethod);
	System.out.println("Bill due date is: "+tenthBill.dueDate);
	System.out.println("Bill amount with tax is: "+tenthBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+tenthBill.isTaxInclusive);
	System.out.println("Is bill paid: "+tenthBill.isBillPaid);
	System.out.println("Is bill over due: "+tenthBill.isBillOverDue+"\n");
	
	
	Bill eleventhBill=new Bill();
	eleventhBill.billId=11;
	eleventhBill.planType="Yearly";
	eleventhBill.billAmount=1390.00;
	eleventhBill.billIssueDate="2/3/25";
	eleventhBill.paymentMethod="UPI";
	eleventhBill.dueDate="2/4/25";
	eleventhBill.billAmountWithTax=1420.24;
	eleventhBill.isTaxInclusive=false;
	eleventhBill.isBillPaid=true;
	eleventhBill.isBillOverDue=false;
	
	System.out.println("Bill Id is: "+eleventhBill.billId);
	System.out.println("Bill plan type is: "+eleventhBill.planType);
	System.out.println("Bill amount is: "+eleventhBill.billAmount);
	System.out.println("Bill issue date is: "+eleventhBill.billIssueDate);
	System.out.println("Bill payment method is: "+eleventhBill.paymentMethod);
	System.out.println("Bill due date is: "+eleventhBill.dueDate);
	System.out.println("Bill amount with tax is: "+eleventhBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+eleventhBill.isTaxInclusive);
	System.out.println("Is bill paid: "+eleventhBill.isBillPaid);
	System.out.println("Is bill over due: "+eleventhBill.isBillOverDue+"\n");
	
	
	Bill twelvethBill=new Bill();
	twelvethBill.billId=12;
	twelvethBill.planType="Half-yearly";
	twelvethBill.billAmount=560.00;
	twelvethBill.billIssueDate="5/7/24";
	twelvethBill.paymentMethod="Cash";
	twelvethBill.dueDate="5/8/24";
	twelvethBill.billAmountWithTax=560.00;
	twelvethBill.isTaxInclusive=true;
	twelvethBill.isBillPaid=false;
	twelvethBill.isBillOverDue=false;
	
	System.out.println("Bill Id is: "+twelvethBill.billId);
	System.out.println("Bill plan type is: "+twelvethBill.planType);
	System.out.println("Bill amount is: "+twelvethBill.billAmount);
	System.out.println("Bill issue date is: "+twelvethBill.billIssueDate);
	System.out.println("Bill payment method is: "+twelvethBill.paymentMethod);
	System.out.println("Bill due date is: "+twelvethBill.dueDate);
	System.out.println("Bill amount with tax is: "+twelvethBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+twelvethBill.isTaxInclusive);
	System.out.println("Is bill paid: "+twelvethBill.isBillPaid);
	System.out.println("Is bill over due: "+twelvethBill.isBillOverDue+"\n");
	
	
	Bill thirteenthBill=new Bill();
	thirteenthBill.billId=13;
	thirteenthBill.planType="Quaterly";
	thirteenthBill.billAmount=250.00;
	thirteenthBill.billIssueDate="31/10/24";
	thirteenthBill.paymentMethod="Cash";
	thirteenthBill.dueDate="1/12/24";
	thirteenthBill.billAmountWithTax=250.00;
	thirteenthBill.isTaxInclusive=true;
	thirteenthBill.isBillPaid=false;
	thirteenthBill.isBillOverDue=false;
	
	System.out.println("Bill Id is: "+thirteenthBill.billId);
	System.out.println("Bill plan type is: "+thirteenthBill.planType);
	System.out.println("Bill amount is: "+thirteenthBill.billAmount);
	System.out.println("Bill issue date is: "+thirteenthBill.billIssueDate);
	System.out.println("Bill payment method is: "+thirteenthBill.paymentMethod);
	System.out.println("Bill due date is: "+thirteenthBill.dueDate);
	System.out.println("Bill amount with tax is: "+thirteenthBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+thirteenthBill.isTaxInclusive);
	System.out.println("Is bill paid: "+thirteenthBill.isBillPaid);
	System.out.println("Is bill over due: "+thirteenthBill.isBillOverDue+"\n");
	
	
	Bill fourteenthBill=new Bill();
	fourteenthBill.billId=14;
	fourteenthBill.planType="Monthly";
	fourteenthBill.billAmount=199.00;
	fourteenthBill.billIssueDate="21/5/25";
	fourteenthBill.paymentMethod="Card";
	fourteenthBill.dueDate="21/6/25";
	fourteenthBill.billAmountWithTax=234.00;
	fourteenthBill.isTaxInclusive=false;
	fourteenthBill.isBillPaid=true;
	fourteenthBill.isBillOverDue=false;
	
	System.out.println("Bill Id is: "+fourteenthBill.billId);
	System.out.println("Bill plan type is: "+fourteenthBill.planType);
	System.out.println("Bill amount is: "+fourteenthBill.billAmount);
	System.out.println("Bill issue date is: "+fourteenthBill.billIssueDate);
	System.out.println("Bill payment method is: "+fourteenthBill.paymentMethod);
	System.out.println("Bill due date is: "+fourteenthBill.dueDate);
	System.out.println("Bill amount with tax is: "+fourteenthBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+fourteenthBill.isTaxInclusive);
	System.out.println("Is bill paid: "+fourteenthBill.isBillPaid);
	System.out.println("Is bill over due: "+fourteenthBill.isBillOverDue+"\n");
	
	
	Bill fifteenthBill=new Bill();
	fifteenthBill.billId=15;
	fifteenthBill.planType="Yearly";
	fifteenthBill.billAmount=3000.00;
	fifteenthBill.billIssueDate="22/3/23";
	fifteenthBill.paymentMethod="Online";
	fifteenthBill.dueDate="22/4/23";
	fifteenthBill.billAmountWithTax=3000.00;
	fifteenthBill.isTaxInclusive=true;
	fifteenthBill.isBillPaid=true;
	fifteenthBill.isBillOverDue=false;
	
	System.out.println("Bill Id is: "+fifteenthBill.billId);
	System.out.println("Bill plan type is: "+fifteenthBill.planType);
	System.out.println("Bill amount is: "+fifteenthBill.billAmount);
	System.out.println("Bill issue date is: "+fifteenthBill.billIssueDate);
	System.out.println("Bill payment method is: "+fifteenthBill.paymentMethod);
	System.out.println("Bill due date is: "+fifteenthBill.dueDate);
	System.out.println("Bill amount with tax is: "+fifteenthBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+fifteenthBill.isTaxInclusive);
	System.out.println("Is bill paid: "+fifteenthBill.isBillPaid);
	System.out.println("Is bill over due: "+fifteenthBill.isBillOverDue+"\n");
	
	
	Bill sixteenthBill=new Bill();
	sixteenthBill.billId=16;
	sixteenthBill.planType="Monthhly";
	sixteenthBill.billAmount=260.00;
	sixteenthBill.billIssueDate="7/9/24";
	sixteenthBill.paymentMethod="Cash";
	sixteenthBill.dueDate="7/10/24";
	sixteenthBill.billAmountWithTax=260.00;
	sixteenthBill.isTaxInclusive=true;
	sixteenthBill.isBillPaid=false;
	sixteenthBill.isBillOverDue=true;
	
	System.out.println("Bill Id is: "+sixteenthBill.billId);
	System.out.println("Bill plan type is: "+sixteenthBill.planType);
	System.out.println("Bill amount is: "+sixteenthBill.billAmount);
	System.out.println("Bill issue date is: "+sixteenthBill.billIssueDate);
	System.out.println("Bill payment method is: "+sixteenthBill.paymentMethod);
	System.out.println("Bill due date is: "+sixteenthBill.dueDate);
	System.out.println("Bill amount with tax is: "+sixteenthBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+sixteenthBill.isTaxInclusive);
	System.out.println("Is bill paid: "+sixteenthBill.isBillPaid);
	System.out.println("Is bill over due: "+sixteenthBill.isBillOverDue+"\n");
	
	
	Bill seventeenthBill=new Bill();
	seventeenthBill.billId=17;
	seventeenthBill.planType="Quaterly";
	seventeenthBill.billAmount=540.00;
	seventeenthBill.billIssueDate="30/10/24";
	seventeenthBill.paymentMethod="Cash";
	seventeenthBill.dueDate="30/11/24";
	seventeenthBill.billAmountWithTax=567.89;
	seventeenthBill.isTaxInclusive=false;
	seventeenthBill.isBillPaid=false;
	seventeenthBill.isBillOverDue=false;
	
	System.out.println("Bill Id is: "+seventeenthBill.billId);
	System.out.println("Bill plan type is: "+seventeenthBill.planType);
	System.out.println("Bill amount is: "+seventeenthBill.billAmount);
	System.out.println("Bill issue date is: "+seventeenthBill.billIssueDate);
	System.out.println("Bill payment method is: "+seventeenthBill.paymentMethod);
	System.out.println("Bill due date is: "+seventeenthBill.dueDate);
	System.out.println("Bill amount with tax is: "+seventeenthBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+seventeenthBill.isTaxInclusive);
	System.out.println("Is bill paid: "+seventeenthBill.isBillPaid);
	System.out.println("Is bill over due: "+seventeenthBill.isBillOverDue+"\n");
	
	
	Bill eighteenthBill=new Bill();
	eighteenthBill.billId=18;
	eighteenthBill.planType="Monthly";
	eighteenthBill.billAmount=300.00;
	eighteenthBill.billIssueDate="5/8/24";
	eighteenthBill.paymentMethod="UPI";
	eighteenthBill.dueDate="5/9/24";
	eighteenthBill.billAmountWithTax=300.00;
	eighteenthBill.isTaxInclusive=true;
	eighteenthBill.isBillPaid=true;
	eighteenthBill.isBillOverDue=false;
	
	System.out.println("Bill Id is: "+eighteenthBill.billId);
	System.out.println("Bill plan type is: "+eighteenthBill.planType);
	System.out.println("Bill amount is: "+eighteenthBill.billAmount);
	System.out.println("Bill issue date is: "+eighteenthBill.billIssueDate);
	System.out.println("Bill payment method is: "+eighteenthBill.paymentMethod);
	System.out.println("Bill due date is: "+eighteenthBill.dueDate);
	System.out.println("Bill amount with tax is: "+eighteenthBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+eighteenthBill.isTaxInclusive);
	System.out.println("Is bill paid: "+eighteenthBill.isBillPaid);
	System.out.println("Is bill over due: "+eighteenthBill.isBillOverDue+"\n");
	
	
	Bill nineteenthBill=new Bill();
	nineteenthBill.billId=19;
	nineteenthBill.planType="Quaterly";
	nineteenthBill.billAmount=560.00;
	nineteenthBill.billIssueDate="25/6/24";
	nineteenthBill.paymentMethod="Card";
	nineteenthBill.dueDate="25/7/24";
	nineteenthBill.billAmountWithTax=560.00;
	nineteenthBill.isTaxInclusive=true;
	nineteenthBill.isBillPaid=true;
	nineteenthBill.isBillOverDue=false;
	
	System.out.println("Bill Id is: "+nineteenthBill.billId);
	System.out.println("Bill plan type is: "+nineteenthBill.planType);
	System.out.println("Bill amount is: "+nineteenthBill.billAmount);
	System.out.println("Bill issue date is: "+nineteenthBill.billIssueDate);
	System.out.println("Bill payment method is: "+nineteenthBill.paymentMethod);
	System.out.println("Bill due date is: "+nineteenthBill.dueDate);
	System.out.println("Bill amount with tax is: "+nineteenthBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+nineteenthBill.isTaxInclusive);
	System.out.println("Is bill paid: "+nineteenthBill.isBillPaid);
	System.out.println("Is bill over due: "+nineteenthBill.isBillOverDue+"\n");
	
	
	Bill twentythBill=new Bill();
	twentythBill.billId=20;
	twentythBill.planType="Half-Yearly";
	twentythBill.billAmount=1250.00;
	twentythBill.billIssueDate="3/5/24";
	twentythBill.paymentMethod="Card";
	twentythBill.dueDate="3/6/24";
	twentythBill.billAmountWithTax=1298.98;
	twentythBill.isTaxInclusive=false;
	twentythBill.isBillPaid=false;
	twentythBill.isBillOverDue=false;
	
	System.out.println("Bill Id is: "+twentythBill.billId);
	System.out.println("Bill plan type is: "+twentythBill.planType);
	System.out.println("Bill amount is: "+twentythBill.billAmount);
	System.out.println("Bill issue date is: "+twentythBill.billIssueDate);
	System.out.println("Bill payment method is: "+twentythBill.paymentMethod);
	System.out.println("Bill due date is: "+twentythBill.dueDate);
	System.out.println("Bill amount with tax is: "+twentythBill.billAmountWithTax);
	System.out.println("Is tax inclusive: "+twentythBill.isTaxInclusive);
	System.out.println("Is bill paid: "+twentythBill.isBillPaid);
	System.out.println("Is bill over due: "+twentythBill.isBillOverDue);
	
	
	System.out.println("\nmain ended");
	}
}