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
public class WhiteHouse extends GovLeader{
    private int leftScore;
    private int rightScore;
    private int estabScore;
    private boolean corporateInfluence;
    private boolean hasSupport;
    private String name;
    private String poliParty;
    
    public WhiteHouse(){
        poliParty="Democrat";
        corporateInfluence=true;
        hasSupport=false;
        name="Barack Obama";
        leftScore+=35;
        rightScore+=-30;
        estabScore+=20;
    }
    
    @Override
    public String toString(){
        return name +"/n"+poliParty+"/nInfluenced by corporations";
    }
}
