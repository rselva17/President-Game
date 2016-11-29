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
public class AdvocacyGroup extends Donor{
    private String money;
    private int leftScore;
    private int rightScore;
    private int estabScore;
    private boolean partyLeadershipSupport;
    private String type;
    private String name;
    
    
    private ArrayList<String> names=new ArrayList<String>();
        boolean temp=names.add("Planned Parenthood");
        boolean temp1=names.add("Greenpeace");
        boolean temp2=names.add("The Progressive Change Campaign Committee");
        boolean temp3=names.add("Amnesty International");
        boolean temp4=names.add("The NAACP");
        boolean temp5=names.add("The American Family Association");
        boolean temp6=names.add("The National Rifle Association");
    
    public AdvocacyGroup(){
        money="decent";
        partyLeadershipSupport=false;
        type="Advocacy Group";
        
        int randNum=(int)Math.random()*names.size();
        name=names.get(randNum);
        names.remove(randNum);
        
        if(name.equals("Planned Parenthood")){
            leftScore+=20;
            rightScore+=-20;
            estabScore+=0;
        }
        else if(name.equals("Greenpeace")){
            leftScore+=15;
            rightScore+=-5;
            estabScore+=-25;
        }
        else if(name.equals("The Progressive Change Campaign Committee")){
            leftScore+=10;
            rightScore+=-20;
            estabScore+=-30;
        }
        else if(name.equals("Amnesty International")){
            leftScore+=5;
            rightScore+=5;
            estabScore+=0;
        }
        else if(name.equals("The NAACP")){
            leftScore+=15;
            rightScore+=-5;
            estabScore+=0;
        }
        else if(name.equals("The American Family Association")){
            leftScore+=-20;
            rightScore+=25;
            estabScore+=0;
        }
        else if(name.equals("The National Rifle Association")){
            leftScore+=-10;
            rightScore+=15;
            estabScore+=0;
        }
    }
    
    @Override
    public String toString(){
        return name + "\n" + type + "\n" + "Has " + money + " amount of money\n" + "Has decent influence over support\n" + "Has support from party leaders";
    }
}
