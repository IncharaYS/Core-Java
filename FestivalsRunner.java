class FestivalsRunner{
	public static void main(String[] festival){
	System.out.println("\nmain started\n");
	
	Festivals festival1=new Festivals();
	
	festival1.festivalId=1;
	festival1.name="Deevali";
	festival1.country="India";
	festival1.religion="Hindhu";
	festival1.date="20/10";
	festival1.hasPublicHoliday=true;
	

	
	Festivals festival2=new Festivals();

	festival2.festivalId=2;
	festival2.name="Christmas";
	festival2.country="USA";
	festival2.religion="Christianity";
	festival2.date="25/12";
	festival2.hasPublicHoliday=true;



	Festivals festival3=new Festivals();

	festival3.festivalId=3;
	festival3.name="Ramadan";
	festival3.country="Saudi Arabia";
	festival3.religion="Islam";
	festival3.date="10/04";
	festival3.hasPublicHoliday=true;



	Festivals festival4=new Festivals();

	festival4.festivalId=4;
	festival4.name="Vesak";
	festival4.country="Sri Lanka";
	festival4.religion="Buddhism";
	festival4.date="15/05";
	festival4.hasPublicHoliday=true;



	Festivals festival5=new Festivals();

	festival5.festivalId=5;
	festival5.name="Hanukkah";
	festival5.country="Israel";
	festival5.religion="Judaism";
	festival5.date="18/12";
	festival5.hasPublicHoliday=false;



	Festivals festival6=new Festivals();

	festival6.festivalId=6;
	festival6.name="Songkran";
	festival6.country="Thailand";
	festival6.religion="Buddhism";
	festival6.date="13/04";
	festival6.hasPublicHoliday=true;



	Festivals festival7=new Festivals();

	festival7.festivalId=7;
	festival7.name="Nowruz";
	festival7.country="Iran";
	festival7.religion="Zoroastrianism";
	festival7.date="21/03";
	festival7.hasPublicHoliday=true;


	Festivals festival8=new Festivals();

	festival8.festivalId=8;
	festival8.name="Thanksgiving";
	festival8.country="Canada";
	festival8.religion="Secular";
	festival8.date="14/10";
	festival8.hasPublicHoliday=true;



	Festivals festival9=new Festivals();

	festival9.festivalId=9;
	festival9.name="Carnival";
	festival9.country="Brazil";
	festival9.religion="Christianity";
	festival9.date="21/02";
	festival9.hasPublicHoliday=true;



	Festivals festival10=new Festivals();

	festival10.festivalId=10;
	festival10.name="Holi";
	festival10.country="India";
	festival10.religion="Hindu";
	festival10.date="08/03";
	festival10.hasPublicHoliday=true;



	Festivals festival11=new Festivals();

	festival11.festivalId=11;
	festival11.name="Eid al-Adha";
	festival11.country="Indonesia";
	festival11.religion="Islam";
	festival11.date="17/06";
	festival11.hasPublicHoliday=true;



	Festivals festival12=new Festivals();

	festival12.festivalId=12;
	festival12.name="Obon";
	festival12.country="Japan";
	festival12.religion="Buddhism";
	festival12.date="15/08";
	festival12.hasPublicHoliday=false;



	Festivals festival13=new Festivals();

	festival13.festivalId=13;
	festival13.name="Halloween";
	festival13.country="USA";
	festival13.religion="Secular";
	festival13.date="31/10";
	festival13.hasPublicHoliday=false;


	Festivals festival14=new Festivals();

	festival14.festivalId=14;
	festival14.name="Gudi Padwa";
	festival14.country="India";
	festival14.religion="Hindu";
	festival14.date="22/03";
	festival14.hasPublicHoliday=true;



	Festivals festival15=new Festivals();

	festival15.festivalId=15;
	festival15.name="Mid-Autumn Festival";
	festival15.country="China";
	festival15.religion="Taoism";
	festival15.date="29/09";
	festival15.hasPublicHoliday=true;


	Festivals festival16=new Festivals();

	festival16.festivalId=16;
	festival16.name="Easter";
	festival16.country="Italy";
	festival16.religion="Christianity";
	festival16.date="09/04";
	festival16.hasPublicHoliday=true;



	Festivals festival17=new Festivals();

	festival17.festivalId=17;
	festival17.name="Navruz";
	festival17.country="Uzbekistan";
	festival17.religion="Islam";
	festival17.date="21/03";
	festival17.hasPublicHoliday=true;



	Festivals festival18=new Festivals();

	festival18.festivalId=18;
	festival18.name="Tet";
	festival18.country="Vietnam";
	festival18.religion="Buddhism";
	festival18.date="10/02";
	festival18.hasPublicHoliday=true;



	Festivals festival19=new Festivals();

	festival19.festivalId=19;
	festival19.name="Rosh Hashanah";
	festival19.country="Israel";
	festival19.religion="Judaism";
	festival19.date="16/09";
	festival19.hasPublicHoliday=true;



	Festivals festival20=new Festivals();

	festival20.festivalId=20;
	festival20.name="Guru Nanak Jayanti";
	festival20.country="India";
	festival20.religion="Sikhism";
	festival20.date="27/11";
	festival20.hasPublicHoliday=true;

	festival1.getInfo();
	festival2.getInfo();
	festival3.getInfo();
	festival4.getInfo();
	festival5.getInfo();
	festival7.getInfo();
	festival6.getInfo();
	festival8.getInfo();
	festival9.getInfo();
	festival10.getInfo();
	festival11.getInfo();
	festival13.getInfo();
	festival12.getInfo();
	festival14.getInfo();
	festival15.getInfo();
	festival16.getInfo();
	festival17.getInfo();
	festival18.getInfo();
	festival19.getInfo();
	festival20.getInfo();
	
	System.out.println("\nmain ended");
	}
}