import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CellPhoneService extends Service<Product>{

    private static CellPhoneService instance;
    public static synchronized  CellPhoneService getInstance(){
        if (instance==null){
            instance = new CellPhoneService();
        }
        return instance;
    }

    private CellPhoneService(){}

    private Map<Integer, CellPhone> cellPhoneMap = new TreeMap<>();

    @Override
    public void add(Product product) {
        if (cellPhoneMap.containsKey(product.getId())){
            System.out.println("Cellphone ürünü zaten var.");

        }else{
            cellPhoneMap.put(product.getId(), (CellPhone) product);
            System.out.println("Ürün başarıyla eklendi.");
        }
    }

    @Override
    public void remove(int id) {
        if (cellPhoneMap.containsKey(id)){
            productList.remove(id);
            System.out.println("Ürün başarıyla silindi.");
        }else{
            System.out.println("Ürün bulunamadı.");
        }
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(cellPhoneMap.values());
    }

    public void listProducts() {
        if (cellPhoneMap.isEmpty()) {
            System.out.println("Cep Telefonu listesi boş.");
            return;
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s| %-30s | %-9s | %-10s | %-10s | %-9s | %-9s | %-9s | %-9s |\n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Pil", "RAM", "Renk");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        for (CellPhone c : cellPhoneMap.values()) {
            System.out.printf("| %-3d| %-30s | %-9.2f TL | %-10s | %-10d | %-9.1f | %-9d | %-9d | %-9s |\n",
                    c.getId(), c.getProductName(), c.getPrice(), c.getBrand().getName(),
                    c.getStorage(), c.getScreenSize(), c.getBatteryPower(), c.getRAM(), c.getColor());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }
    @Override
    public void filterByBrand(int brandId){
        boolean found = false;
        System.out.printf("| %-3s| %-30s | %-9s | %-10s | %-10s | %-9s | %-7s | %-7s | %-10s |\n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM", "Pil", "Renk");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (CellPhone c : cellPhoneMap.values()) {
            if (c.getBrand().getId() == brandId) {
                System.out.printf("| %-3d| %-30s | %-9.2f TL | %-10s | %-10d | %-9.1f | %-6d | %-6d | %-10s |\n",
                        c.getId(), c.getProductName(), c.getPrice(), c.getBrand().getName(),
                        c.getStorage(), c.getScreenSize(), c.getBatteryPower(), c.getRAM(), c.getColor());
                found = true;
            }
        }

        if(!found){
            System.out.println("Bu markayla eşleşen ürün bulunamadı.");
        }

        System.out.println("----------------------------------------------------------------------------------------------------");
    }

}
