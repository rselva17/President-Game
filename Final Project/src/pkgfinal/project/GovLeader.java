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
public abstract class GovLeader {
    private int leftScore;
    private int rightScore;
    private int estabScore;
    private boolean corporateInfluence;
    private boolean hasSupport;
    private String name;
    private String poliParty;
    
    public String getName(){
        return name;
    }
    public boolean getHasSupport(){
        return hasSupport;
    }
    public void setHasSupport(boolean hasSupport){
        this.hasSupport=hasSupport;
    }
    public boolean getCorporateInfluence(){
        return corporateInfluence;
    }
    public String getPoliParty(){
        return poliParty;
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
