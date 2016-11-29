/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project;

import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author raghuramselvaraj
 */
public class ChiefStaff {
    private ArrayList<String> grades=new ArrayList<String>();
        boolean place=grades.add("B+");
        boolean place50=grades.add("D+");
        boolean place3=grades.add("C+");
        boolean place51=grades.add("A-");
        boolean place6=grades.add("F");
        boolean place52=grades.add("C-");
        boolean place9=grades.add("A+");
        boolean place53=grades.add("F-");
        boolean place12=grades.add("C");
        boolean place54=grades.add("D");
        boolean place16=grades.add("C-");

        
    private ArrayList<String> names=new ArrayList<String>();
        boolean place1=names.add("Tom Walton");
        boolean place2=names.add("Rosalita Brooks");
        boolean place4=names.add("Jack Mellon");
        boolean place5=names.add("William Jean");
        boolean place7=names.add("John McKenzie");
        boolean place8=names.add("Tod Cruise");
        boolean place10=names.add("Bret Halkyard");
        boolean place11=names.add("California Saladbar");
        boolean place13=names.add("Alexzander Mitrovic");
        boolean place14=names.add("Donald Trump");
        boolean place15=names.add("Prom Todhom");


 private ArrayList<String> bios=new ArrayList<String>(); //Incomplete (need Grof)
        boolean temp1=bios.add("Age 54, born in West Virginia \nFormer member of the US Army, rank: Major. \nSix years in NASA, first man on the Sun. \nConnections with higher ups in key agencies, lacks ability with corporations. \nGood man manager, very direct. Centrist.");
    	boolean temp2=bios.add("Age 66, born in New Jersey \nFormer National Security Council Chief of Staff \nresigned following a political scandal. In high school placed 3rd in national \ntrampoline competitions, advocate for free speech and \nexpression especially in music and art. Married to former director of the FBI,\nwho was not well liked. Disliked among agencies, most government officials \ndo not trust her but she is very knowledgeable of the system. Very liberal.");
	boolean temp4=bios.add("Age 47, born in Indiana \nFormer member of the U.S. Marine Corps, rank: Captain.\nGraduated from Harvard Law School, salutadictorian. \nStrange obsession with chili dogs, very passionate about the \n\"heartland\" and midwestern communities. Father of sixteen children, \ngreat multitasker and a people person. Target of three separate \nassassination attempts following his speech on the illegal \nharvesting of corn.");
	boolean temp5=bios.add("Age 50, born in Jackson, Mississippi \nServed as Special Assistant to the President in the previous administration, \nformer member of the Council of Foreign Relations, also worked as Deputy Secretary \nof State for Management and Resources. Refers to \nhimself as \"The One\", huge advocate for states rights. World's worst babysitter, \ncompletely colorblind. Well liked by everyone. Expects to run for President eventually, wants support for an eventual presidential bid.");
	boolean temp7=bios.add("Age 60, born in New York \nOnly previous jobs include rice farmer, secular composer, \nand grave digger. Very lonely :( Definition of a fence-sitter, \nchanges opinions and viewpoints on a whim. Considers himself a \n\"Catholic-Atheist\" and likes to be addressed as \"Father\". \nWell respected by most, yet everyone recognizes what a terrible \nperson he is. Advocate for anarchy. Potential cocaine addict.");
	boolean temp8=bios.add("Age 45, born in Canada \nFormer Solicitor General of Texas, graduate of Princeton \nUniversity and Harvard Law School. Also has held positions as \nthe Director of the Office of Policy Planning at the \nFederal Trade Commission, an Associate Deputy \nAttorney General at the United States Department of Justice,\nand domestic policy advisor in a previous presidential campaign. \nDisliked among his own party, a Republican without a home. \nProbably the Zodiac killer. Only supported in Iowa, nobody trusts him.");
	boolean temp10=bios.add("Age 17, born in New Jersey \nFormer member of JV tennis team, got a 1 on his practice \nAP Comp. Sci. Test. Walks with attitude, \nexcels in digital media, specifically memes and SnapChat filters. \nTotal scrub at League of Legends, strongly against \nworldwide implementation of touchscreens. Only person in the world \nto carry around an Ipad Mini, drives a large silky SUV. Famously known \nfor not knowing what he’s doing. Future CEO of New Balance. \nAchieved his political status via Reddit reposts and blackmailing the dogs of \nimportant government officials.");
	boolean temp11=bios.add("Age 77, born in Montana \nFormer head of the KGB, served twenty years in the Agricultural \nDepartment of Petroleum County. \nGraduate of Nevada State Penitentiary, owns a chain of Peruvian shoe stores. \nSpent 25 years in various Ivy Leagues, applying \nunder 48 different identities. Eventually graduated all of them as valedictorian. IQ of 217, the first known telepath. Wanted by ATF for a potentially illegal supply of 1500’s era Flintlock pistols. Identifies as a Federalist although often labeled as a \"fascist-diest with a Xanax addiction\"");
	boolean temp13=bios.add("Age 26, born in Malaysia \nSerbian descent, very little political experience. \nVery intelligent, considered a genius \namong his peers. Orchestrated the downfall of seventeen different \nthird world countries. Theoretical physicist. Moderate liberal, \nadvocate for the preservation of the world's oceans. Involved with \nNASA, CIA, and Microsoft.");
	boolean temp14=bios.add("You already know what it is.");
	boolean temp15=bios.add("Age 17, born in New Jersey \nAmerican descent, master of the snark. Despises computers, not very adaptable.");

    int randNum;
    private String grade;
    private String name;
    private String bio;
    
    public ChiefStaff(){
        randNum=(int)(Math.random()*11);
        name=names.get(randNum);
        names.remove(randNum);
        
        grade=grades.get(randNum);
        grades.remove(randNum);
        
        bio=bios.get(randNum);
        bios.remove(randNum);
    }
    public String getName(){
        return name;
    }
    public String getGrade(){
        return grade;
    }
    public String getBio(){
        return bio;
    }
    
    @Override
    public String toString(){
        return(name + "\n" + grade + "\n" + bio);
    }
}

