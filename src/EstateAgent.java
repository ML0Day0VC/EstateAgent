/**
 * @author Max Day
 * Created At: 2023/10/09
 */

abstract class EstateAgent implements iEstateAgent {
    private String agentName;
    private double propertyPrice;

    public EstateAgent(String agentName, double propertyPrice) { //constructor
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
    }

    /** GETTERS */
    public String getAgentName() {
        return agentName;
    }

    public double getPropertyPrice() {
        return propertyPrice;
    }

    public double getAgentCommission() {
        return Math.round((0.20 * propertyPrice) * 100.0) / 100.0;  // Commission is 20% of property price
    }

}
