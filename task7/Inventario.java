package session_2.task7;

public class Inventario {
    private Producto product;

    public void addProduct(Producto product) {
        this.product = product;
        System.out.println(product.getName() + " añadido al inventario.");
    }

    public void listSellingPrices() {
        if (product != null) {
            System.out.println("Precios de venta:");
            System.out.println(product.getName() + ": $" + product.getSellingPrice());
        } else {
            System.out.println("No hay productos en el inventario.");
        }
    }

    public void sellProduct(int quantitySold) {
        if (product != null) {
            product.sell(quantitySold);
            if (product.getQuantity() == 0) {
                System.out.println(product.getName() + " removido del inventario.");
                product = null;
            }
        } else {
            System.out.println("No hay productos en el inventario.");
        }
    }
}
