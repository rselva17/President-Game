/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project;

import java.util.ArrayList;

/**
 * 
 *@author Raghuram Selvaraj
 *@date May 5, 2016
 * 
 */
public class Candidate {
   private double funding=0;
   private Score score;
   
   private ArrayList<String> promises;
   private String name; // name
   private String hometown; // income
   private String college; // prestige
   private ArrayList<String> majors=new ArrayList<String>(); // Economics, Political Science, Pre-Law, Physics, Gender studies, etc...
   private String currentCareer; //State Legislator, Congressman/woman, Governor
   private int age; //35 to 12
   private String sexOrient; // LGBTQ, cis, straight
   private String ethnicity; // American Indian/Alaskan Native, Asian/Indian Subcontinent, Black or African American, Native Hawaiian or Pacific Islander, White, Hispanic/Latino
   private String gender; // man, woman
   private double ideology; // scale of ideology from 1 to 10 (1=socialist; 10=fascist)
   private ArrayList<String> pastCareers=new ArrayList<String>(); // asked to list past good jobs
   private String poliParty;
   private String gradDegree; //Law School, Ph.D, etc...
   private ChiefStaff chiefOfStaff;
   private ArrayList<Donor> donors;
   private ArrayList<GovLeader> govLeaders;
   private Stances stances;
   
   private int primaryWins=0;
   
   public Candidate(){
       name=null;
       hometown=null;
       college=null;
       majors.add(null);
       currentCareer=null;
       age=0;
       sexOrient=null;
       ethnicity=null;
       gender=null;
       ideology=0.0;
       pastCareers.add(null);
       poliParty=null;
       gradDegree=null;
       chiefOfStaff=null;

       stances=new Stances();
       score=new Score();
       promises=new ArrayList<String>();
       funding=0;
   }
   
   public void setName(String name){
       this.name=name;
   }
   public String getName(){
       return name;
   }
   public void setHometown(String hometown){
       this.hometown=hometown;
   }
   public String getHometown(){
       return hometown;
   }
   public void setCollege(String college){
       this.college=college;
   }
   public String getCollege(){
       return college;
   }
  public void addMajors(String majors){
		   this.majors.add(majors);
	   }
	   public void setMajors(String majors,int j){
	           this.majors.set(j,majors);
	   }
	   public String[] getMajors(){
	       String[] majs = new String[majors.size()];
	       for(int i=0;i<this.majors.size();i++){
	           majs[i]=majors.get(i);
	       }
	       return majs;
	   }

   public void setCurrentCareer(String currentCareer){
       this.currentCareer=currentCareer;
   }
   public String getCurrentCareer(){
       return currentCareer;
   }
   public void setAge(int age){
       this.age=age;
   }
   public int getAge(){
       return age;
   }
   public void setSexOrient(String sexOrient){
       this.sexOrient=sexOrient;
   }
   public String getSexOrient(){
       return sexOrient;
   }
   public void setEthinicity(String ethnicity){
       this.ethnicity=ethnicity;
   }
   public String getEthnicity(){
       return ethnicity;
   }
   public void setGender(String gender){
       this.gender=gender;
   }
   public String getGender(){
       //I identify as a wolf
       return gender;
   }
   public void setIdeology(double ideology){
       this.ideology=ideology;
   }
   public double getIdeology(){
       return ideology;
   }
   public void setPastCareers(String[] pastCareers){
       for(int i=0;i<pastCareers.length;i++){
           this.pastCareers.add(i,pastCareers[i]);
       }
   }
   public String[] getPastCareers(){
       String[] pasCar=null;
       for(int i=0;i<this.pastCareers.size();i++){
           pasCar[i]=pastCareers.get(i);
       }
       return pasCar;
   }
   
   public void setPoliParty(String poliParty){
       this.poliParty=poliParty;
   }
   public String getPoliParty(){
       return poliParty;
   }
   
   public void setGradDegree(String gradDegree){
       this.gradDegree=gradDegree;
   }
   public String getGradDegree(){
       return gradDegree;
   }
   
   public void setChiefStaff(ChiefStaff chiefOfStaff){
       this.chiefOfStaff=chiefOfStaff;
   }
   public ChiefStaff getChiefStaff(){
       return chiefOfStaff;
   }
   
   public void setDonors(ArrayList<Donor> donors){
       for(int i=0;i<donors.size();i++){
           this.donors.add(i,donors.get(i));
           score.addLeftScore(donors.get(i).getLeftScore());
           score.addRightScore(donors.get(i).getRightScore());
           score.addEstabScore(donors.get(i).getEstabScore());
       }
   }
   public ArrayList<Donor> getDonors(){
       return donors;
   }
   public void addDonor(Donor donor){
       this.donors.add(donor);
       score.addLeftScore(donor.getLeftScore());
       score.addRightScore(donor.getRightScore());
       score.addEstabScore(donor.getEstabScore());
   }
   public void removeDonor(Donor donor){
       this.donors.remove(donor);
   }
   
   public void setGovLeaders(ArrayList<GovLeader> govLeaders){
       for(int i=0;i<govLeaders.size();i++){
           this.govLeaders.add(i,govLeaders.get(i));
           score.addLeftScore(govLeaders.get(i).getLeftScore());
           score.addRightScore(govLeaders.get(i).getRightScore());
           score.addEstabScore(govLeaders.get(i).getEstabScore());
       }
   }
   public ArrayList<GovLeader> getGovLeaders(){
       return govLeaders;
   }
   public void addGovLeaders(GovLeader govLeaders){
       this.govLeaders.add(govLeaders);
       score.addLeftScore(govLeaders.getLeftScore());
       score.addRightScore(govLeaders.getRightScore());
       score.addEstabScore(govLeaders.getEstabScore());
   }
   public void removeGovLeaders(GovLeader govLeaders){
       this.govLeaders.remove(govLeaders);
   }
   
   public void addPromises(String promise){
       this.promises.add(promise);
   }
   public void addPromises(ArrayList<String> promises){
       for(int i=0;i<promises.size();i++){
           this.promises.add(promises.get(i));
       }
   }
   
   public void addFunding(){
       
       for(int i=0;i<donors.size();i++){
            if(donors.get(i).getType().equals("Corporation")){
                funding+=50000000;
            }
            else if(donors.get(i).getType().equals("Union")){
                funding+=200000;
            }
            else if(donors.get(i).getType().equals("AdvocacyGroup")){
                funding+=2000000;
            }
       }
   }
   public double getFunding(){
       return funding;
   }
   public Score getScore(){
       return score;
   }
   public void addPrimaryWins(){
       primaryWins+=1;
   }
}

