import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTastiera {
    private BufferedReader keyboard;

    public InputTastiera(){
        keyboard = new BufferedReader(new InputStreamReader(System.in));
    }

    public String readStr(){
        String s = null;
        try{
            s = keyboard.readLine();
        }catch (IOException e){
            System.out.println("error: invalid input string");
        }
        return s;
    }
    public int readInt(){
        int n = -1;
        try {
            n = Integer.parseInt(keyboard.readLine());
        }catch (IOException e){
            System.out.println("error: invalid integer input");
        }catch (NumberFormatException e){
            System.out.println("error: invalid integer input");
        }
        return n;
    }

    public float readFloat(String msg){
        boolean ok = false;
        float n = -1.0f;
        do{
            System.out.println(msg);
            try {
                n = Float.parseFloat(keyboard.readLine());
                ok = true;
            }catch (IOException e){
                System.out.println("error: invalid float input");
            }catch (NumberFormatException e){
                System.out.println("error: invalid float input");
            }
        }while(!ok);

        return n;
    }

    public double readDouble(String msg){
        double n = -1.0;
        boolean ok = false;
        do{
            System.out.println(msg);
            try {
                n = Double.parseDouble(keyboard.readLine());
                ok = true;
            }catch (IOException e){
                System.out.println("error: invalid double input");
            }catch (NumberFormatException e){
                System.out.println("error: invalid double input");
            }
        }while(!ok);

        return n;
    }


}
