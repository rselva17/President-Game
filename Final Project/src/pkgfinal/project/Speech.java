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
public class Speech {
    private int leftScore;
    private int rightScore;
    private int estabScore;
    
    public Speech(boolean x, boolean y, boolean z){
        if(x==true){
            leftScore+=10;
            rightScore-=5;
        }
        else if(x==false){
            leftScore-=5;
        }
        
        if(y==true){
            leftScore-=5;
            rightScore+=10;       
        }
        else if(y==false){
            rightScore-=5;
        }
        
        if(z==true){
            leftScore-=5;
            rightScore-=5;
            estabScore+=20;
        }
        if(z==false){
            estabScore-=10;
        }
    }
    public Speech(boolean x, boolean y){
        if(x==true){
            leftScore+=10;
            rightScore+=10;
            estabScore-=5;
        }
        else if(x==false){
            leftScore-=5;
            rightScore-=5;
            estabScore+=25;
        }
        if(y==true){
            leftScore+=5;
            rightScore+=5;
            estabScore+=0;
        }
    }
    public Speech(boolean x){
        if(x==true){
            leftScore+=15;
            rightScore-=15;
            estabScore+=0;
        }
        else if(x=false){
            leftScore-=20;
            rightScore+=15;
            estabScore+=0;
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
