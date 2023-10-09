/**
 * @author Max Day
 * Created At: 2023/10/09
 */

// Create a subclass EstateAgentSales that extends EstateAgent
class EstateAgentSales extends EstateAgent {
    public EstateAgentSales(String agentName, double propertyPrice) {
        super(agentName, propertyPrice); // super EstateAgent
    }

    public void printPropertyReport() { // print the values
        System.out.println("ESTATE AGENT REPORT\n****************\nESTATE AGENT NAME: " + getAgentName() + "\nPROPERTY PRICE: R " + getPropertyPrice() + "\nAGENT COMMISSION: R " + getAgentCommission() + "\n****************");
    }
}