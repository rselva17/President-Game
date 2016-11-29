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
public class Score{

    private int leftScore;
    private int rightScore;
    private int estabScore;
    
    public Score(){
        
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
    
    public void addLeftScore(int x){
        leftScore = leftScore + x;
    }
    public void addRightScore(int x){
        rightScore = rightScore + x;
    }
    public void addEstabScore(int x){
        estabScore+=x;
    }
    
    public void subLeftScore(int x){
        leftScore = leftScore - x;
    }
    public void subRightScore(int x){
        rightScore = rightScore - x;
    }
    public void subEstabScore(int x){
        estabScore-=x;
    }
}