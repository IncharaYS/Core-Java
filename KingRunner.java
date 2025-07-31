class KingRunner{
	public static void main(String king[]){
	System.out.println("\nmain started\n");
	 

	King king1 = new King(1, "Henry VII", 98, "England", "Edward VI", "34"); 
	
	/* king1.kingId=1;
	king1.name="Henry VII";
	king1.age=98;
	king1.birthPlace="England";
	king1.heir="Edward VI";
	king1.yearsOfRuling="34"; */ 
	System.out.println("King id is:"+king1.kingId);
	System.out.println("King name is:"+king1.name);
	System.out.println("King age is:"+king1.age);
	System.out.println("King birth place is:"+king1.birthPlace);
	System.out.println("King heir is:"+king1.heir);
	System.out.println("King years of ruling is:"+king1.yearsOfRuling+"\n");

	King king2 = new King();

	/* king2.kingId=2;
	king2.name="Louis XIV";
	king2.age=76;
	king2.birthPlace="France";
	king2.heir="Louis XV";
	king2.yearsOfRuling="72"; */
	System.out.println("King id is:"+king2.kingId);
	System.out.println("King name is:"+king2.name);
	System.out.println("King age is:"+king2.age);
	System.out.println("King birth place is:"+king2.birthPlace);
	System.out.println("King heir is:"+king2.heir);
	System.out.println("King years of ruling is:"+king2.yearsOfRuling+"\n");

	King king3 = new King(3);

	/* king3.kingId=3;
	king3.name="Akbar";
	king3.age=63;
	king3.birthPlace="Umerkot";
	king3.heir="Jahangir";
	king3.yearsOfRuling="49"; */
	System.out.println("King id is:"+king1.kingId+"\n");

	King king4 = new King(4, "Ashoka");

	/* king4.kingId=4;
	king4.name="Ashoka";
	king4.age=72;
	king4.birthPlace="Pataliputra";
	king4.heir="Kunala";
	king4.yearsOfRuling="36"; */
	System.out.println("King id is:"+king1.kingId);
	System.out.println("King name is:"+king1.name+"\n");

	King king5 = new King(5, "Alexander", 32, "Macedon", "None", "13"); 
	
	/* king5.kingId=5;
	king5.name="Alexander";
	king5.age=32;
	king5.birthPlace="Macedon";
	king5.heir="None";
	king5.yearsOfRuling="13"; */
	System.out.println("King id is:"+king1.kingId);
	System.out.println("King name is:"+king1.name);
	System.out.println("King age is:"+king1.age+"\n");

	System.out.println("\nmain ended");
	}
}