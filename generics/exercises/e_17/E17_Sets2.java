package generics.exercises.e_17;

import generics.watercolors.Watercolors;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

import static generics.watercolors.Watercolors.*;
import static net.mindview.util.Print.print;

public class E17_Sets2 {
    public static void main(String[] args) {
        Set<Watercolors> set1 =
                EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
        Set<Watercolors> set2 =
                EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
        print("set1: " + set1);
        print("set2: " + set2);
        print("union(set1, set2): " + Sets2.union(set1, set2));
        print("union(set1, set2) type: " +
                Sets2.union(set1, set2).getClass().getSimpleName());
        Set<Integer> set3 = new HashSet<Integer>();
        set3.add(1);
        Set<Integer> set4 = new HashSet<Integer>();
        set4.add(2);
        print("set3: " + set3);
        print("set4: " + set4);
        print("union(set3, set4): " + Sets2.union(set3, set4));
        print("union(set3, set4) type: " +
                Sets2.union(set3, set4).getClass().getSimpleName());
    }
} /* Output:
set1: [BRILLIANT_RED, CRIMSON, MAGENTA, ROSE_MADDER, VIOLET,
CERULEAN_BLUE_HUE, PHTHALO_BLUE, ULTRAMARINE,
COBALT_BLUE_HUE, PERMANENT_GREEN, VIRIDIAN_HUE]
set2: [CERULEAN_BLUE_HUE, PHTHALO_BLUE, ULTRAMARINE,
COBALT_BLUE_HUE, PERMANENT_GREEN, VIRIDIAN_HUE, SAP_GREEN,
YELLOW_OCHRE, BURNT_SIENNA, RAW_UMBER, BURNT_UMBER]
union(set1, set2): [BRILLIANT_RED, CRIMSON, MAGENTA,
ROSE_MADDER, VIOLET, CERULEAN_BLUE_HUE, PHTHALO_BLUE,
ULTRAMARINE, COBALT_BLUE_HUE, PERMANENT_GREEN, VIRIDIAN_HUE,
SAP_GREEN, YELLOW_OCHRE, BURNT_SIENNA, RAW_UMBER,
BURNT_UMBER]
union(set1, set2) type: RegularEnumSet
set3: [1]
set4: [2]
union(set3, set4): [1, 2]
union(set3, set4) type: HashSet
*///:~

/*This straightforward copy( ) method is based on the Factory Method designpattern.*/

