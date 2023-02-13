package fourier;

public class Fourier {

    public static void main(String[] args) {
        double u [] = {12,15,20,11,24,10,14,17,20,21};
        double x [] = {0,1,2,3,4,5,6,7,8,9};
        double F [] = {0,0,0,0,0,0,0,0,0,0};
        double Fu [] = {0,0,0,0,0,0,0,0,0,0};
        double Fi [] = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<u.length;i++){
            double fr=0;
            double fi=0;
            double fa=0;
            for(int j=0;j<x.length;j++){
                fr=fr+u[j]*Math.cos(2*Math.PI*i*x[j]/x.length);
                fi=fi+u[j]*Math.sin(2*Math.PI*i*x[j]/x.length);
                fa=Math.pow(Math.pow(fr, 2)+Math.pow(fi, 2), 0.5);
                
            }
            System.out.println("fa["+i+"] = "+fa/u.length);
        }
    }
    
}
