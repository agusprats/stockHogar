package adaitw.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Almacen> productos = new ArrayList<>();
        List<Limpieza> articulos = new ArrayList<>();

        productos.add(new Almacen("Aceite Girasol 1 1/2 LT", 1, 12, 22));
        productos.add(new Almacen("Aceite Girasol 900 ML", 2, 11, 22));
        productos.add(new Almacen("Aceite Oliva 500 ML", 3, 7, 22));
        productos.add(new Almacen("Aceto Glaze 250 ML", 1, 8, 24));
        productos.add(new Almacen("Aceto Ahumado 400 ML", 1, 12, 23));
        productos.add(new Almacen("Vinagre Manzana", 1, 7, 21));
        productos.add(new Almacen("Dulce de leche 500 GR", 1, 7, 21));
        productos.add(new Almacen("Harina 000", 6, 6, 21));
        productos.add(new Almacen("Harina Purezza Pizza", 2, 6, 21));
        productos.add(new Almacen("Harina Leudante", 2, 6, 21));
        productos.add(new Almacen("Harina Integral", 1, 6, 21));
        productos.add(new Almacen("Salsa Tomate x sobre", 9, 11, 21));
        productos.add(new Almacen("Pure Tomate 500Gr", 2, 8, 21));
        productos.add(new Almacen("Mayonesa", 2, 4, 21));
        productos.add(new Almacen("Savora", 2, 7, 21));
        productos.add(new Almacen("Ketchup", 0, 0, 0));
        productos.add(new Almacen("Salsa Golf", 1, 10, 24));
        productos.add(new Almacen("Latas Atun chicas", 9, 5, 23));
        productos.add(new Almacen("Latas Atun Gde", 2, 6, 24));
        productos.add(new Almacen("Latas Choclo Grano", 2, 8, 23));
        productos.add(new Almacen("Latas Choclo Cremoso", 8, 10, 23));
        productos.add(new Almacen("Latas Arvejas", 2, 12, 23));
        productos.add(new Almacen("Latas Paté", 11, 7, 23));
        productos.add(new Almacen("Latas Paté gourmet", 2, 11, 22));
        productos.add(new Almacen("Latas Palmito", 2, 1, 24));
        productos.add(new Almacen("Latas Durazno Natural", 2, 1, 22));
        productos.add(new Almacen("Latas Peras Natural", 2, 3, 22));
        productos.add(new Almacen("Puré de Papas", 6, 10, 21));
        productos.add(new Almacen("Leche en Polvo 400 GR", 4, 2, 22));
        productos.add(new Almacen("Café Instantáneo Gde", 1, 9, 22));
        productos.add(new Almacen("Café Instantáneo Chico", 1, 8, 21));
        productos.add(new Almacen("Café Máquina", 2, 4, 21));
        productos.add(new Almacen("Capuchino Polvo", 2, 8, 21));
        productos.add(new Almacen("Polenta x Kg", 3, 9, 21));
        productos.add(new Almacen("Lentejas x Kg", 2, 12, 21));
        productos.add(new Almacen("Porotos Negros x Kg", 2, 3, 22));
        productos.add(new Almacen("Trigo Burgol x Kg", 1, 6, 22));
        productos.add(new Almacen("Fideos largos", 5, 9, 22));
        productos.add(new Almacen("Fideos tirabuzón", 3, 9, 22));
        productos.add(new Almacen("Fideos guiso", 2, 8, 22));
        productos.add(new Almacen("Arroz Gallo Amarillo", 2, 9, 21));
        productos.add(new Almacen("Arroz Gallo Rojo", 1, 12, 21));
        productos.add(new Almacen("Arroz Gallo largo", 2, 7, 21));
        productos.add(new Almacen("Bolsa Alimento 20kg mascota", 2, 7, 24));
        productos.add(new Almacen("Yerba x Kg", 4, 10, 22));
        productos.add(new Almacen("Yerba x 1/2 Kg", 3, 11, 22));
        productos.add(new Almacen("Sal", 1, 12, 21));
        productos.add(new Almacen("Fainá", 2, 7, 21));
        productos.add(new Almacen("Chocolate", 2, 11, 21));
        productos.add(new Almacen("Azucar", 2, 8, 22));
        productos.add(new Almacen("Edulcorante", 0, 0, 0));
        productos.add(new Almacen("Sobres 10 gr levadura", 10, 11, 24));
        productos.add(new Almacen("Leche condensada", 3, 6, 21));
        productos.add(new Almacen("Te sabores", 3, 6, 22));
        productos.add(new Almacen("Te boldo", 2, 6, 22));

        articulos.add(new Limpieza("Detergente", 2));
        articulos.add(new Limpieza("Jabon Liquido Ropa", 2));
        articulos.add(new Limpieza("Suavizante", 3));
        articulos.add(new Limpieza("Lavandina", 2));
        articulos.add(new Limpieza("Cif", 1));

        //Para cada producto del array ejecutar:
        productos.forEach((producto)->{
            System.out.println(producto);
        });

        articulos.forEach((articulo)->{
            System.out.println(articulo);
        });


        }
    }
  /*
        System.out.println("Stock Almacen Total: " + productos.size());
        for (int cont = 0; cont < productos.size(); cont++) {
            System.out.println(productos.get(cont).getNombre());
        }

        System.out.println(productos);
        for(int cont = 0; cont < productos.size(); cont++){
            System.out.println(productos.get(cont).stockTotal());
        }

        productos.forEach((producto)->{
            System.out.println(producto.getUnidades()+" "+producto.getNombre()+" "+producto.getVencimientoMes());
        });

        for(int i=0; i<productos.size();i++){
            Almacen producto = productos.get(i);
            System.out.println(producto.getNombre()+" - "+producto.getUnidades());
        }
    */
