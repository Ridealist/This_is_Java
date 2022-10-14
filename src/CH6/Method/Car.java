package CH6.Method;

public class Car {

    int gas;

    // 생성자 선언(생략 가능)
    Car() {
    }

    // 리턴값 없이 메소드로 매개값을 받아서 gas 필드값을 변경
    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }
    
    void run() { 
        while(true) {
            if (gas>0) {
                System.out.println("달립니다. (gas 잔량: " + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다. (gas 잔량: " + gas + ")");
                return; // 리턴값 없는 메소드 실행 종료
            }
        }
    }
}
