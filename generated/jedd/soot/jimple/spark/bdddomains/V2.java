package soot.jimple.spark.bdddomains;

import jedd.*;

public class V2 extends PhysicalDomain {
    public int bits() { return 15; }
    
    public static PhysicalDomain v() { return V2.instance; }
    
    private static PhysicalDomain instance = new V2();
    
    public V2() { super(); }
}
