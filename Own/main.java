package Own;

import java.util.Scanner;

public class main{
    public static void main(String[] args){
        CoordinateSystem coords=new CoordinateSystem(0,0,"UNDEFINED");
        Scanner s=new Scanner(System.in);
        boolean keepGoing=true;

        while (keepGoing==true){
            try {
                System.out.print("> ");
                String input = s.nextLine();
                input = input.toLowerCase();
                switch (input) {
                    case "help":
                        System.out.println("\"help\" - explains all commands\n\"init\" - initializes coordinate system with entered size\n\"point\" - creates point on given coodinates\n\"line\" - creates line with given aruments\n\"display\" - displays coordinate system\n\"exit\" - exits eventloop and ends programm");
                        break;
                    case "exit":
                        keepGoing=false;
                        break;
                    case "init":
                        System.out.print("- width: ");
                        int w = Integer.parseInt(s.nextLine());
                        System.out.print("- heigth: ");
                        int h = Integer.parseInt(s.nextLine());
                        coords = new CoordinateSystem(w, h, ".");
                        break;
                    case "point":
                        System.out.print("- x: ");
                        int x = Integer.parseInt(s.nextLine());
                        System.out.print("- y: ");
                        int y = Integer.parseInt(s.nextLine());
                        coords.point(x,y,"X");
                        break;
                    case "line":
                        System.out.print("- m: ");
                        int m = Integer.parseInt(s.nextLine());
                        System.out.print("- b: ");
                        int b = Integer.parseInt(s.nextLine());
                        System.out.print("- symbol: ");
                        char c = s.nextLine().charAt(0);
                        coords.line(m,b,String.valueOf(c));
                        break;
                    case "display":
                        coords.display();
                        break;
                    default:
                        System.out.println("Error: Command \"" + input + "\" not found\ntype \"help\" to get help");
                }
            }catch (Exception e){
                System.out.println("Error: "+e);
            }
        }

        System.out.println("Bye!");
        coords.display();
    }
}