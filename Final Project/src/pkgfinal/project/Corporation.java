/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project;

import java.util.ArrayList;

/**
 *
 * @author raghuramselvaraj
 */
public class Corporation extends Donor{
    private String money;
    private int leftScore;
    private int rightScore;
    private int estabScore;
    private boolean partyLeadershipSupport;
    private String type;
    private String name;
    
    private ArrayList<String> names=new ArrayList<String>();
        boolean temp=names.add("Citigroup");
        boolean temp1=names.add("Pfizer");
        boolean temp3=names.add("Soros Fund Management");
        boolean temp4=names.add("Marlboro");
    
    public Corporation(Candidate user){
        money="a lot";
        partyLeadershipSupport=true;
        type="Corporation";
        int randNum=(int)Math.random()*names.size();
        name=names.get(randNum);
        names.remove(randNum);
        
        if(name.equals("Citigroup")){
            leftScore+=-5;
            rightScore+=-5;
            estabScore+=30;
        }
        else if(name.equals("Pfizer")){
            leftScore+=-10;
            rightScore+=5;
            estabScore+=15;
        }
        else if(name.equals("Soros Fund Management")){
            leftScore+=20;
            rightScore+=-10;
            estabScore+=10;
        }
        else if(name.equals("Marlboro")){
            leftScore-=10;
            estabScore+=50;
        }
        user.getScore().addEstabScore(estabScore);
        user.getScore().addLeftScore(leftScore);
        user.getScore().addRightScore(rightScore);
    }
    
    @Override
    public String toString(){
        return name + "\n" + type + "\n" + "Has " + money + " of money\n" + "Has decent influence over support\n" + "Has support from party leaders";
    }
}
