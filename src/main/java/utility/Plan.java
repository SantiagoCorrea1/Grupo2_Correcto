/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

/**
 *
 * @author SANTIAGO
 */
public class Plan {
     private String code; //
    private String name; // 
    private double price;
    private String duration; // horas que dura
    private String description; // un carretazo cualquiera
    private String days; //días que se puede
    private String hours; // horas en las que se realiza
    private int cantPeople; //cant personas que pueden particiapr por día
    private double pricepass; // precio si la persona tiene abono
    private boolean souvenir; //incluye un souvenir
    private int soldNormal; //cantidad vendidos a precio completo
    private int soldDiscount; //cantidad vendidos con descuento
    private double incomePlan; //cantidad de dinero ingresada por planes

    public Plan() {
    }

    public Plan(String code, String name, double price, String duration, String description, String days, String hours, int cantPeople, double pricepass, boolean souvenir, int soldNormal, int soldDiscount, double incomePlan) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.duration = duration;
        this.description = description;
        this.days = days;
        this.hours = hours;
        this.cantPeople = cantPeople;
        this.pricepass = pricepass;
        this.souvenir = souvenir;
        this.soldNormal = 0;
        this.soldDiscount = 0;
        this.incomePlan = 0;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the days
     */
    public String getDays() {
        return days;
    }

    /**
     * @param days the days to set
     */
    public void setDays(String days) {
        this.days = days;
    }

    /**
     * @return the hours
     */
    public String getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(String hours) {
        this.hours = hours;
    }

    /**
     * @return the cantPeople
     */
    public int getCantPeople() {
        return cantPeople;
    }

    /**
     * @param cantPeople the cantPeople to set
     */
    public void setCantPeople(int cantPeople) {
        this.cantPeople = cantPeople;
    }

    /**
     * @return the pricepass
     */
    public double getPricepass() {
        return pricepass;
    }

    /**
     * @param pricepass the pricepass to set
     */
    public void setPricepass(double pricepass) {
        this.pricepass = pricepass;
    }

    /**
     * @return the souvenir
     */
    public boolean isSouvenir() {
        return souvenir;
    }

    /**
     * @param souvenir the souvenir to set
     */
    public void setSouvenir(boolean souvenir) {
        this.souvenir = souvenir;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Plan{code=").append(getCode());
        sb.append(", name=").append(getName());
        sb.append(", price=").append(getPrice());
        sb.append(", duration=").append(getDuration());
        sb.append(", description=").append(getDescription());
        sb.append(", days=").append(getDays());
        sb.append(", hours=").append(getHours());
        sb.append(", cantPeople=").append(getCantPeople());
        sb.append(", pricepass=").append(getPricepass());
        sb.append(", souvenir=").append(isSouvenir());
        sb.append('}');
        return sb.toString();
    }

    /**
     * @return the soldNormal
     */
    public int getSoldNormal() {
        return soldNormal;
    }

    /**
     * @param soldNormal the soldNormal to set
     */
    public void setSoldNormal(int soldNormal) {
        this.soldNormal = soldNormal;
    }

    /**
     * @return the soldDiscount
     */
    public int getSoldDiscount() {
        return soldDiscount;
    }

    /**
     * @param soldDiscount the soldDiscount to set
     */
    public void setSoldDiscount(int soldDiscount) {
        this.soldDiscount = soldDiscount;
    }

    /**
     * @return the incomePlan
     */
    public double getIncomePlan() {
        return incomePlan;
    }

    /**
     * @param incomePlan the incomePlan to set
     */
    public void setIncomePlan(double incomePlan) {
        this.incomePlan = incomePlan;
    }

    
}
