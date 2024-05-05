public class App {

    //Insertion Sort en metodo
    public static void insertionSort(int[]array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int key = array[i];//seleccionamos el elemento a insertar en su posicion correcta
            int j = i - 1;
            //Movemos los elementos mayores que key a una posicion adelante de su posicion
            //actual
            while (j>=0 && array[j]>key) {
                array[j+1]= array[j];
                j--;
            }
            array[j+1] = key;//Insertamos key en su posicion correcta
        }
    }
    public static void main(String[] args) throws Exception {
        
        int[] array = {12,11,13,5,6};
        
        System.out.println("Arreglo original:");
        for (int num : array) {
            System.out.println(num+" ");
        }

        System.out.println();

        System.out.println("================================");
        insertionSort(array);//llamada al metodo de ordenamiento por insercion

        System.out.println("Arreglo ordenado");
        for (int num : array) {
            System.out.println(num+" ");
            
        }
    }
}
