/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulSelectionSort;

/**
 *
 * @author ASUS RYZEN
 */
public class SelectionSort {
    static void SelectionSort(String[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i].compareTo(array[j])>0){
                    String temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        System.out.println("After sort : ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
            System.out.println("Selesai");
        }
    }
}
