package soot.jimple.spark.bdddomains;

import jedd.*;
import soot.*;
import soot.jimple.spark.pag.*;

public class atp extends Domain {
    public Numberer numberer() { return Scene.v().getTypeNumberer(); }
    
    public static Domain v() { return atp.instance; }
    
    private static Domain instance = new atp();
    
    public atp() { super(); }
}
