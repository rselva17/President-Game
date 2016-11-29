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
public class GeneralElection extends Election {
    private boolean userWin;
    private String margin;
    Candidate user;
    Candidate opp;
    
    public GeneralElection(Candidate user, Candidate opp){
        super(user, opp);
    }
}
