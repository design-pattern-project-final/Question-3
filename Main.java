

package dpproject;

/**
 *
 * @author misge
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager prez = new Manager("CEO", 200000);
        Manager marketVP = new Manager("Marketing VP", 100000);
        Manager prodVP = new Manager("Production VP", 100000);
        prez.add(prodVP);
        prez.add(marketVP);
        Manager salesMgr = new Manager("Sales Mgr", 50000);
        Manager mktMgr = new Manager("Mkt Mgr", 50000);
        marketVP.add(salesMgr);
        marketVP.add(mktMgr); 
        Manager shipMgr = new Manager("ship Mgr", 50000);
        Manager  prodMgr = new Manager("Prod Mgr", 50000);
        prodVP.add(shipMgr);
        prodVP.add(prodMgr);
        salesMgr.add( new LeafEmployee("Sales",300000));
        mktMgr.add(new LeafEmployee("Secy", 20000));
             
      //add manufacturing staff     
              
        prodMgr.add(new LeafEmployee("Manuf ", 25000)); 
 
    //add shipping clerks     
               
        shipMgr.add(new LeafEmployee("ShipClrk " , 20000));
        prez.print();
        prodVP.print();
        salesMgr.print();
        mktMgr.print();
        
        
        // TODO code application logic here
    }
    
}
