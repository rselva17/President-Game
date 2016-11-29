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
public class Union extends Donor{
    private String money;
    private int leftScore;
    private int rightScore;
    private int estabScore;
    private boolean partyLeadershipSupport;
    private String type;
    private String name;
    
    private ArrayList<String> names=new ArrayList<String>();
        boolean temp=names.add("American Federation of Labor");
        boolean temp1=names.add("American Federation of Teachers");
        boolean temp2=names.add("American Truckers' Union");
    
    public Union(){
        money="little";
        int randNum=(int)Math.random()*names.size();
        name=names.get(randNum);
        names.remove(randNum);
        if(name.equals("American Truckers' Union")){
            leftScore+=0;
            rightScore+=20;
            estabScore+=0;
        }
        else if(name.equals("American Federation of Teachers")){
            leftScore+=20;
            rightScore+=10;
            estabScore+=0;
        }
        else if(name.equals("American Federation of Labor")){
            leftScore+=20;
            rightScore+=20;
            estabScore-=10;
        }
        partyLeadershipSupport=false;
        type="Union";
    }
    
    @Override
    public String toString(){
        return name + "\n" + type + "\n" + "Has " + money + " money\n" + "Has a lot of support influence\n" + "Does not have support of party leaders";
    }
}
