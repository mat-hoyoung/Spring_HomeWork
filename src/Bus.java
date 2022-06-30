import java.util.UUID;

public class Bus {
    int maxPassenger;
    int currentPassenger;
    int price;
    String busNumber;
    int gasVolume;
    int currentVelocity;
    String busStatus;

    public Bus(int maxPassenger, int currentPassenger, int price, int gasVolume, int currentVelocity) {
        this.maxPassenger = maxPassenger;
        this.currentPassenger = currentPassenger;
        this.price = price;
        this.gasVolume = gasVolume;
        this.currentVelocity = currentVelocity;
        this.busNumber = String.valueOf(UUID.randomUUID());
        this.busStatus = "운행중";
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getCurrentPassenger() {
        return currentPassenger;
    }

    public void setCurrentPassenger(int currentPassenger ) {
        if(this.currentPassenger <= maxPassenger) {
            this.currentPassenger = currentPassenger;
        } else if(this.currentPassenger < 0) {
            System.out.println("승객 수가 이상합니다.. ");
        } else {
            System.out.println("승객 수가 초과하였습니다.");
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public int getGasVolume() {
        return gasVolume;
    }

    public void setGasVolume(int gasVolume) {
        this.gasVolume = gasVolume;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        if (currentVelocity > 0 ) {
            this.currentVelocity = currentVelocity;
            System.out.println("현재 속도는" + currentVelocity + "km/s 입니다. ");
        } else if (currentVelocity == 0) {
            this.currentVelocity = currentVelocity;
            System.out.println("버스가 정지 했습니다.");
        } else {
            System.out.println("오류입니다.");
        }
    }

    public String getBusStatus() {
        return busStatus;
    }

    public void setBusStatus(String busStatus) {
        this.busStatus = busStatus;
    }

    void TakePassenger () {
        if (currentPassenger + 1 < maxPassenger) {
            setCurrentPassenger(currentPassenger + 1);
            System.out.println("현재 버스 탑승 인원 수 : " + currentPassenger );

        }else {
            System.out.println("승객 수가 초과 하였습니다.");
        }

    }

    void gas () {
        if (gasVolume > 10) {
            System.out.println("현재 주유량 : " + gasVolume );
        }else {
            setBusStatus("차고지행");
            System.out.println("주유량을 확인해 주세요.");
        }
    }

    void ChangeVelocity (int speed) {
        if (gasVolume > 10) {
            setCurrentVelocity(this.currentVelocity + speed);
            System.out.println("현재 속도:" +this.currentVelocity);
        }else {
            setBusStatus("차고지행");
            System.out.println("주유량이 부족하여 시동이 걸리지 않습니다.");
        }

    }

}

