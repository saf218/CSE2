
//Siarra Fiol
//Homework 2
//Arithmetic
//
//  define a class
public class Arithmetic{
    
    //  add main method 
    public static void main(String[] args) {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //Cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        //Compute total sock cost 
        double totalSockCost=nSocks*sockCost$;
        //Compute total sock cost with tax
        double totalSockCostWithTax=(totalSockCost*taxPercent)+totalSockCost;
        
        //Compute total drinking glasses cost
        double totalDrinkingGlassesCost=nGlasses*glassCost$;
        //Compute total drinking glasses cost with tax
        double totalDrinkingGlassesCostWithTax=(totalDrinkingGlassesCost*taxPercent)+totalDrinkingGlassesCost;
        
        //Compute total boxes of envelopes cost
        double totalBoxesOfEnvelopesCost=nEnvelopes*envelopeCost$;
        //Compute total boxes of envelopes cost with tax
        double totalBoxesOfEnvelopesCostWithTax=(totalBoxesOfEnvelopesCost*taxPercent)+totalBoxesOfEnvelopesCost;
        
        //Compute total cost of purchases before tax
        double totalCostOfPurchasesBeforeTax=(totalSockCost)+(totalDrinkingGlassesCost)+(totalBoxesOfEnvelopesCost);
        
        //Compute total paid for transaction with tax 
        double totalPaidTransactionWithTax=(totalSockCostWithTax)+(totalDrinkingGlassesCostWithTax)+(totalBoxesOfEnvelopesCostWithTax);
        
        System.out.println("Total Sock Cost:"+totalSockCost);
        System.out.println("Total Sock Cost with Tax:"+totalSockCostWithTax);
        System.out.println("Total Drinking Glasses Cost:"+totalDrinkingGlassesCost);
        System.out.println("Total Drinking Glasses Cost with Tax:"+totalDrinkingGlassesCostWithTax);
        System.out.println("Total Boxes of Envelopes Cost:"+totalBoxesOfEnvelopesCost);
        System.out.println("Total Boxes of Envelopes Cost with Tax:"+totalBoxesOfEnvelopesCostWithTax);
        System.out.println("Total Cost of Purchases Before Tax:"+totalCostOfPurchasesBeforeTax);
        System.out.println("Total Paid Transaction with Tax:"+totalPaidTransactionWithTax);
    }
}