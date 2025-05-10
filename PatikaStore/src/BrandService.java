import java.util.*;

public class BrandService {

    private static Map<Integer, Brand> brands = new HashMap<>();

    static {
        brands.put(1, new Brand(1, "Samsung"));
        brands.put(2, new Brand(2, "Lenovo"));
        brands.put(3, new Brand(3, "Apple"));
        brands.put(4, new Brand(4, "Huawei"));
        brands.put(5, new Brand(5, "Casper"));
        brands.put(6, new Brand(6, "Asus"));
        brands.put(7, new Brand(7, "HP"));
        brands.put(8, new Brand(8, "Xiaomi"));
        brands.put(9, new Brand(9, "Monster"));
    }



    //add remove listbyid ve listbyname metotlarını yaz

    public boolean add(Brand brand){
       if(brand==null || brand.getName() == null || brand.getName().isEmpty()){
           return false;
       }
       for(Brand b : brands.values()){
           if (brand.getName().equalsIgnoreCase(b.getName())){
               return false;

           }

       }
       brands.put(brand.getId(), brand);
       return true;

    }

    public Brand getById(int id){
        return brands.get(id);
    }

    public void removeById(int id){
        brands.remove(id);
    }

    public void listById(){
        List<Brand> sorted = new ArrayList<>(brands.values());
        sorted.sort(Comparator.comparing(Brand::getId));
        for (Brand brand : sorted) {
            System.out.printf("- %s (ID: %d)%n", brand.getName(), brand.getId());
        }

    }

    public void listByName(){
        List<Brand> sorted = new ArrayList<>(brands.values());
        sorted.sort(Comparator.comparing(Brand::getName, String.CASE_INSENSITIVE_ORDER));
        for (Brand brand: sorted){
            System.out.printf("- %s (ID: %d)%n", brand.getName(), brand.getId());
        }
    }

    public Collection<Brand> getAllBrand(){
        return brands.values();
    }


































































//    public List<Brand> getAllBrands() {
//        return new ArrayList<>(brands);
//    }
//
//    // Marka ekle
//    public boolean addBrand(Brand brand) {
//        if (brand == null || brand.getName() == null || brand.getName().isEmpty()) {
//            return false;
//        }
//
//        for (Brand b : brands) {
//            if (b.getName().equalsIgnoreCase(brand.getName())) {
//                return false; // Zaten var
//            }
//        }
//
//        brands.add(brand);
//        return true;
//    }
//
//    // ID'ye göre marka sil
//    public boolean removeBrandById(int id) {
//        return brands.removeIf(brand -> brand.getId() == id);
//    }
//
//    // İsimle marka sil
//    public boolean removeBrandByName(String name) {
//        return brands.removeIf(brand -> brand.getName().equalsIgnoreCase(name));
//    }
//
//    // ID ile marka bul
//    public Brand getBrandById(int id) {
//        for (Brand brand : brands) {
//            if (brand.getId() == id) {
//                return brand;
//            }
//        }
//        return null;
//    }
//
//    public void listBrands() {
//        List<Brand> sortedBrands = new ArrayList<>(brands);
//
//        sortedBrands.sort(Comparator.comparing(Brand::getName));
//
//        System.out.println("Marka Listesi:");
//        for (Brand brand : sortedBrands) {
//            System.out.printf("- %s (ID: %d)%n", brand.getName(), brand.getId());
//        }
//    }


}
