class WaterRunner{
    public static void main(String[] water) {
        System.out.println("\nmain started\n");

        Water water1 = new Water();
        water1.getInfo();

        Water water2 = new Water(102);
        water2.getInfo();

        Water water3 = new Water(true,7.2,"Well");
        water3.getInfo();

        Water water4 = new Water("Steam");
        water4.getInfo();

        Water water5 = new Water(15,103);
        water5.getInfo();

        Water water6 = new Water(6.0,"Spring");
        water6.getInfo();

        Water water7 = new Water(200,"Liquid",20,"Lake",true,7.8);
        water7.getInfo();

        System.out.println("\nmain ended");
    }
}
