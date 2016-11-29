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
public abstract class Donor {
    private String money;
    private int leftScore;
    private int rightScore;
    private int estabScore;
    private boolean partyLeadershipSupport;
    private String type;
    private String name;
    
    public String getMoney(){
        return money;
    }
    public int getRightScore(){
        return rightScore;
    }
    public int getLeftScore(){
        return leftScore;
    }
    public int getEstabScore(){
        return estabScore;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public boolean getPartySupport(){
        return partyLeadershipSupport;
    }
}
