import java.util.*;

public class NotebookService extends Service<Notebook>{

    private static NotebookService instance;
    private Map<Integer, Notebook> notebookMap = new TreeMap<>();
    public static synchronized NotebookService getInstance(){
        if (instance==null){
            instance = new NotebookService();
        }
        return instance;
    }

    private NotebookService(){}

    @Override
    public void add(Notebook notebook) {
        if (notebookMap.containsKey(notebook.getId())){
            System.out.println("Notebook already exists.");
        }else{
            notebookMap.put(notebook.getId(), notebook);
            System.out.println("Notebook added successfully.");
            System.out.println("Log. Listing");
            listProducts();
        }
    }

    @Override
    public void remove(int id) {
        if (notebookMap.containsKey(id)){
            notebookMap.remove(id);
            System.out.println("Notebook removed successfully.");

        }else{
            System.out.println("No such notebook found.");
        }
    }

    @Override
    public List<Notebook> getAll() {
        return new ArrayList<>(notebookMap.values());
    }


    public void listProducts() {
        if (notebookMap.isEmpty()) {
            System.out.println("Notebook listesi boş.");
            return;
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s| %-30s | %-9s | %-10s | %-10s | %-9s | %-11s |\n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
        System.out.println("----------------------------------------------------------------------------------------------------");

        for (Notebook n : notebookMap.values()) {
            System.out.printf("| %-3d| %-30s | %-9.2f TL | %-10s | %-10d | %-9.1f | %-11d |\n",
                    n.getId(), n.getProductName(), n.getPrice(), n.getBrand().getName(),
                    n.getStorage(), n.getScreenSize(), n.getRAM());
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    @Override
    public void filterByBrand(int brandId){
        boolean found = false;
        System.out.printf("| %-3s| %-30s | %-9s | %-10s | %-10s | %-9s | %-11s |\n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Notebook n : notebookMap.values()){
            if (n.getBrand().getId() == brandId){
                System.out.printf("| %-3d| %-30s | %-9.2f TL | %-10s | %-10d | %-9.1f | %-11d |\n",
                        n.getId(), n.getProductName(), n.getPrice(), n.getBrand().getName(),
                        n.getStorage(), n.getScreenSize(), n.getRAM());
                found = true;
            }
        }

        if (!found){
            System.out.println("Bu markayla eşleşen ürün bulunamadı.");
        }

        System.out.println("----------------------------------------------------------------------------------------------------");
    }

}

