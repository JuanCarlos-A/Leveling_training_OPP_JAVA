package session_3.task_8;
import java.util.ArrayList;
public class Inventario {
//    Intancia de Clase
    private Producto producto = new Producto();

//    Constructor
    public Inventario() {}

//    Metodos
    public void addProducts(String name, double price, int cant){
        ArrayList<String> nameProducts = producto.getNameProducts();
        ArrayList<Integer> cantProducts =producto.getCantProducts();
        ArrayList<Double> priceProducts =producto.getPriceProducts();
        boolean verify = true;
        for (int i = 0; i < nameProducts.size(); i++){
            if (name.equals(nameProducts.get(i))){
                priceProducts.set(i,price);
                cantProducts.set(i,cantProducts.get(i)+cant);
                producto.setList(nameProducts, priceProducts, cantProducts);
                verify = false;
                break;
            }
        }
        if (verify){
            producto.setNameProduct(name);
            producto.setCantProduct(cant);
            producto.setPriceProduct(price);
            producto.addProducts();
            System.out.println("Producto agregado correctamente");
        }else{
            System.out.println("Producto actualizado correctamente");
        }
    }
    public void getProducts() {
        int i = 0;
        if (producto.getNameProducts().isEmpty()){
            System.out.println("No hay productos existentes en el sistema, ingresa un producto");
        }else{
            for (String p : producto.getNameProducts()){
                System.out.println("Producto : " + p);
                System.out.println("Precio : $" + producto.getPriceProducts(i));
                i+=1;
            }
        }
    }
    public void sellProducts(String name, int cant, double price){
        ArrayList<String> nameProducts = producto.getNameProducts();
        ArrayList<Integer> cantProducts=producto.getCantProducts();
        ArrayList<Double> priceProducts=producto.getPriceProducts();

        if (nameProducts.contains(name)){
            int index = 0;
            for (int i = 0; i < nameProducts.size(); i++){
                if (name.equals(nameProducts.get(i))){
                    index = i;
                }
            }
            double valorTotal = priceProducts.get(index) * cant;
            if (cantProducts.get(index) >= cant && valorTotal <= price){
                int cantComprada = cantProducts.get(index)-cant;
                cantProducts.set(index, cantComprada);
                if (cantProducts.get(index) == 0){
                    System.out.println("El Producto "+nameProducts.get(index)+", se termino el stock. Necesita ser reabastecido");
                    nameProducts.remove(index);
                    cantProducts.remove(index);
                    priceProducts.remove(index);
                }else{
                    System.out.println("El Producto "+nameProducts.get(index)+", queda un total de "+cantProducts.get(index));

                }
                producto.setList(nameProducts, priceProducts, cantProducts);
                System.out.println("Compra Exitosa, vuelva pronto.");

            }else if (cantProducts.get(index) < cant){
                System.out.println("La cantidad solicitada excede la cantidad disponible de "+nameProducts.get(index));
            }else{
                System.out.println("El dinero pagado es insuficiente");
            }

        }else{
            System.out.println("Producto no encontrado");
        }
    }
}
