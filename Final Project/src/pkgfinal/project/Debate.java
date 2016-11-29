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
public class Debate {
    private int leftScore;
    private int rightScore;
    private int estabScore;
    
    public Debate(boolean x,boolean y,boolean z){
       if(x==true){
           leftScore+=15;
           rightScore-=10;
           estabScore-=5;
       }
       else if(x==false){
           leftScore-=5;
           rightScore+=5;
           estabScore+=5;
       }
       if(y==true){
           leftScore-=10;
           rightScore+=15;
           estabScore-=5;
       }
       else if(y==false){
           leftScore+=5;
           rightScore-=5;
           estabScore+=5;
       }
       if(z==true){
           leftScore-=15;
           rightScore-=15;
           estabScore+=25;
       }
       else if(z==false){
           leftScore+=0;
           rightScore+=0;
           estabScore-=15;
       }
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
