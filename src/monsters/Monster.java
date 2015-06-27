/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsters;

/**
 *
 * @author Desktop
 */
public abstract class Monster {
    
    private String picture;
    private String name;
    private int level; //Determines Stats.
    private int goldDrop; //Dependent on Level.
    private int expReward; //Dependent on Level.
    
    private int health;
    private int currentHealth;
    private int currentMana;
    private int mana;
    private int damage;
    private int defense;
    private int dodge; //Dodge% = 100-(Enemy's Accuracy-Dodge). Dodge physical only.
    private int accuracy; //Hit% = Accuracy-Enemy's Dodge. (Physical Only)
    private int magicDamage; //Calculated in magic skills.
    private int criticalChance; //Use as percentage/10.
    private int criticalDamage; //On top of normal damage %-wise.
    
    private int strength; //+5 damage, +5 health
    private int magic; //+1 magic damage, +5 mana
    private int dexterity; //+5 accuracy, +2 defense
    private int agility; //+1 critical chance, +1 dodge
    private int luck; //+1 dodge, +1 critical damage
    
    private String skillNameAlpha;
    private String skillNameBeta;
    private String skillNameDelta;
    private String skillNameEpsilon;
    
    private int skillCostAlpha;
    private int skillCostBeta;
    private int skillCostDelta;
    private int skillCostEpsilon;
    
    //Chance to use skills. Totals <100 (the rest is normal atk chance). Use as percentage.
    private int alphaChance;
    private int betaChance;
    private int deltaChance;
    private int epsilonChance;

    public Monster(String name, int level, int health, int mana, int damage, int defense, int dodge, int accuracy, int magicDamage, int criticalChance, int criticalDamage, String skillNameAlpha, String skillNameBeta, String skillNameDelta, String skillNameEpsilon, int alphaChance, int betaChance, int deltaChance, int epsilonChance) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.mana = mana;
        this.damage = damage;
        this.defense = defense;
        this.dodge = dodge;
        this.accuracy = accuracy;
        this.magicDamage = magicDamage;
        this.criticalChance = criticalChance;
        this.criticalDamage = criticalDamage;
        this.skillNameAlpha = skillNameAlpha;
        this.skillNameBeta = skillNameBeta;
        this.skillNameDelta = skillNameDelta;
        this.skillNameEpsilon = skillNameEpsilon;
        this.alphaChance = alphaChance;
        this.betaChance = betaChance;
        this.deltaChance = deltaChance;
        this.epsilonChance = epsilonChance;
    }
    
    public abstract int attack();
    public abstract int useSkillAlpha();
    public abstract int useSkillBeta();
    public abstract int useSkillDelta();
    public abstract int useSkillEpsilon();

    public int getSkillCostAlpha() {
        return skillCostAlpha;
    }

    public int getSkillCostBeta() {
        return skillCostBeta;
    }

    public int getSkillCostDelta() {
        return skillCostDelta;
    }

    public int getSkillCostEpsilon() {
        return skillCostEpsilon;
    }
    
    public void setSkillCost(int a, int b, int d, int e){
        skillCostAlpha=a;
        skillCostBeta=b;
        skillCostDelta=d;
        skillCostEpsilon=e;
    }
    
    public void setStats(int str, int mag, int dex, int agi, int luk){
            damage+=(5*str);
            health+=(5*str);
            currentHealth=health;

            magicDamage+=mag;
            mana+=(5*mag);
            currentMana=mana;
			
            accuracy+=(5*dex);
            defense+=(2*dex);

            criticalChance+=agi;
            dodge+=agi;

            dodge+=luk;
            criticalDamage+=luk;
    }
    
    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getCurrentMana() {
        return currentMana;
    }

    public void setCurrentMana(int currentMana) {
        this.currentMana = currentMana;
    }

    
    
    public void subtractCurrentHP(int amt){
        currentHealth-=amt;
    }
    
    public void subtractCurrentMP(int amt){
        currentMana-=amt;
    }
    
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getGoldDrop() {
        return goldDrop;
    }

    public void setGoldDrop(int goldDrop) {
        this.goldDrop = goldDrop;
    }

    public int getExpReward() {
        return expReward;
    }

    public void setExpReward(int expReward) {
        this.expReward = expReward;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public int getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(int criticalChance) {
        this.criticalChance = criticalChance;
    }

    public int getCriticalDamage() {
        return criticalDamage;
    }

    public void setCriticalDamage(int criticalDamage) {
        this.criticalDamage = criticalDamage;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
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

    public int getAlphaChance() {
        return alphaChance;
    }

    public void setAlphaChance(int alphaChance) {
        this.alphaChance = alphaChance;
    }

    public int getBetaChance() {
        return betaChance;
    }

    public void setBetaChance(int betaChance) {
        this.betaChance = betaChance;
    }

    public int getDeltaChance() {
        return deltaChance;
    }

    public void setDeltaChance(int deltaChance) {
        this.deltaChance = deltaChance;
    }

    public int getEpsilonChance() {
        return epsilonChance;
    }

    public void setEpsilonChance(int epsilonChance) {
        this.epsilonChance = epsilonChance;
    }
    
    
    
}
