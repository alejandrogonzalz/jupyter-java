import java.util.*;
import java.util.stream.*;

/**
 * LeetCode Debug Utility Class
 *
 * Usage in notebooks:
 * 1. Run: %load Debug.java
 * 2. Execute the cell to load the class
 * 3. Use Debug.log() methods anywhere
 */
public class Debug {
    private static int indentLevel = 0;

    // ============ ARRAY LOGGING ============

    public static void log(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void log(String msg, int[] arr) {
        System.out.println(msg + ": " + Arrays.toString(arr));
    }

    public static void log(long[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void log(String msg, long[] arr) {
        System.out.println(msg + ": " + Arrays.toString(arr));
    }

    public static void log(double[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void log(String msg, double[] arr) {
        System.out.println(msg + ": " + Arrays.toString(arr));
    }

    public static void log(char[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void log(String msg, char[] arr) {
        System.out.println(msg + ": " + Arrays.toString(arr));
    }

    public static void log(boolean[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void log(String msg, boolean[] arr) {
        System.out.println(msg + ": " + Arrays.toString(arr));
    }

    // ============ 2D ARRAY LOGGING ============

    public static void log(int[][] arr) {
        System.out.println("2D Array [" + arr.length + " rows]:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("  [" + i + "]: " + Arrays.toString(arr[i]));
        }
    }

    public static void log(String msg, int[][] arr) {
        System.out.println(msg + " [" + arr.length + " rows]:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("  [" + i + "]: " + Arrays.toString(arr[i]));
        }
    }

    public static void log(char[][] arr) {
        System.out.println("2D Array [" + arr.length + " rows]:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("  [" + i + "]: " + Arrays.toString(arr[i]));
        }
    }

    public static void log(String msg, char[][] arr) {
        System.out.println(msg + " [" + arr.length + " rows]:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("  [" + i + "]: " + Arrays.toString(arr[i]));
        }
    }

    public static <T> void log(T[][] arr) {
        System.out.println("2D Array [" + arr.length + " rows]:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("  [" + i + "]: " + Arrays.toString(arr[i]));
        }
    }

    // ============ COLLECTION LOGGING ============

    public static <T> void log(List<T> list) {
        System.out.println("List[" + list.size() + "]: " + list);
    }

    public static <T> void log(String msg, List<T> list) {
        System.out.println(msg + " [size=" + list.size() + "]: " + list);
    }

    public static <T> void log(Set<T> set) {
        System.out.println("Set[" + set.size() + "]: " + set);
    }

    public static <T> void log(String msg, Set<T> set) {
        System.out.println(msg + " [size=" + set.size() + "]: " + set);
    }

    public static <K,V> void log(Map<K,V> map) {
        System.out.println("Map[" + map.size() + "]:");
        map.forEach((k, v) -> System.out.println("  " + k + " -> " + v));
    }

    public static <K,V> void log(String msg, Map<K,V> map) {
        System.out.println(msg + " [size=" + map.size() + "]:");
        map.forEach((k, v) -> System.out.println("  " + k + " -> " + v));
    }

    public static <T> void log(Queue<T> queue) {
        System.out.println("Queue[" + queue.size() + "]: " + queue);
    }

    public static <T> void log(String msg, Queue<T> queue) {
        System.out.println(msg + " [size=" + queue.size() + "]: " + queue);
    }

    public static <T> void log(Stack<T> stack) {
        System.out.println("Stack[" + stack.size() + "]: " + stack);
    }

    public static <T> void log(String msg, Stack<T> stack) {
        System.out.println(msg + " [size=" + stack.size() + "]: " + stack);
    }

    // ============ RECURSION DEBUGGING ============

    public static void enter(String method, Object... args) {
        String indent = "  ".repeat(indentLevel);
        String argsStr = Arrays.stream(args)
            .map(Debug::toString)
            .collect(Collectors.joining(", "));
        System.out.println(indent + "→ " + method + "(" + argsStr + ")");
        indentLevel++;
    }

    public static void exit(String method, Object result) {
        indentLevel--;
        String indent = "  ".repeat(indentLevel);
        System.out.println(indent + "← " + method + " = " + toString(result));
    }

    public static void step(String message) {
        String indent = "  ".repeat(indentLevel);
        System.out.println(indent + "  " + message);
    }

    // ============ GENERAL LOGGING ============

    public static void log(String message) {
        System.out.println(message);
    }

    public static void log(Object obj) {
        System.out.println(toString(obj));
    }

    public static void separator() {
        System.out.println("─".repeat(60));
    }

    public static void header(String title) {
        System.out.println("\n" + "═".repeat(60));
        System.out.println("  " + title);
        System.out.println("═".repeat(60));
    }

    // ============ HELPER METHODS ============

    private static String toString(Object obj) {
        if (obj == null) return "null";
        if (obj instanceof int[]) return Arrays.toString((int[]) obj);
        if (obj instanceof long[]) return Arrays.toString((long[]) obj);
        if (obj instanceof double[]) return Arrays.toString((double[]) obj);
        if (obj instanceof char[]) return Arrays.toString((char[]) obj);
        if (obj instanceof boolean[]) return Arrays.toString((boolean[]) obj);
        if (obj instanceof Object[]) return Arrays.toString((Object[]) obj);
        return obj.toString();
    }

    public static void reset() {
        indentLevel = 0;
    }
}
