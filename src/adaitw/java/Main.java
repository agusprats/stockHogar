package adaitw.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Almacen> productos = new ArrayList<>();
        List<Limpieza> articulos = new ArrayList<>();

        productos.add(new Almacen("Aceite Girasol", 2, 06, 21));
        productos.add(new Almacen("Aceite Oliva", 2, 9, 23));
        productos.add(new Almacen("Aceto", 2, 10, 22));
        productos.add(new Almacen("Vinagre Manzana", 1, 7, 21));
        productos.add(new Almacen("Harina 000", 3, 8, 21));
        productos.add(new Almacen("Harina Purezza Pizza", 2, 9, 21));
        productos.add(new Almacen("Harina Leudante", 2, 10, 21));
        productos.add(new Almacen("Salsa Tomate x sobre", 5, 10, 23));
        productos.add(new Almacen("Mayonesa", 3, 10, 23));
        productos.add(new Almacen("Savora", 1, 10, 23));
        productos.add(new Almacen("Ketchup", 2, 10, 23));
        productos.add(new Almacen("Salsa Golf", 1, 10, 24));
        productos.add(new Almacen("Latas Atun", 3, 10, 24));
        productos.add(new Almacen("Latas Choclo Grano", 6, 10, 24));
        productos.add(new Almacen("Latas Choclo Cremoso", 6, 10, 24));
        productos.add(new Almacen("Latas Arvejas", 3, 10, 24));
        productos.add(new Almacen("Latas Paté", 3, 10, 24));
        productos.add(new Almacen("Latas Palmito", 3, 10, 24));
        productos.add(new Almacen("Latas Durazno Natural", 3, 10, 24));
        productos.add(new Almacen("Puré de Papas", 6, 10, 24));
        productos.add(new Almacen("Leche en Polvo", 5, 10, 24));
        productos.add(new Almacen("Café Instantáneo", 3, 10, 24));
        productos.add(new Almacen("Café Máquina", 2, 10, 24));
        productos.add(new Almacen("Capuchino Polvo", 2, 10, 24));
        productos.add(new Almacen("Polenta x Kg", 4, 7, 24));
        productos.add(new Almacen("Lentejas x Kg", 4, 10, 24));
        productos.add(new Almacen("Porotos Negros x Kg", 4, 10, 24));
        productos.add(new Almacen("Trigo Burgol", 4, 6, 24));
        productos.add(new Almacen("Fideos largos", 4, 10, 24));
        productos.add(new Almacen("Fideos tirabuzón", 4, 5, 24));
        productos.add(new Almacen("Arroz Gallo Amarillo", 2, 4, 24));
        productos.add(new Almacen("Arroz Gallo Rojo", 2, 3, 24));
        productos.add(new Almacen("Bolsa Alimento 20kg mascota", 2, 7, 24));
        productos.add(new Almacen("Yerba x Kg", 4, 1, 24));
        productos.add(new Almacen("Sal", 4, 9, 24));
        productos.add(new Almacen("Azucar", 4, 8, 24));
        productos.add(new Almacen("Edulcorante", 0, 0, 0));
        productos.add(new Almacen("Sobres 10 gr levadura", 4, 11, 24));

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
