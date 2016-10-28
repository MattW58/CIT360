// http://www.java-samples.com/showtutorial.php?tutorialid=348
// http://web.stanford.edu/group/coursework/docsTech/jgl/api/com.objectspace.jgl.examples.HashSetExamples.html#HashSet2
/* Set
        Union
        Intersection
        Relative Complement
*/

import java.util.HashSet;

public class Col_HashSet {
    public static void main(String[] args){
        HashSet demoHashSetAD = new HashSet();
        HashSet demoHashSetCF = new HashSet();

        demoHashSetAD.add("A");
        demoHashSetAD.add("B");
        demoHashSetAD.add("C");
        demoHashSetAD.add("D");
        System.out.println(demoHashSetAD);

        demoHashSetCF.add("C");
        demoHashSetCF.add("D");
        demoHashSetCF.add("E");
        demoHashSetCF.add("F");
        System.out.println(demoHashSetCF);

        HashSet intersectionHash = new HashSet(demoHashSetAD);
        System.out.println();
        System.out.println("INTERSECTION:");
        intersectionHash.retainAll(demoHashSetCF);
        System.out.println(intersectionHash);

        HashSet unionHash = new HashSet(demoHashSetAD);
        System.out.println();
        System.out.println("UNION");
        unionHash.addAll(demoHashSetCF);
        System.out.println(unionHash);

        HashSet diffHash = new HashSet(demoHashSetAD);
        HashSet diffHash2 = new HashSet(demoHashSetAD);
        System.out.println();
        System.out.println("DIFFERENCE");
        diffHash.addAll(demoHashSetCF);
        diffHash2.retainAll(demoHashSetCF);
        diffHash.removeAll(diffHash2);
        System.out.println(diffHash);
    }
}