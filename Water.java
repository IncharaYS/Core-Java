class Water {
    int waterId;
    String waterState;
    int temperature;
    String waterSource;
    boolean isSafeForDrinking;
    double phValue;

    Water() {
    this(101,"Liquid",25,"River",true,7.0);
    System.out.println("Default constructor");
    }

    Water(int waterId,String waterState,int temperature,String waterSource,boolean isSafeForDrinking,double phValue) {
    this(true,6.5,"Tap");
	this.waterId=waterId;
	this.waterState=waterState;
	this.temperature=temperature;
	this.waterSource=waterSource;
	this.isSafeForDrinking=isSafeForDrinking;
	this.phValue=phValue;
	System.out.println("Constructor with all values initialization");
    }

    Water(int waterId) {
    this(6.8,"Rain");
    this.waterId=waterId;
    System.out.println("Constructor with waterId initialization");
    }

    Water(double phValue,String waterSource) {
    this(false,5.5,"Ground");
    this.phValue=phValue;
    this.waterSource=waterSource;
    System.out.println("Constructor with phValue and waterSource initialization");
    }

    Water(String waterState) {
    this(100);
    this.waterState=waterState;
    System.out.println("Constructor with waterState initialization");
    }

    Water(int temperature,int waterId) {
    this("Frozen");
    this.temperature=temperature;
    this.waterId=waterId;
    System.out.println("Constructor with temperature and waterId initialization");
    }

    Water(boolean isSafeForDrinking,double phValue,String waterSource) {
    this.isSafeForDrinking=isSafeForDrinking;
    this.phValue=phValue;
    this.waterSource=waterSource;
    System.out.println("Constructor with isSafeForDrinking, phValue, waterSource initialization");
    }

    public void getInfo() {
        System.out.println("Water ID is: " +waterId);
        System.out.println("Water State is: " +waterState);
        System.out.println("Temperature is: " +temperature);
        System.out.println("Water Source is: " +waterSource);
        System.out.println("Safe for Drinking?: " +isSafeForDrinking);
        System.out.println("pH Value is: " + phValue +"\n");
    }
}
