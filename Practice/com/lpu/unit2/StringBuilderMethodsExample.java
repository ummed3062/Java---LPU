package com.lpu.unit2;

public class StringBuilderMethodsExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append()
        sb.append(", Java!");
        System.out.println("After append: " + sb);

        // 2. insert()
        sb.insert(6, "World ");
        System.out.println("After insert: " + sb);

        // 3. replace()
        sb.replace(6, 11, "Beautiful");
        System.out.println("After replace: " + sb);

        // 4. delete()
        sb.delete(6, 15);
        System.out.println("After delete: " + sb);

        // 5. deleteCharAt()
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        // 6. reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);
        sb.reverse(); // Reverting to original

        // 7. length()
        System.out.println("Length: " + sb.length());

        // 8. charAt()
        System.out.println("Character at index 1: " + sb.charAt(1));

        // 9. setCharAt()
        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + sb);

        // 10. substring(start, end)
        System.out.println("Substring (0,5): " + sb.substring(0, 5));

        // 11. indexOf()
        System.out.println("Index of 'Java': " + sb.indexOf("Java"));

        // 12. lastIndexOf()
        System.out.println("Last index of 'a': " + sb.lastIndexOf("a"));

        // 13. capacity()
        System.out.println("Capacity: " + sb.capacity());

        // 14. ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("Ensured Capacity: " + sb.capacity());

        // 15. trimToSize()
        sb.trimToSize();
        System.out.println("Trimmed Capacity: " + sb.capacity());

    }
}

