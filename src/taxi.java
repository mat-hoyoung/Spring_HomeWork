public class taxi {

    String TaxiNumber;
    int GasVolume;
    int CurrentVelocity;
    String Destination;
    int NormalDistance = 3;
    int UntilDestinationDistance;
    int NormalPrice = 3000;
    int ChargesPerDistance;
    int Status;

    public taxi(int GasVolume, int CurrentVelocity, String Destination, int UntilDestinationDistance, int ChargesPerDistance, int Status ) {
        this.GasVolume = GasVolume;
        this.CurrentVelocity = CurrentVelocity;
        this.Destination = Destination;
        this.UntilDestinationDistance = UntilDestinationDistance;
        this.ChargesPerDistance = ChargesPerDistance;
        this.Status = Status;

    }

    public String getTaxiNumber() {
        return TaxiNumber;
    }

    public void setTaxiNumber(String taxiNumber) {
        TaxiNumber = taxiNumber;
    }

    public int getGasVolume() {
        return GasVolume;
    }

    public void setGasVolume(int gasVolume) {
        if (GasVolume > 10) {
            GasVolume = gasVolume;
            System.out.println("운행 가능");
        } else if(GasVolume < 0) {
            System.out.println("값이 이상합니다...");
        } else {
            GasVolume = gasVolume;
            System.out.println("주유량이 부족합니다.");
        }
    }

    public int getCurrentVelocity() {
        return CurrentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        CurrentVelocity = currentVelocity;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public int getNormalDistance() {
        return NormalDistance;
    }

    public void setNormalDistance(int normalDistance) {
        NormalDistance = normalDistance;
    }

    public int getUntilDestinationDistance() {
        return UntilDestinationDistance;
    }

    public void setUntilDestinationDistance(int untilDestinationDistance) {
        UntilDestinationDistance = untilDestinationDistance;
    }

    public int getNormalPrice() {
        return NormalPrice;
    }

    public void setNormalPrice(int normalPrice) {
        NormalPrice = normalPrice;
    }

    public int getChargesPerDistance() {
        return ChargesPerDistance;
    }

    public void setChargesPerDistance(int chargesPerDistance) {
            ChargesPerDistance = chargesPerDistance;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = Status;
    }

    void PlusVelocity (int speed) {
        if (this.CurrentVelocity + speed > 0) {
            setCurrentVelocity(this.CurrentVelocity + speed);
            System.out.println("현재 속도는 " + getCurrentVelocity() + "입니다." );
        }else if (this.CurrentVelocity + speed == 0){
            System.out.println("현재 속도는" + getCurrentVelocity() + "입니다.");
        }else {
            setCurrentVelocity(this.CurrentVelocity + speed);
            System.out.println("현재 속도는 " + getCurrentVelocity() + "입니다." );
        }
    }

    void Status (int status) {
        if (status == 0) {
            Status = status;
            System.out.println("탑승 가능");
        }else if(status < 0) {
            System.out.println("값이 이상합니다..");
        }else if (status > 3){
            Status = status;
            System.out.println("인원이 초과되어 탑승 불가합니다. 최대인원 : 3명");
        }else {
            Status = status;
            System.out.println("운행중 (탑승불가)");
        }
    }
    void AddPerPrice (int addPerPrice) {
       setChargesPerDistance(this.ChargesPerDistance + addPerPrice);
    }
    void PayPrice () {
        if (UntilDestinationDistance > NormalDistance) {
            System.out.println("요금은" + (NormalPrice + ((UntilDestinationDistance - NormalDistance) * ChargesPerDistance)) + "원 입니다.");
        } else {
            System.out.println("요금은" + NormalPrice + "입니다. ");

        }
    }
}