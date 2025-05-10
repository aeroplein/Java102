import java.util.Scanner;

public class Main {

    static Product product;
    static NotebookService ns = NotebookService.getInstance();
    static CellPhoneService cs = CellPhoneService.getInstance();
    static BrandService bs = new BrandService();
    static Scanner scanner = new Scanner(System.in);

//    public static void filterProducts(Service<? extends Product> service){
//        System.out.println("Markaya göre filtrele:");
//        System.out.println("Marka id'si girin:");
//        int idBrand = scanner.nextInt();
//
//    }

    public static void chooseBrand(int id){
        Brand brand = bs.getById(id);
        if (brand!=null){
            System.out.println("Brand seçildi: " + brand.getName()
            + " (ID: " + brand.getId() + ")");
        }else{
            System.out.println("Geçersiz brand ID");
        }
    }

    public static void showCellPhoneMenu(){
        System.out.println("Cellphone işlemleri: ");
        System.out.println("1 - Ürün Ekle");
        System.out.println("2 - Ürün Sil");
        System.out.println("3 - Ürün Listele");
        System.out.println("4 - Ürün Filtrele");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Ürün Ekle:");
                System.out.println("Eklemek istediğiniz ürünün bilgilerini girin:");
                System.out.println("ID:");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Product name: ");
                String productName = scanner.nextLine();
                System.out.println("Brand id:");
                int brandId = scanner.nextInt();
                Brand brand = bs.getById(brandId);
                System.out.println("Price: ");
                double price = scanner.nextDouble();
                System.out.println("Unit price: ");
                double unitPrice=scanner.nextDouble();
                System.out.println("Discount rate: ");
                double discountRate = scanner.nextDouble();
                System.out.println("Stock amount: ");
                int stockAmount = scanner.nextInt();
                System.out.println("Screen size: ");
                double screenSize = scanner.nextDouble();
                System.out.println("Battery power: ");
                int batteryPower = scanner.nextInt();
                System.out.println("Storage: ");
                int storage = scanner.nextInt();
                System.out.println("RAM: ");
                int RAM = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Renk: ");
                String color = scanner.nextLine();
                product = new CellPhone(id, price, unitPrice,discountRate,stockAmount,productName,brand,storage,screenSize,batteryPower,RAM, color);
                cs.add(product);
                System.out.println(product +  " added successfully.");
                break;
            case 2:
                System.out.println("Ürün Sil:");
                System.out.println("Silmek istediğiniz ürünün id'sini girin: ");
                int choiceId = scanner.nextInt();
                cs.remove(choiceId);
                System.out.println("Removed successfully.");
                break;

            case 3:
                System.out.println("Ürün Listesi: ");
                System.out.println("Notebook ürünleri listeleniyor...");
                cs.listProducts();
                break;

            case 4:
                System.out.println("Ürün Filtrele:");
                System.out.println("Markaya göre filtrelemek için marka id'si girin:");
                int brandIdChoice = scanner.nextInt();
                cs.filterByBrand(brandIdChoice);
                break;

            default:
                System.out.println("Wrong input.");
        }
    }

    public static void showNotebookMenu(){
        System.out.println("Notebook İşlemleri");
        System.out.println("1 - Ürün Ekle");
        System.out.println("2 - Ürün Sil");
        System.out.println("3 - Ürün Listele");
        System.out.println("4 - Ürün Filtrele");


        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("Ürün Ekle:");
                System.out.println("Eklemek istediğiniz ürün bilgilerini girin");
                System.out.println("ID:");
                int id= scanner.nextInt();
                scanner.nextLine();
                System.out.println("Product name: ");
                String productName = scanner.nextLine();
                System.out.println("Brand-Id: ");
                int brandId = scanner.nextInt();
                Brand brand = bs.getById(brandId);
                System.out.println("Price: ");
                double price = scanner.nextDouble();
                System.out.println("Unit price: ");
                double unitPrice=scanner.nextDouble();
                System.out.println("Discount rate: ");
                double discountRate = scanner.nextDouble();
                System.out.println("Stock amount: ");
                int stockAmount = scanner.nextInt();
                System.out.println("Screen size: ");
                double screenSize = scanner.nextDouble();
                System.out.println("Storage: ");
                int storage = scanner.nextInt();
                System.out.println("RAM: ");
                int RAM = scanner.nextInt();
                product = new Notebook(id,productName,brand,price,unitPrice,
                        discountRate,stockAmount,RAM, storage,
                        screenSize);

                ns.add((Notebook) product);
                System.out.println(product + " added successfully.");
                break;
            case 2:
                System.out.println("Ürün Sil:");
                System.out.println("Silmek istediğiniz ürünün id'sini girin: ");
                int choiceId = scanner.nextInt();
                ns.remove(choiceId);
                System.out.println("Removed successfully.");
                break;

            case 3:
                System.out.println("Ürün Listesi: ");
                System.out.println("Notebook ürünleri listeleniyor...");
                ns.listProducts();
                break;
            case 4:
                System.out.println("Ürün Filtrele:");
                System.out.println("Markaya göre filtrelemek için marka id'si girin:");
                int brandIdChoice = scanner.nextInt();
                ns.filterByBrand(brandIdChoice);
                break;

            default:
                System.out.println("Wrong input in notebook menu. Try again.");
        }

    }




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("PatikaStore Ürün Yönetim Paneli!");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            int input = scanner.nextInt();
            System.out.println("Tercihiniz: " + input);

            switch(input){
                case 1:
                    showNotebookMenu();
                    break;
                case 2:
                    showCellPhoneMenu();
                    break;
                case 3:
                    bs.listById();
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong input.");
            }


        }








    }
}
