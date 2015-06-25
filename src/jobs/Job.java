/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobs;

/**
 *
 * @author Desktop
 */
public abstract class Job {
    
    private String picture;
    private String name;
    
    private String skillNameAlpha;
    private String skillNameBeta;
    private String skillNameDelta;
    private String skillNameEpsilon;
    
    public abstract int attack();
    public abstract int useSkillAlpha();
    public abstract int useSkillBeta();
    public abstract int useSkillDelta();
    public abstract int useSkillEpsilon();

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkillNameAlpha() {
        return skillNameAlpha;
    }

    public void setSkillNameAlpha(String skillNameAlpha) {
        this.skillNameAlpha = skillNameAlpha;
    }

    public String getSkillNameBeta() {
        return skillNameBeta;
    }

    public void setSkillNameBeta(String skillNameBeta) {
        this.skillNameBeta = skillNameBeta;
    }

    public String getSkillNameDelta() {
        return skillNameDelta;
    }

    public void setSkillNameDelta(String skillNameDelta) {
        this.skillNameDelta = skillNameDelta;
    }

    public String getSkillNameEpsilon() {
        return skillNameEpsilon;
    }

    public void setSkillNameEpsilon(String skillNameEpsilon) {
        this.skillNameEpsilon = skillNameEpsilon;
    }
    
    
    
}
