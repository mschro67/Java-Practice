//by mschro67

import java.util.Arrays;

public class CoordSyst{
    String content;
    public static String find(int x,int y){
	return String.valueOf(this.content[x][y]);
    }
    public static void display(){
	for (int x=system.length-1;x>=0;x--){
	    if (x<10){
		System.out.println(x+"  "+Arrays.toString(this.content[x]);
	    }else{
		System.out.println(x+" "+Arrays.toString(this.content[x]);
	    }
	}
	System.out.print(" ");
	for (int x=0;x<system.length;x++){
	    System.out.print("  "+x);
	}
	System.out.println("");
    }

    public static CoordSyst(int x,int y,String character){
	String system=new String[x+1][y+1];
	for (int a=0;a<this.content.length;a++){
	    for (int b=0;b<this.content[a].length;b++){
		this.content[a][b]=String.valueOf(character);
	}
	return system;
    }
    
    public static point(int x,int y,String character){
	this.content[x][y]=String.valueOf(character);
    }
    public static line(int m,int b,String character){
	for (int x=0;x<this.content.length;x++){
	    try{
		this.content[m*x+b][x]=String.valueOf(character);
	    }catch{
		int z;
	    }
	}
    }
}
