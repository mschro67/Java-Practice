//by mschro67

package Own;

import javax.swing.*;
import java.util.Arrays;

public class coordinate_system{
    public static String find(String[][] system, int x,int y){
        String value=String.valueOf(system[x][y]);
        return value;
    }
    public static void display(String[][] system){
        for (int x=system.length-1;x>=0;x--){
            System.out.println(Arrays.toString(system[x]));
        }
        System.out.println();
    }
    public static String[][] def(int x,int y){
        String[][] system=new String[x][y];
        for (int a=0;a<system.length;a++){
            for (int b=0;b<system[a].length;b++){
                system[a][b]=".";
            }
        }
        return system;
    }
    public static String[][] point(String[][] system,int x,int y,String character){
        system[y][x]=String.valueOf(character);
        return system;
    }
    public static String[][] line(String[][] system,int m,int b,String character){
        for (int x=0;x<system.length;x++){
            try{
                system[m*x+b][x]=String.valueOf(character);
            }catch (Exception e){
                int z;
            }
        }
        return system;
    }
    public static void main(String[] args){
        String[][] system=line(def(11,11),2,0,"/");
        display(system);
    }
}
