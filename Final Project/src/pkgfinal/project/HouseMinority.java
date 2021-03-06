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
public class HouseMinority extends GovLeader{
    private int leftScore;
    private int rightScore;
    private int estabScore;
    private boolean corporateInfluence;
    private boolean hasSupport;
    private String name;
    private String poliParty;
    
    public HouseMinority(){
        poliParty="Democrat";
        corporateInfluence=true;
        hasSupport=false;
        name="Nancy Pelosi";
        leftScore+=10;
        rightScore+=-35;
        estabScore+=5;
    }
    
    @Override
    public String toString(){
        return name +"/n"+poliParty+"/nInfluenced by corporations";
    }
}
