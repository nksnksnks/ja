import java.util.*;
import java.lang.*;
import java.net.IDN;
class NV{
    String nameP;
    String nameNV;
    String IDNV;
    long luongCB;
    long ngayCong;
    long heSo;
    long luong;
    void input(Scanner sc){
        sc.nextLine();
        IDNV = sc.nextLine();
        nameNV = sc.nextLine();
        luongCB = sc.nextLong();
        ngayCong = sc.nextLong();
        heSo = setHeSo();
        luong = heSo*luongCB*ngayCong*1000;
    }
    long setHeSo(){
        if(IDNV.substring(0,1).compareTo("A") == 0){
            if(Integer.parseInt(IDNV.substring(1,3)) >=1 && Integer.parseInt(IDNV.substring(1,3)) <= 3){
                return 10;
            }
            else if(Integer.parseInt(IDNV.substring(1,3)) >=4 && Integer.parseInt(IDNV.substring(1,3)) <= 8){
                return 12;
            }
            else if(Integer.parseInt(IDNV.substring(1,3)) >=9 && Integer.parseInt(IDNV.substring(1,3)) <= 15){
                return 14;
            }
            else return 20;
        }
        else if(IDNV.substring(0,1).compareTo("B") == 0){
            if(Integer.parseInt(IDNV.substring(1,3)) >=1 && Integer.parseInt(IDNV.substring(1,3)) <= 3){
                return 10;
            }
            else if(Integer.parseInt(IDNV.substring(1,3)) >=4 && Integer.parseInt(IDNV.substring(1,3)) <= 8){
                return 11;
            }
            else if(Integer.parseInt(IDNV.substring(1,3)) >=9 && Integer.parseInt(IDNV.substring(1,3)) <= 15){
                return 13;
            }
            else return 16;
        }
        else if(IDNV.substring(0,1).compareTo("C") == 0){
            if(Integer.parseInt(IDNV.substring(1,3)) >=1 && Integer.parseInt(IDNV.substring(1,3)) <= 3){
                return 9;
            }
            else if(Integer.parseInt(IDNV.substring(1,3)) >=4 && Integer.parseInt(IDNV.substring(1,3)) <= 8){
                return 10;
            }
            else if(Integer.parseInt(IDNV.substring(1,3)) >=9 && Integer.parseInt(IDNV.substring(1,3)) <= 15){
                return 12;
            }
            else return 14;
        }
        else{
            if(Integer.parseInt(IDNV.substring(1,3)) >=1 && Integer.parseInt(IDNV.substring(1,3)) <= 3){
                return 8;
            }
            else if(Integer.parseInt(IDNV.substring(1,3)) >=4 && Integer.parseInt(IDNV.substring(1,3)) <= 8){
                return 9;
            }
            else if(Integer.parseInt(IDNV.substring(1,3)) >=9 && Integer.parseInt(IDNV.substring(1,3)) <= 15){
                return 11;
            }
            else return 13;
        }
    }
    void output(){
        System.out.format("%s %s %d%n", IDNV, nameNV, luong);
    }
}
public class tinhluong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String[] xi = new String[x];
        sc.nextLine();
        for(int i=0; i<x; i++){
            xi[i] = sc.nextLine();
        }
        int n = sc.nextInt();
        NV[] nv = new NV[n];
        for(int i=0; i<n; i++){
            nv[i] = new NV();
            nv[i].input(sc);
            for(int j=0; j<x; j++){
                if(nv[i].IDNV.substring(3,5).equals(xi[j].substring(0, 2))){
                    nv[i].nameP = xi[j].substring(3, xi[j].length());
                    break;
                }
            }
        }
        String test = sc.next();
        for(int i=0; i<x; i++){
            if(test.equals(xi[i].substring(0, 2)) == true){
                System.out.format("Bang luong phong %s:%n", xi[i].substring(3, xi[i].length()));
                break;
            }
        }
            for(int i=0; i<n; i++){
                if(test.equals(nv[i].IDNV.substring(3,5)) == true)
                    nv[i].output();
        }
    }
}