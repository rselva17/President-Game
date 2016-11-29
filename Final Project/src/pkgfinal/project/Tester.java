/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project;

import java.util.ArrayList;
import java.awt.*;
import java.io.IOException;
import java.net.*;

/**
 *
 * @author Raghuram Selvaraj
 * @date May 5, 2016
 * 
 */
import java.util.*;
public class Tester {
    public static void main(String[] args) throws IOException, URISyntaxException{
	Candidate user = new Candidate();
        System.out.println("Welcome to the Presidential Race! Please state your name:"); // input name
        Scanner scan = new Scanner(System.in);
	String name = scan.nextLine();
	System.out.println("Your name is "+ name + ", is this correct? (Yes/No)");
	String response = scan.nextLine();
	if (response.equals("Yes")||response.equals("yes")){
            System.out.println("Okay. Welcome to the infamous race " + name);
	}
	else{
            System.out.println("Welcome to the Presidential Race! Please state your name:"); // input name again
            name = scan.nextLine();
            System.out.println("Your name is "+ name + ", is this correct? (Yes/No)");
            response = scan.nextLine();
            if (response.equals("Yes")||response.equals("yes")){
	        System.out.println("Okay. Welcome to the infamous race " + name);
	    }
            else{
                System.out.println("Yes it is.");
            }
	}
	user.setName(name);
	// input age
	System.out.println("Now to confirm your eligibility, you must input your current age. Federal law states that you must be older than 35 years of age to run."); // input age
	int age = 0;
	age = scan.nextInt();
	if(age >= 35 && age < 120){
		 System.out.println("Good news, you're eligible to run!");
                 if(age>=35 && age<50){
                     user.getScore().addLeftScore(15);
                 }
                 else if(age>=50 && age<=65){
                     user.getScore().addLeftScore(5);
                     user.getScore().addRightScore(15);
                     user.getScore().addEstabScore(20);
                 }
                 else if(age>65 && age<120){
                     user.getScore().addLeftScore(2);
                     user.getScore().addRightScore(5);
                     user.getScore().addEstabScore(10);
                 }
	}
	else{
		if(age<35){
			System.out.println("Sorry, but unfortunately you are too young to enter.");
		}
		if(age>120){
			System.out.println("Congratulations, you are the oldest person in known human history. Unfortunately, however, you will likely die whilst waiting to be accepted into office, assuming that you are not already in a vegetative state or mentally/physically unfit to be outside or doing anything other than relaxing.\nTL;DR rip");
		}
		System.out.println("**GAME OVER**");
		System.exit(0);//Game Over: Invalid Age
	}
	user.setAge(age);
	// input gender
        System.out.println("Now for some personal information: Please input your gender(Male, Female, Other)");
	String gender = scan.nextLine();
	user.setGender(gender);
        switch (gender) {
            case "Male":
                user.getScore().addLeftScore(15);
                user.getScore().addRightScore(20);
                user.getScore().addEstabScore(45);
                break;
            case "Female":
                user.getScore().addLeftScore(10);
                user.getScore().subRightScore(5);
                user.getScore().subEstabScore(20);
                break;
            case "Other":
                user.getScore().addLeftScore(25);
                user.getScore().subRightScore(80);
                user.getScore().subEstabScore(150);
                break;
            default:
                break;
        }
	//Orientation
	System.out.println("Following the previous question, please select your sexual orientation(Heterosexual, Homosexual, Bisexual)");
	String orient = scan.nextLine();
	user.setSexOrient(orient);
        switch (orient) {
            case "Heterosexual":
                user.getScore().addLeftScore(15);
                user.getScore().addRightScore(20);
                user.getScore().addEstabScore(45);
                break;
            case "Bisexual":
                user.getScore().addLeftScore(20);
                user.getScore().subRightScore(50);
                user.getScore().subEstabScore(60);
                break;
            case "Homosexual":
                user.getScore().addLeftScore(20);
                user.getScore().subRightScore(40);
                user.getScore().subEstabScore(60);
                break;
            default:
                break;
        }
	// Race
	System.out.println("Please input your ethnicity from the list: \n1. White\n2. American Indian/Alaskan Native\n3. Asian/Indian Subcontinent\n4. Black/African America\n5. Native Hawaiian/Pacific Islander\n6. Hispanic/Latino");
	int choice = scan.nextInt();
	String race = "";
	switch(choice){
	 case 1: 
		race = "White";
		System.out.println("You have selected " + race);
                user.getScore().addLeftScore(15);
                user.getScore().addRightScore(30);
                user.getScore().addEstabScore(40);
		break;
	 case 2:
		race = "American Indian/Alaskan Native";
		System.out.println("You have selected " + race);
                user.getScore().addLeftScore(10);
                user.getScore().subRightScore(20);
                user.getScore().subEstabScore(45);
		break;
	 case 3:
		race = "Asian/Indian Subcontinent";
		System.out.println("You have selected " + race);
                user.getScore().addLeftScore(10);
                user.getScore().subRightScore(30);
                user.getScore().subRightScore(15);
		break;
	 case 4:
		race = "Black/African America";
		System.out.println("You have selected " + race);
                user.getScore().addLeftScore(15);
                user.getScore().subRightScore(30);
                user.getScore().subRightScore(15);
		break;
	 case 5:
		race = "Native Hawaiian/Pacific Islander";
		System.out.println("You have selected " + race);
                user.getScore().addLeftScore(10);
                user.getScore().subRightScore(30);
                user.getScore().subRightScore(15);
		break;
	 case 6:
		race = "Hispanic/Latino";
		System.out.println("You have selected " + race);
                user.getScore().addLeftScore(15);
                user.getScore().subRightScore(35);
                user.getScore().subRightScore(10); 
		break;
	 default:
		 System.out.println("You can't have no race. Get outta here!");
		 System.out.println("**GAME OVER**");
		 System.exit(0);
	 }	
	user.setEthinicity(race);

        System.out.println("Okay "+name+", it's time to choose your hometown. What was your hometown's income range? \n1. 1%\n2. Uppper\n3. Middle\n4. Working\n5. Poverty");
	int choice1 = scan.nextInt();
	String hometown = ("");
	switch(choice1){
            case 1: 
                hometown=("1%");
                System.out.println("You have selected " + hometown);
                user.getScore().addEstabScore(30);
                user.getScore().addLeftScore(2);
                user.getScore().addRightScore(2);
			 break;
            case 2:
		hometown=("Upper Class");
		System.out.println("You have selected " + hometown);
                user.getScore().addEstabScore(20);
                user.getScore().addLeftScore(5);
                user.getScore().addRightScore(5);
		break;
            case 3:
		hometown=("Middle Class");
		System.out.println("You have selected " + hometown);
                user.getScore().addEstabScore(10);
                user.getScore().addLeftScore(10);
                user.getScore().addRightScore(10);
                break;
            case 4:
		hometown=("Working Class");
		System.out.println("You have selected " + hometown);
                user.getScore().subEstabScore(25);
                user.getScore().addLeftScore(20);
                user.getScore().addRightScore(20);
		break;
            case 5:
                hometown=("Complete Poverty");
		System.out.println("You have selected " + hometown);
                user.getScore().subEstabScore(30);
                user.getScore().addLeftScore(25);
                user.getScore().addRightScore(25);
		break;
            default:
                hometown=("Complete Poverty");
		System.out.println("So, you think you're too good for the system? Okay then, your class will be completely impoverished. Hope you're happy.");
                user.getScore().subEstabScore(15);
                user.getScore().addLeftScore(25);
                user.getScore().addRightScore(25);
		break;
	}
	user.setHometown(hometown);
	//input education
	System.out.println("Now that you have selected your hometown, it's time to select your education level.\nPlease select the prestige of your school.");
	System.out.println("1. Ivy League\n2. Top 20 University\n3. State College\n4. Community College\n5. High School");
	String college = "";
	int choice2 = scan.nextInt();
	switch(choice2){
            case 1: 
                college=("Ivy League");
                System.out.println("You have selected " + college);
                user.getScore().addEstabScore(20);
                user.getScore().addLeftScore(10);
                user.getScore().addRightScore(10);
		break;
            case 2:
                college=("Top 50 University");
                System.out.println("You have selected " + college);
                user.getScore().addEstabScore(15);
                user.getScore().addLeftScore(10);
                user.getScore().addRightScore(10);
                break;
            case 3:
                college=("State College");
		System.out.println("You have selected " + college);
                user.getScore().subEstabScore(5);
                user.getScore().addLeftScore(5);
                user.getScore().addRightScore(5);
		break;
            case 4:
		college=("Community College");
		System.out.println("You have selected " + college);
                user.getScore().subEstabScore(5);
                user.getScore().addLeftScore(5);
                user.getScore().addRightScore(5);
		break;
            case 5:
		college=("High School");
		System.out.println("You have selected " + college);
                user.getScore().subEstabScore(10);
                user.getScore().subLeftScore(5);
                user.getScore().subLeftScore(5);
		break;
            default:
		college=("Uneducated");
		System.out.println("Okay then, no college.");
                user.getScore().subEstabScore(20);
                user.getScore().subLeftScore(10);
                user.getScore().subRightScore(10);
		break;
	}
        user.setCollege(college);
        
        System.out.println("Okay, let's recap your information so far. Your name is " + name + ", you are " + age + " years old, your socioeconomic background is " + hometown + ", and your education level is " + college);
	String job = "";
	if (!"Uneducated".equals(college) && !"High School".equals(college)){
            System.out.println("Now please select your current occupation\n1. State Legislator\n2. Governor\n3. Senator\n4. House Representative\n5. Lawyer\n6. Businessperson\n7. Mayor\n8. Director of Product Development Manager");
            choice = scan.nextInt();
            switch(choice){
                case 1: 
                    job = "State Legislator";
                    System.out.println("You have selected " + job);
                    user.getScore().addEstabScore(10);
                    user.getScore().addLeftScore(10);
                    user.getScore().addRightScore(10);
                    break;
		case 2:
                    job = "Governor";
                    System.out.println("You have selected " + job);
                    user.getScore().addEstabScore(20);
                    user.getScore().addLeftScore(10);
                    user.getScore().addRightScore(10);
                    break;
		case 3:
                    job = "Senator";
                    System.out.println("You have selected " + job);
                    user.getScore().addEstabScore(25);
                    user.getScore().addLeftScore(10);
                    user.getScore().addRightScore(10);
                    break;
		case 4:
                    job = "House Representative";
                    System.out.println("You have selected " + job);
                    user.getScore().addEstabScore(25);
                    user.getScore().addLeftScore(10);
                    user.getScore().addRightScore(10);
                    break;
		case 5:
                    job = "Lawyer";
                    System.out.println("You have selected " + job);
                    user.getScore().addEstabScore(5);
                    user.getScore().addLeftScore(5);
                    user.getScore().addRightScore(5);
                    break;
		case 6:
                    job = "Business";
                    System.out.println("You have selected " + job);
                    user.getScore().addEstabScore(5);
                    user.getScore().addLeftScore(10);
                    user.getScore().addRightScore(20);
                    break;
                case 7:
                    job= "Mayor";
                    System.out.println("You have selected " + job);
                    user.getScore().addEstabScore(0);
                    user.getScore().addLeftScore(5);
                    user.getScore().addRightScore(10);
                    break;
                    
                case 8:
                    job="Director of Product Development Manager";
                    System.out.println(job);
                    user.getScore().addEstabScore(25);
                    user.getScore().addLeftScore(5);
                    user.getScore().addRightScore(5);
		default:
                    job = "Unemployed";
                    System.out.println("Okay then... I guess you're unemployed... I wonder where you're getting your campaign funds from...");
                    user.getScore().subEstabScore(180);
                    user.getScore().subLeftScore(150);
                    user.getScore().subRightScore(150);
                    break;
		}
		user.setCurrentCareer(job);
		System.out.println("How many college majors do you have?");
		int maj = scan.nextInt();
		if (maj > 3){
                    System.out.println("Cut it out Einstein, you couldn't possibly have that many majors.  Say how many majors you have, truthfully this time.");
                    maj = scan.nextInt();
                    if (maj > 3){
			System.out.println("Alright, I don't have time for this. Get out of here. Due budget cuts and code constraints, we are forced to end the game now. \n**GAME OVER**");
			System.exit(0);
                    }
		}
		if (maj < 0){
                    System.out.println("Cut it out Doofus . Say how many majors you have, truthfully this time.");
                    maj = scan.nextInt();
                    if (maj < 0){
			System.out.println("Alright, I don't have time for this. Get out of here. Budget cuts have prevented us from continuing the game.\n**GAME OVER**");
			System.exit(0);
                    }
		}
		if (maj == 0){
                    System.out.println("Not sure how well this'll look to the public... But okay, no major. Einstein had PhD but that was awarded not earned.");
                    user.getScore().subEstabScore(150);
                    user.getScore().subLeftScore(150);
                    user.getScore().subRightScore(150);
		}
		else{
		System.out.println("Okay, please select your major(s) from this list:\n1. Economics\n2. Political Science\n3. Pre-Law\n4. Physics\n5. Gender studies\n6. Computer Engineering");
		for (int j = 0; j<maj; j++){
                    choice = scan.nextInt();
                    if(j>0){
                    switch(choice){
                    case 1: 
                        user.addMajors("Economics");
                        user.getScore().addEstabScore(20);
                        user.getScore().addLeftScore(5);
                        user.getScore().addRightScore(20);
			break;
                    case 2:
                        user.addMajors("Political Science");
                        user.getScore().addEstabScore(0);
                        user.getScore().addLeftScore(5);
                        user.getScore().addRightScore(0);
			break;
                    case 3:
			user.addMajors("Pre-Law");
                        user.getScore().addEstabScore(15);
                        user.getScore().addLeftScore(5);
                        user.getScore().addRightScore(5);
			break;
                    case 4:
			user.addMajors("Physics");
                        user.getScore().addEstabScore(0);
                        user.getScore().addLeftScore(5);
                        user.getScore().addRightScore(0);
			break;
                    case 5:
			user.addMajors("Gender Studies");
                        user.getScore().subEstabScore(200);
                        user.getScore().subLeftScore(80);
                        user.getScore().subRightScore(200);
			break;
                    case 6:
                        user.addMajors("Computer Engineering");
                        user.getScore().addEstabScore(15);
                        user.getScore().addLeftScore(5);
                        user.getScore().addRightScore(5);
                    default:
                        break;
                    }
		}
		else{
                    switch(choice){
                        case 1: 
                            user.setMajors("Economics", j);
                            break;
                        case 2:
                            user.setMajors("Political Science", j);
                            break;
                        case 3:
                            user.setMajors("Pre-Law", j);
                            break;
                        case 4:
                            user.setMajors("Physics", j);
                            break;
                        case 5:
                            user.setMajors("Gender Studies", j);
                            break;
                        case 6:
                            user.addMajors("Computer Engineering");
                            user.getScore().addEstabScore(15);
                            user.getScore().addLeftScore(5);
                            user.getScore().addRightScore(5);
                        default:
                            user.setMajors("None I'm a stupid head", j);
                            break;
                            
                    }
		}
            }
            System.out.println("You have selected: ");
            for (int j = 0; j<maj;j++){
                System.out.println(user.getMajors()[j] + " ");
            }
            System.out.println("Do you have any post-graduate education? (Yes/No)");
            String degree = scan.nextLine();
            if(degree.equals("Yes")){
                System.out.println("What type of graduate degree do you have?");
                degree = scan.nextLine();
                user.setGradDegree(degree);
            }
	}
        
        }
        System.out.println("To specify to the public, on a scale from 1 (Marxist) to 10 (Fascist), what is your political ideology?");
        int ideology = scan.nextInt();
        if(ideology>5&&ideology<=7){
            user.getScore().addEstabScore(20);
            user.getScore().subLeftScore(25);
            user.getScore().addRightScore(20);
        }
        else if(ideology<5&&ideology>=3){
            user.getScore().addEstabScore(5);
            user.getScore().addLeftScore(20);
            user.getScore().subRightScore(25);
        }
        else if(ideology<3){
            user.getScore().subEstabScore(50);
            user.getScore().addLeftScore(50);
            user.getScore().subRightScore(65);
        }
        else if(ideology>7){
            user.getScore().subEstabScore(50);
            user.getScore().subLeftScore(65);
            user.getScore().addRightScore(50);
        }
        user.setIdeology(ideology);
        System.out.println("Last question for information, what political party do you affiliate with?");
        String party = scan.nextLine();
	user.setPoliParty(party); 

	System.out.println("Okay, " + name + ", in order to run for president, you must choose someone to run your campaign and staff.\nHere is a list of different people you can choose from. Please select one of these people's numbers to see info about them.");	 
        ChiefStaff[] chiefStaffCandidate=new ChiefStaff[11];
        for(int i=0;i<chiefStaffCandidate.length;i++){
            chiefStaffCandidate[i]=new ChiefStaff();
        }
        for(int i=0;i<chiefStaffCandidate.length;i++){
            System.out.println(i+1 +". "+chiefStaffCandidate[i].toString());
        }
        int choice69=scan.nextInt();
        System.out.println("Are you sure you want to run your campaign with " + chiefStaffCandidate[choice69].getName()+" (Yes/No)");
        String temp=scan.nextLine();
        if(temp.equals("Yes")||temp.equals("yes")){
            switch(choice69){
                case 1:
                    user.setChiefStaff(chiefStaffCandidate[0]);
                    break;
                case 2:
                    user.setChiefStaff(chiefStaffCandidate[1]);
                    break;
                case 3:
                    user.setChiefStaff(chiefStaffCandidate[2]);
                    break;
                case 4:
                    user.setChiefStaff(chiefStaffCandidate[3]);
                    break;
                case 5:
                    user.setChiefStaff(chiefStaffCandidate[4]);
                    break;
                case 6:
                    user.setChiefStaff(chiefStaffCandidate[5]);
                    break;
                case 7:
                    user.setChiefStaff(chiefStaffCandidate[6]);
                    break;
                case 8:
                    user.setChiefStaff(chiefStaffCandidate[7]);
                    break;
                case 9:
                    user.setChiefStaff(chiefStaffCandidate[8]);
                    break;
                case 10:
                    user.setChiefStaff(chiefStaffCandidate[9]);
                    break;
                case 11:
                    user.setChiefStaff(chiefStaffCandidate[10]);
                    break;
            }
        }
        else{
            System.out.println("Choose again: ");
            choice=scan.nextInt();
            System.out.println("Have you made up your mind?");
            if(temp.equals("Yes")||temp.equals("yes")){
            switch(choice){
                case 1:
                    user.setChiefStaff(chiefStaffCandidate[0]);
                    break;
                case 2:
                    user.setChiefStaff(chiefStaffCandidate[1]);
                    break;
                case 3:
                    user.setChiefStaff(chiefStaffCandidate[2]);
                    break;
                case 4:
                    user.setChiefStaff(chiefStaffCandidate[3]);
                    break;
                case 5:
                    user.setChiefStaff(chiefStaffCandidate[4]);
                    break;
                case 6:
                    user.setChiefStaff(chiefStaffCandidate[5]);
                    break;
                case 7:
                    user.setChiefStaff(chiefStaffCandidate[6]);
                    break;
                case 8:
                    user.setChiefStaff(chiefStaffCandidate[7]);
                    break;
                case 9:
                    user.setChiefStaff(chiefStaffCandidate[8]);
                    break;
                case 10:
                    user.setChiefStaff(chiefStaffCandidate[9]);
                    break;
                case 11:
                    user.setChiefStaff(chiefStaffCandidate[10]);
                    break;
                }
            }
            else{
                System.out.println("Too bad, lol");
                switch(choice){
                case 1:
                    user.setChiefStaff(chiefStaffCandidate[0]);
                    break;
                case 2:
                    user.setChiefStaff(chiefStaffCandidate[1]);
                    break;
                case 3:
                    user.setChiefStaff(chiefStaffCandidate[2]);
                    break;
                case 4:
                    user.setChiefStaff(chiefStaffCandidate[3]);
                    break;
                case 5:
                    user.setChiefStaff(chiefStaffCandidate[4]);
                    break;
                case 6:
                    user.setChiefStaff(chiefStaffCandidate[5]);
                    break;
                case 7:
                    user.setChiefStaff(chiefStaffCandidate[6]);
                    break;
                case 8:
                    user.setChiefStaff(chiefStaffCandidate[7]);
                    break;
                case 9:
                    user.setChiefStaff(chiefStaffCandidate[8]);
                    break;
                case 10:
                    user.setChiefStaff(chiefStaffCandidate[9]);
                    break;
                case 11:
                    user.setChiefStaff(chiefStaffCandidate[10]);
                    break;
                }
            }
        }
        
        System.out.println("You're all set. Ready to announce your campaign?");
        String choice99=scan.nextLine();
        switch(choice99){
            case "Yes":
                Candidate opp=new Candidate();
                System.out.println("Welcome to the 2016 Presidential Election. Good Luck!");
                if(user.getIdeology()<5 && user.getIdeology()>2){
                    opp.setName("Sernie Banders");
                    opp.setAge(72);
                    opp.setGender("Male");
                    opp.setEthinicity("White");
                    opp.setSexOrient("Heterosexual");
                    opp.setHometown("Working Class");
                    opp.setCollege("Ivy League");
                    opp.setCurrentCareer("Senator");
                    String[] pastCareers={"House Representative", "Mayor"};
                    opp.setPastCareers(pastCareers);
                    opp.setMajors("Political Science", 0);
                    opp.setGradDegree("");
                    opp.setIdeology(1.5);
                    opp.setPoliParty("Democrat");
                    for(int i=0;i<chiefStaffCandidate.length;i++){
                        if((chiefStaffCandidate[i].getGrade().equals("A+") || (chiefStaffCandidate[i].getGrade().equals("A-")) && !(user.getChiefStaff().getName().equals(chiefStaffCandidate[i].getName())))){
                            opp.setChiefStaff(chiefStaffCandidate[i]);
                        }
                    }
                    user.getScore().addLeftScore(2);
                    user.getScore().addRightScore(5);
                    user.getScore().addEstabScore(10);
                    user.getScore().addLeftScore(15);
                user.getScore().addRightScore(20);
                user.getScore().addEstabScore(45);
                user.getScore().addLeftScore(15);
                user.getScore().addRightScore(20);
                user.getScore().addEstabScore(45);
                user.getScore().addLeftScore(15);
                user.getScore().addRightScore(30);
                user.getScore().addEstabScore(40);
                user.getScore().subEstabScore(25);
                user.getScore().addLeftScore(20);
                user.getScore().addRightScore(20);
                user.getScore().addEstabScore(20);
                user.getScore().addLeftScore(10);
                user.getScore().addRightScore(10);
                user.getScore().addEstabScore(25);
                    user.getScore().addLeftScore(10);
                    user.getScore().addRightScore(10);
                    user.getScore().addEstabScore(0);
                        user.getScore().addLeftScore(5);
                        user.getScore().addRightScore(0);
                user.getScore().subEstabScore(50);
            user.getScore().addLeftScore(50);
            user.getScore().subRightScore(65);
            
                }
                break;
            case "yes":
                opp=new Candidate();
                System.out.println("Welcome to the 2016 Presidential Election. Good Luck!");
                break;
            case "No":
                System.out.println("Okay, bye.");
                System.out.println("**GAME OVER**");
		System.exit(0);
                break;
            case "no":
                System.out.println("Okay, bye.");
                System.out.println("**GAME OVER**");
		System.exit(0);
                break;
        }
        
        System.out.println();
        
        System.out.println("Would you like to learn more about the issues? (Yes/No)");
        String response50=scan.nextLine();
        switch (response50) {
            case "Yes":
                java.awt.Desktop.getDesktop().browse(new java.net.URI("https://www.isidewith.com/polls/popular"));
                break;
            case "yes":
                java.awt.Desktop.getDesktop().browse(new java.net.URI("https://www.isidewith.com/polls/popular"));
                break;
            case "No":
                System.out.println("Okay");
                break;
            case "no":
                System.out.println("Okay");
                break;
            default:
                System.out.println("Yes/No");
                break;
        }
    }
}