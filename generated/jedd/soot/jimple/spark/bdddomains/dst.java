package soot.jimple.spark.bdddomains;

import jedd.*;
import soot.*;
import soot.jimple.spark.pag.*;

public class dst extends Domain {
    public Numberer numberer() { return ((BDDPAG) Scene.v().getPointsToAnalysis()).getVarNodeNumberer(); }
    
    public static Domain v() { return dst.instance; }
    
    private static Domain instance = new dst();
    
    public dst() { super(); }
}
