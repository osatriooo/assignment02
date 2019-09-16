
        for (int i=0; i<fuel; i++) {
            movement[i] = String.valueOf(move.charAt(i));
            if (movement[i].equals(R)) {
                this.postX++;
                System.out.println("Your Coordinate, R :" + this.postX + "," + this.postY);
            }else if(movement[i].equals(F)){
                this.postY++;
                System.out.println("Your Coordinate, F :" + this.postX + "," + this.postY);
            }else if (){
                this.postX++;
                System.out.println("Your Coordinate, R :" + this.postX + "," + this.postY);
            }else if (){
                this.postX++;
                System.out.println("Your Coordinate, R :" + this.postX + "," + this.postY);
                
            }else{
                
            }
            return "";
        }
        return "";


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Mobil Innova = new Mobil();
        System.out.print(Innova.bensinAwal());
        System.out.print("Isi Bensin : ");
        String input = br.readLine();
        Integer inputInteger = Integer.parseInt(input);
        Innova.fillFuel(inputInteger);
        Innova.engineStart();
        System.out.print("Masukkan Titik Awal X : ");
        String titikawalx = br.readLine();
        System.out.print("Masukkan Titik Awal Y : ");
        String titikawaly = br.readLine();
        int tAwalIntX = Integer.parseInt(titikawalx);
        int tAwalIntY = Integer.parseInt(titikawaly);
        System.out.println(tAwalIntX + "," + tAwalIntY);
        System.out.println(Innova.engineStart());
        System.out.print("Masukkan Arah R,L,F,B: ");
        String arah = br.readLine();
//        String [] perintah = new String[Innova.tampungfuel()*3];
        Innova.move(inputInteger,arah,tAwalIntX,tAwalIntY);
//        for (int i=0, b=1; i<Innova.tampungfuel()*3; i++){
//            perintah[i] = String.valueOf(arah.charAt(i));
//            if(i==Innova.tampungfuel()*3){
//                System.out.println("Bensin Habis!");
//            }
//            if(perintah[i].equals("R")) {
//                tAwalIntX = tAwalIntX + 1;
//                System.out.println("R(x,y) : " + tAwalIntX + "," + tAwalIntY);
//            }else if(perintah[i].equals("F")){
//                    tAwalIntY = tAwalIntY+1;
//                    System.out.println("R(x,y) : " + tAwalIntX + ","+ tAwalIntY );
//            }else if(perintah[i].equals("L")){
//                    tAwalIntX = tAwalIntX-1;
//                    System.out.println("R(x,y) : " + tAwalIntX + "," + tAwalIntY );
//            }else if(perintah[i].equals("B")){
//                    tAwalIntY = tAwalIntY-1;
//                    System.out.println("R(x,y) : " + tAwalIntX + "," + tAwalIntY );
//            }else{
//            System.out.println("Masukkan Huruf Sesuai Perintah!");
//            }
//        }
        Innova.parking();
        System.out.println(Innova.toString());

++++++++++++++++++++++++++++++++++++++++++++
    private Integer x=0;
    private Integer y=0;
    private Integer fuel = 0;
    private boolean isStart;

    public Integer tampungfuel(){
        Integer vFuel = this.fuel;
        return vFuel;
    }
    public String move(int tampung, String arah, int x, int y){
        String [] perintah = new String[tampung*3];
        for (int i=0, b=1; i<tampungfuel()*3; i++){
            perintah[i] = String.valueOf(arah.charAt(i));
            if(i==tampungfuel()*3){
                System.out.println("Bensin Habis!");
            }
            if(perintah[i].equals("R")) {
                x = x + 1;
                System.out.println("R(x,y) : " + x + "," + y);
            }else if(perintah[i].equals("F")){
                y = y+1;
                System.out.println("R(x,y) : " + x + ","+ y );
            }else if(perintah[i].equals("L")){
                x = x-1;
                System.out.println("R(x,y) : " + x + "," + y );
            }else if(perintah[i].equals("B")){
                y = y-1;
                System.out.println("R(x,y) : " + x + "," + y );
            }else{
                System.out.println("Masukkan Huruf Sesuai Perintah!");
            }
        }
        return "";
    }

    public String bensinAwal(){
        if (fuel==0) {
            System.out.println("Bensin Anda "+fuel+" Liter");
        }
        return "";
    }
    public String fillFuel(Integer fuel) {
        this.fuel = this.fuel + fuel;
        return "";
    }
    public Boolean isFuelSuffication() {
        return this.fuel > 0;
    }
    public String engineStart() {
        if (isFuelSuffication()) {
            isStart = true;
            return "Burm Burm";
        }else{
            return "Bensin habis, silahkan isi bensin : ";
        }
    }
    public String engineStop() {
        isStart = true;
        return "Stop";
    }
    public void parking(){
        System.out.println("Try Parking!");
        if(isStart){
            System.out.println("Not Yet, Turn Off Your Engine!!!");
        }else {
            System.out.println("Your Parking");
        }
    }

    @Override
    public String toString() {
        return "Mobil{" +
                "fuel=" + fuel +
                ", isStart=" + isStart +
                '}';
    }