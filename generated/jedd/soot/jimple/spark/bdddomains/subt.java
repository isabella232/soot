package soot.jimple.spark.bdddomains;

import jedd.*;
import soot.*;
import soot.jimple.spark.pag.*;

public class subt extends Domain {
    public Numberer numberer() { return Scene.v().getTypeNumberer(); }
    
    public static Domain v() { return subt.instance; }
    
    private static Domain instance = new subt();
    
    public subt() { super(); }
}
