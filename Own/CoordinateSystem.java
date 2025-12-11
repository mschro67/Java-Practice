package Own;

import java.util.Arrays;

public class CoordinateSystem{
    String[][] content;

    public CoordinateSystem(int x,int y,String c){
        content=new String[y+1][x+1];
        for (int a=0;a<this.content.length;a++){
            for (int b=0;b<this.content.length;b++){
                content[a][b]=String.valueOf(c);
            }
        }
    }

    public void display(){
        for (int x=this.content.length-1;x>=0;x--){
            if (x<10){
                System.out.println(x + "  " + Arrays.toString(this.content[x]));
            }else{
                System.out.println(x + " " + Arrays.toString(this.content[x]));
            }
        }
        System.out.print(" ");
        for (int x=0;x<this.content.length;x++){
            System.out.print("  "+x);
        }
        System.out.println();
    }

    public void point(int x,int y,String c){
        this.content[y][x]=String.valueOf(c);
    }

    public void line(int m,int b,String c){
        for (int x=0;x<this.content[0].length;x++){
            try {
                this.content[m*x+b][x]=String.valueOf(c);
            }catch (Exception e){
                continue;
            }
        }
    }
}
