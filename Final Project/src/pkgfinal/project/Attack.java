/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project;

/**
 *
 * @author raghuramselvaraj
 */
public class Attack {
    private boolean aboutPolicy;
    private int leftScore;
    private int rightScore;
    private int estabScore;
    
    public Attack(boolean x,boolean y){
       if(x==true){
           aboutPolicy=true;
           leftScore+=5;
           rightScore+=5;
           estabScore-=10;
       }
       else if(x==false){
           aboutPolicy=false;
           leftScore-=5;
           rightScore-=5;
           estabScore+=10;
       }
       if(y==true){
           leftScore+=5;
           rightScore-=5;
           estabScore+=0;
       }
       else if(y==false){
           leftScore-=5;
           rightScore+=5;
           estabScore+=0;
       }
    }
    public boolean getAboutPolicy(){
        return aboutPolicy;
    }
    public int getLeftScore(){
        return leftScore;
    }
    public int getRightScore(){
        return rightScore;
    }
    public int getEstabScore(){
        return estabScore;
    }
}
