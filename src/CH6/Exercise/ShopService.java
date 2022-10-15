package CH6.Exercise;

// 싱글톤 만들기
public class ShopService {

    static ShopService shopService = new ShopService();

    private ShopService() {}

    static ShopService getInstance() {
        return shopService;
    }
}
