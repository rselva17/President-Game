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
public class Stances {
    private Candidate user;
    
    private String backgroundChecks;
    private String gayMarriage;
    private String welfareDrugTest;
    private String welfareEmployment;
    private String obamacare;
    private String equalPay;
    private String abortion;
    private String plannedParenthood;
    private String womenLeadership;
    private String undocHealthcare;
    private String undocTuition;
    private String undocChildCitizen;
    private String undocWorkAmnesty;
    private String offshoreDrilling;
    private String altEnergy;
    private String fracking;
    private String gmoLabel;
    private String globWarmReg;
    private String incMinWage;
    private String cutPublicSpend;
    private String medicaid;
    private String socialSecurityRetAgeInc;
    private String laborUnions;
    private String decMilitarySpend;
    private String torture;
    private String nsa;
    private String israel;
    private String decWarISIS;
    private String isisGroundWar;
    private String patriotAct;
    private String closeGitmo;
    private String womenInMilitary;
    private String overthrowAssad;
    private String cubaRelations;
    private String decStudLoanInterestRate;
    private String obamaScotusNom;
    private String campaignFinanceRef;
    private String legalizeMarijuana;
    private String decrimDrugs;
    private String justiceReform;
    private String deathPenalty;
    private String commonCore;
    private String eduReform;
    private String reduceCorpTax;
    private String prosecWallStExecs;
    private String increaseCapTax;
    private String auditFed;
    private String offshoreAccounts;
    private String discrimTransPpl;
    private String affirmAction;
    private String indepRedraw;
    private String spaceExplore;
    private String freeTrade;
    
    public Stances(){
        backgroundChecks=null;
        gayMarriage=null;
        welfareDrugTest=null;
        welfareEmployment=null;
        obamacare=null;
        equalPay=null;
        abortion=null;
        plannedParenthood=null;
        womenLeadership=null;
        undocHealthcare=null;
        undocTuition=null;
        undocChildCitizen=null;
        undocWorkAmnesty=null;
        offshoreDrilling=null;
        altEnergy=null;
        fracking=null;
        gmoLabel=null;
        globWarmReg=null;
        incMinWage=null;
        cutPublicSpend=null;
        medicaid=null;
        socialSecurityRetAgeInc=null;
        laborUnions=null;
        decMilitarySpend=null;
        torture=null;
        nsa=null;
        israel=null;
        decWarISIS=null;
        isisGroundWar=null;
        patriotAct=null;
        closeGitmo=null;
        womenInMilitary=null;
        overthrowAssad=null;
        cubaRelations=null;
        decStudLoanInterestRate=null;
        obamaScotusNom=null;
        campaignFinanceRef=null;
        legalizeMarijuana=null;
        decrimDrugs=null;
        justiceReform=null;
        deathPenalty=null;
        commonCore=null;
        eduReform=null;
        reduceCorpTax=null;
        prosecWallStExecs=null;
        increaseCapTax=null;
        auditFed=null;
        offshoreAccounts=null;
        discrimTransPpl=null;
        affirmAction=null;
        indepRedraw=null;
        spaceExplore=null;
        freeTrade=null;
    }
    
    public void setBackgroundChecks(String backgroundChecks){
        this.backgroundChecks=backgroundChecks;
        if(backgroundChecks.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(backgroundChecks.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getBackgroundChecks(){
        return backgroundChecks;
    }
    
    public void setGayMarriage(String gayMarriage){
        this.gayMarriage=gayMarriage;
        if(gayMarriage.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(gayMarriage.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getGayMarriage(){
        return gayMarriage;
    }
    
    public void setWelfareDrugTest(String welfareDrugTest){
        this.welfareDrugTest=welfareDrugTest;
        if(welfareDrugTest.equals("Support")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
        else if(welfareDrugTest.equals("Oppose")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
    }
    public String getWelfareDrugTest(){
        return welfareDrugTest;
    }
    
    public void setWelfareEmployment(String welfareEmployment){
        this.welfareEmployment=welfareEmployment;
        if(welfareEmployment.equals("Support")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
        else if(welfareEmployment.equals("Oppose")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
    }
    public String getWelfareEmployment(){
        return welfareEmployment;
    }
    
    public void setObamacare(String obamacare){
        this.obamacare=obamacare;
        if(obamacare.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(obamacare.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getObamacare(){
        return obamacare;
    }
    
    public void setEqualPay(String equalPay){
        this.equalPay=equalPay;
        if(equalPay.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(equalPay.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getEqualPay(){
        return equalPay;
    }
    
    public void setAbortion(String abortion){
        this.abortion=abortion;
        if(abortion.equals("Pro-Choice")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(abortion.equals("ProLife")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getAbortion(){
        return abortion;
    }
    
    public void setPlannedParenthood(String plannedParenthood){
        this.plannedParenthood=plannedParenthood;
        if(plannedParenthood.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(plannedParenthood.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getPlannedParenthood(){
        return plannedParenthood;
    }
    
    public void setWomenLeadership(String womenLeadership){
        this.womenLeadership=womenLeadership;
        if(womenLeadership.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(womenLeadership.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getWomenLeadership(){
        return womenLeadership;
    }
    
    public void setUndocHealthcare(String undocHealthcare){
        this.undocHealthcare=undocHealthcare;
        if(undocHealthcare.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(undocHealthcare.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getUndocHealthcare(){
        return undocHealthcare;
    }
    
    public void setUndocTuition(String undocTuition){
        this.undocTuition=undocTuition;
        if(undocTuition.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(undocTuition.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getUndocTuition(){
        return undocTuition;
    }
    
    public void setUndocChildCitizen(String undocChildCitizen){
        this.undocChildCitizen=undocChildCitizen;
        if(undocChildCitizen.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(undocChildCitizen.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getUndocChildCitizen(){
        return undocChildCitizen;
    }
    
    public void setUndocWorkAmnesty(String undocWorkAmnesty){
        this.undocWorkAmnesty=undocWorkAmnesty;
        if(undocWorkAmnesty.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(undocWorkAmnesty.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getUndocWorkAmnesty(){
        return undocWorkAmnesty;
    }
    
    public void setOffshoreDrilling(String offshoreDrilling){
        this.offshoreDrilling=offshoreDrilling;
        if(offshoreDrilling.equals("Support")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
        else if(offshoreDrilling.equals("Oppose")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
    }
    public String getOffshoreDrilling(){
        return offshoreDrilling;
    }
    
    public void setAltEnergy(String altEnergy){
        this.altEnergy=altEnergy;
        if(altEnergy.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(altEnergy.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getAltEnergy(){
        return altEnergy;
    }
    
    public void setFracking(String fracking){
        this.fracking=fracking;
        if(fracking.equals("Support")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
        else if(fracking.equals("Oppose")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
    }
    public String getFracking(){
        return fracking;
    }
    
    public void setGmoLabel(String gmoLabel){
        this.gmoLabel=gmoLabel;
        if(gmoLabel.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(gmoLabel.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getGmoLabel(){
        return gmoLabel;
    }
    
    public void setGlobWarmReg(String globWarmReg){
        this.globWarmReg=globWarmReg;
        if(globWarmReg.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(globWarmReg.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getGlobWarmReg(){
        return globWarmReg;
    }
    
    public void setIncMinWage(String incMinWage){
        this.incMinWage=incMinWage;
        if(incMinWage.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(incMinWage.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getIncMinWage(){
        return incMinWage;
    }
    
    public void setCutPublicSpend(String cutPublicSpend){
        this.cutPublicSpend=cutPublicSpend;
        if(cutPublicSpend.equals("Support")){
            user.getScore().subLeftScore(40);
            user.getScore().addRightScore(5);
        }
        else if(cutPublicSpend.equals("Oppose")){
            user.getScore().addLeftScore(20);
            user.getScore().subRightScore(20);
        }
    }
    public String getCutPublicSpend(){
        return cutPublicSpend;
    }
    
    public void setMedicaid(String medicaid){
        this.medicaid=medicaid;
        if(medicaid.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(medicaid.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getMedicaid(){
        return medicaid;
    }
    
    public void setSocialSecurityRetAgeInc(String socialSecurityRetAgeInc){
        this.socialSecurityRetAgeInc=socialSecurityRetAgeInc;
        if(socialSecurityRetAgeInc.equals("Support")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
        else if(socialSecurityRetAgeInc.equals("Oppose")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
    }
    public String getSocialSecurityRetAgeInc(){
        return socialSecurityRetAgeInc;
    }
    
    public void setLaborUnions(String laborUnions){
        this.laborUnions=laborUnions;
        if(laborUnions.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(laborUnions.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getLaborUnions(){
        return laborUnions;
    }
    
    public void setDecMilitarySpend(String decMilitarySpend){
        this.decMilitarySpend=decMilitarySpend;
        if(decMilitarySpend.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(decMilitarySpend.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getDecMilitarySpend(){
        return decMilitarySpend;
    }
    
    public void setTorture(String torture){
        this.torture=torture;
        if(torture.equals("Support")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
        else if(torture.equals("Oppose")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
    }
    public String getTorture(){
        return torture;
    }
    
    public void setNsa(String nsa){
        this.nsa=nsa;
        if(nsa.equals("Support")){
            user.getScore().subLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(nsa.equals("Oppose")){
            user.getScore().addLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getNsa(){
        return nsa;
    }
    
    public void setIsrael(String israel){
        this.israel=israel;
        if(israel.equals("Support")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
        else if(israel.equals("Oppose")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
    }
    public String getIsrael(){
        return israel;
    }
    
    public void setDecWarISIS(String decWarISIS){
        this.decWarISIS=decWarISIS;
        if(decWarISIS.equals("Support")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
        else if(decWarISIS.equals("Oppose")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
    }
    public String getDecWarISIS(){
        return decWarISIS;
    }
    
    public void setIsisGroundWar(String isisGroundWar){
        this.isisGroundWar=isisGroundWar;
        if(isisGroundWar.equals("Support")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
        else if(isisGroundWar.equals("Oppose")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
    }
    public String getIsisGroundWar(){
        return isisGroundWar;
    }
    
    public void setPatriotAct(String patriotAct){
        this.patriotAct=patriotAct;
        if(patriotAct.equals("Support")){
            user.getScore().subLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(patriotAct.equals("Oppose")){
            user.getScore().addLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getPatriotAct(){
        return patriotAct;
    }
    
    public void setCloseGitmo(String closeGitmo){
        this.closeGitmo=closeGitmo;
        if(closeGitmo.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(closeGitmo.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getCloseGitmo(){
        return closeGitmo;
    }
    
    public void setWomenInMilitary(String womenInMilitary){
        this.womenInMilitary=womenInMilitary;
        if(womenInMilitary.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(womenInMilitary.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getWomenInMilitary(){
        return womenInMilitary;
    }
    
    public void setOverthrowAssad(String overthrowAssad){
        this.overthrowAssad=overthrowAssad;
        if(overthrowAssad.equals("Support")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
        else if(overthrowAssad.equals("Oppose")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
    }
    public String getOverthrowAssad(){
        return overthrowAssad;
    }
    
    public void setCubaRelations(String cubaRelations){
        this.cubaRelations=cubaRelations;
        if(cubaRelations.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(cubaRelations.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getCubaRelations(){
        return cubaRelations;
    }
    
    public void setDecStudLoanInterestRate(String decStudLoanInterestRate){
        this.decStudLoanInterestRate=decStudLoanInterestRate;
        if(decStudLoanInterestRate.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(decStudLoanInterestRate.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getDecStudLoanInterestRate(){
        return decStudLoanInterestRate;
    }
    
    public void setObamaScotusNom(String obamaScotusNom){
        this.obamaScotusNom=obamaScotusNom;
        if(obamaScotusNom.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(obamaScotusNom.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getObamaScotusNom(){
        return obamaScotusNom;
    }
    
    public void setCampaignFinanceRef(String campaignFinanceRef){
        this.campaignFinanceRef=campaignFinanceRef;
        if(campaignFinanceRef.equals("Support")){
            user.getScore().addLeftScore(10);
            user.getScore().addRightScore(10);
            user.getScore().subEstabScore(100);
        }
        else if(campaignFinanceRef.equals("Oppose")){
            user.getScore().subLeftScore(10);
            user.getScore().subRightScore(10);
            user.getScore().addEstabScore(50);
        }
    }
    public String getCampaignFinanceRef(){
        return campaignFinanceRef;
    }
    
    public void setLegalizeMarijuana(String legalizeMarijuana){
        this.legalizeMarijuana=legalizeMarijuana;
        if(legalizeMarijuana.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().addRightScore(5);
            user.getScore().subEstabScore(30);
        }
        else if(legalizeMarijuana.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().subRightScore(5);
            user.getScore().addEstabScore(30);
        }
    }
    public String getLegalizeMarijuana(){
        return legalizeMarijuana;
    }
    
    public void setDecrimDrugs(String decrimDrugs){
        this.decrimDrugs=decrimDrugs;
        if(decrimDrugs.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(decrimDrugs.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getDecrimDrugs(){
        return decrimDrugs;
    }
    
    public void setJusticeReform(String justiceReform){
        this.justiceReform=justiceReform;
        if(justiceReform.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(justiceReform.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getJusticeReform(){
        return justiceReform;
    }
    
    public void setDeathPenalty(String deathPenalty){
        this.deathPenalty=deathPenalty;
        if(deathPenalty.equals("Support")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
        else if(deathPenalty.equals("Oppose")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
    }
    public String getDeathPenalty(){
        return deathPenalty;
    }
    
    public void setCommonCore(String commonCore){
        this.commonCore=commonCore;
        if(commonCore.equals("Support")){
            user.getScore().subLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(commonCore.equals("Oppose")){
            user.getScore().addLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getCommonCore(){
        return commonCore;
    }
    
    public void setEduReform(String eduReform){
        this.eduReform=eduReform;
        if(eduReform.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(eduReform.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getEduReform(){
        return eduReform;
    }
    
    public void setReduceCorpTax(String reduceCorpTax){
        this.reduceCorpTax=reduceCorpTax;
        if(reduceCorpTax.equals("Support")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
        else if(reduceCorpTax.equals("Oppose")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
    }
    public String getReduceCorpTax(){
        return reduceCorpTax;
    }
    
    public void setProsecWallStExecs(String prosecWallStExecs){
        this.prosecWallStExecs=prosecWallStExecs;
        if(prosecWallStExecs.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().addRightScore(5);
            user.getScore().subEstabScore(50);
        }
        else if(prosecWallStExecs.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().subRightScore(5);
            user.getScore().addEstabScore(50);
        }
    }
    public String getProsecWallStExecs(){
        return prosecWallStExecs;
    }
    
    public void setIncreaseCapTax(String increaseCapTax){
        this.increaseCapTax=increaseCapTax;
        if(increaseCapTax.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(increaseCapTax.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getIncreaseCapTax(){
        return increaseCapTax;
    }
    
    public void setAuditFed(String auditFed){
        this.auditFed=auditFed;
        if(auditFed.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
            user.getScore().subEstabScore(20);
        }
        else if(auditFed.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
            user.getScore().addEstabScore(20);
        }
    }
    public String getAuditFed(){
        return auditFed;
    }
    
    public void setOffshoreAccounts(String offshoreAccounts){
        this.offshoreAccounts=offshoreAccounts;
        if(offshoreAccounts.equals("Support")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
        else if(offshoreAccounts.equals("Oppose")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
    }
    public String getOffshoreAccounts(){
        return offshoreAccounts;
    }
    
    public void setDiscrimTransPpl(String discrimTransPpl){
        this.discrimTransPpl=discrimTransPpl;
        if(discrimTransPpl.equals("Support")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
        else if(discrimTransPpl.equals("Oppose")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
    }
    public String getDiscrimTransPpl(){
        return discrimTransPpl;
    }
    
    public void setAffirmAction(String affirmAction){
        this.affirmAction=affirmAction;
        if(affirmAction.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(affirmAction.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getAffirmAction(){
        return affirmAction;
    }
    
    public void setIndepRedraw(String indepRedraw){
        this.indepRedraw=indepRedraw;
        if(indepRedraw.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().addRightScore(5);
        }
        else if(indepRedraw.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().subRightScore(5);
        }
    }
    public String getIndepRedraw(){
        return indepRedraw;
    }
    
    public void setSpaceExplore(String spaceExplore){
        this.spaceExplore=spaceExplore;
        if(spaceExplore.equals("Support")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
        else if(spaceExplore.equals("Oppose")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
    }
    public String getSpaceExplore(){
        return spaceExplore;
    }
    
    public void setFreeTrade(String freeTrade){
        this.freeTrade=freeTrade;
        if(freeTrade.equals("Support")){
            user.getScore().subLeftScore(5);
            user.getScore().addRightScore(5);
        }
        else if(freeTrade.equals("Oppose")){
            user.getScore().addLeftScore(5);
            user.getScore().subRightScore(5);
        }
    }
    public String getFreeTrade(){
        return freeTrade;
    }
}
