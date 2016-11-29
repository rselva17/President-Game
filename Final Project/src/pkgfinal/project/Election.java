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
public abstract class Election {
    private boolean userWin;
    private String margin;
    Candidate user;
    Candidate opp;
    
    public Election(Candidate user, Candidate opp){
        this.user=user;
        this.opp=opp;
        if(user.getPoliParty().equals("Democrat")){
            if(user.getScore().getLeftScore()>opp.getScore().getLeftScore()&&user.getScore().getEstabScore()>opp.getScore().getEstabScore() && user.getFunding()>opp.getFunding()){
                userWin=true;
                margin="Large";
                user.addPrimaryWins();
            }
            else if(user.getScore().getLeftScore()>opp.getScore().getLeftScore()&&user.getScore().getEstabScore()<opp.getScore().getEstabScore() && user.getFunding()<opp.getFunding()){
                userWin=false;
                margin="Small";
                opp.addPrimaryWins();
            }
            else if(user.getScore().getLeftScore()<opp.getScore().getLeftScore()&&user.getScore().getEstabScore()>opp.getScore().getEstabScore() && user.getFunding()>opp.getFunding()){
                userWin=true;
                margin="Small";
                user.addPrimaryWins();
            }
            else if(user.getScore().getLeftScore()<opp.getScore().getLeftScore()&&user.getScore().getEstabScore()<opp.getScore().getEstabScore() && user.getFunding()<opp.getFunding() || user.getScore().getLeftScore()<opp.getScore().getRightScore()){
                userWin=false;
                margin="Large";
                opp.addPrimaryWins();
            }
        }
        else if(user.getPoliParty().equals("Republican")){
            if(user.getScore().getRightScore()>opp.getScore().getRightScore() && user.getScore().getEstabScore()>opp.getScore().getEstabScore() && user.getFunding()>opp.getFunding()){
                userWin=true;
                margin="Large";
                user.addPrimaryWins();
            }
            else if(user.getScore().getRightScore()>opp.getScore().getRightScore()&&user.getScore().getEstabScore()<opp.getScore().getEstabScore() && user.getFunding()<opp.getFunding()){
                userWin=false;
                margin="Small";
                opp.addPrimaryWins();
            }
            else if(user.getScore().getRightScore()<opp.getScore().getRightScore()&&user.getScore().getEstabScore()>opp.getScore().getEstabScore() && user.getFunding()>opp.getFunding()){
                userWin=true;
                margin="Small";
                user.addPrimaryWins();
            }
            else if(user.getScore().getRightScore()<opp.getScore().getRightScore()&&user.getScore().getEstabScore()<opp.getScore().getEstabScore() && user.getFunding()<opp.getFunding() || user.getScore().getRightScore()<opp.getScore().getLeftScore()){
                userWin=false;
                margin="Large";
                opp.addPrimaryWins();
            }
        }
    }
    
    public boolean getUserWin(){
        return userWin;
    }
    public String getMargin(){
        return margin;
    }
    @Override
    public String toString(){
        if(userWin=true&&margin.equals("Large")){
            return (user.getName() + " won by a large margin");
        }
        else if(userWin=true&&margin.equals("Small")){
            return (user.getName()+" won by a small margin");
        }
        else if(userWin=false&&margin.equals("Small")){
            return (opp.getName()+" won by a small margin");
        }
        else if(userWin=false&&margin.equals("Large")){
            return (opp.getName()+" won by a large margin");
        }
        return null;
    }
}
