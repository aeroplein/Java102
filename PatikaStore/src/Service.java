import java.util.*;

public abstract class Service<T extends Product> {

    Map<Integer, T> productList = new TreeMap<>();

    public Service(){

    }

//    public void add(T product){
//        if (productList.containsKey(product.getId())){
//            System.out.println("Product already added to the system.");
//        }else{
//            productList.put(product.getId(), product);
//        }
//    }

    public abstract void add(T product);

    public abstract void remove(int id);

    public abstract List<T> getAll();

    public List<T> getProductList(){
        return new ArrayList<>(productList.values());
    }

    public void listProducts(){
        for(Product p: productList.values()){
            System.out.println(p);
        }
    }

    public void listProductsById() {
        getAll().stream()
                .sorted(Comparator.comparing(Product::getId))
                .forEach(System.out::println);
    }

    public void listProductsByBrand() {
        getAll().stream()
                .sorted(Comparator.comparing(p -> p.getBrand().getName()))
                .forEach(System.out::println);
    }


    public abstract void filterByBrand(int brandId);

//    public void listProductsById(){
//        List<Product> sortedList = new ArrayList<>(productList);
//
//        sortedList.sort(Comparator.comparing(Product::getId));
//
//        for (Product p : sortedList){
//            //sonradan formatlarız belki dur şimdilik böyle
//            System.out.println(p);
//        }
//    }

//    public void listProductsByBrand(){
//        List<T> sortedList = new ArrayList<>(productList.values());
//
//        sortedList.sort(Comparator.comparing(p -> p.getBrand().getName()));
//        //sortedList.sort(Comparator.comparing(n -> n.getBrand().getName()));
//        for (T p : sortedList){
//            //sonradan formatlarız belki dur şimdilik böyle
//            System.out.println(p);
//        }
//    }


}
