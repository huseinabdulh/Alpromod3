/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulBubleSort;

/**
 *
 * @author ASUS RYZEN
 */
public class BubleSort {

    static void BubleSorting(String[] array) {
        System.out.println("Sorted string...");
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i].compareTo(array[j])>0){
                    //dibandingkan
                    String temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
            System.out.println(array[i]+"");
        }
    }
}
