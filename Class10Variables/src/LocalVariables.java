import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LocalVariables {
    public static  void main(String[] args){
//        int i=0;
//        int ans;
//        for(int j=0; j<3; j++){
//            ans = i+j;
//        }
//        System.out.println(i+" "+j);// not declared in the scope

        int x;
        //System.out.println(x);// variable are not initalize
        System.out.println("hELLO");

        if(args.length>0){
            x =10;
        }
       // System.out.println(x);// variable x migt not have been inatilized
        // not compiled
        else{
            x = 20;
        }
        System.out.println(x); // compile the code
        // output is 20

    }
}
