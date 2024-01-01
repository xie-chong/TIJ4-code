package generics.exercises.e_17;

//: generics/E17_Sets2.java
/****************** Exercise 17 *****************
 * Study the JDK documentation for EnumSet. You'll
 * see there's a clone() method.
 * However, you cannot clone() from the reference
 * to the Set interface passed in Sets.java. Can you
 * modify Sets.java to handle both the general case
 * of a Set interface as shown, and the special case
 * of an EnumSet, using clone() instead of creating
 * a new HashSet?
 ************************************************/


import java.util.*;


public class Sets2 {
    @SuppressWarnings("unchecked")
    protected static <T> Set<T> copy(Set<T> s) {
        if (s instanceof EnumSet)
            return ((EnumSet) s).clone();
        return new HashSet<T>(s);
    }

    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = copy(a);
        result.addAll(b);
        return result;
    }

    public static <T>
    Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = copy(a);
        result.retainAll(b);
        return result;
    }

    public static <T> Set<T>
    difference(Set<T> superset, Set<T> subset) {
        Set<T> result = copy(superset);
        result.removeAll(subset);
        return result;
    }

    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }
}