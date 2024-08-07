package HashMap;

public class Basic {
//    What is a HashMap in Java?
//
//    A HashMap in Java is a data structure that stores data in key-value pairs. It is a part of the Java Collections Framework and is implemented as a hash table. A HashMap allows you to store and retrieve data efficiently, making it a popular choice for many applications.
//
//    Key Terminology of HashMap in Java:
//
//    Here's a breakdown of the important terminology related to HashMap in Java:
//
//            1. Key:
//    A key is an object that is used to identify a value in the HashMap. Keys are unique, and each key is associated with a specific value. Keys can be of any object type, but they must be immutable (i.e., their state cannot be changed once they are created).
//
//            2. Value:
//    A value is an object that is associated with a key in the HashMap. Values can be of any object type, and they can be changed or updated.
//
//3. Entry:
//    An entry is a key-value pair in the HashMap. Each entry consists of a key and a value.
//
//4. Hash Code:
//    A hash code is an integer value that is generated by the hashCode() method of an object. The hash code is used to store and retrieve objects in the HashMap. When you put an object into a HashMap, its hash code is used to determine the index at which the object is stored.
//
//            5. Bucket:
//    A bucket is a slot in the HashMap where entries are stored. Each bucket can hold multiple entries, and the  entries are stored in a linked list.
//
//            6. Collision:
//    A collision occurs when two or more objects have the same hash code. When a collision occurs, the HashMap uses a technique called chaining to store the colliding entries in a linked list.
//
//7. Load Factor:
//    The load factor is a measure of how full the HashMap is. It is calculated as the ratio of the number of entries to the capacity of the HashMap. When the load factor exceeds a certain threshold (default is 0.75), the HashMap is resized to accommodate more entries.
//
//            8. Capacity:
//    The capacity is the maximum number of entries that the HashMap can hold. The capacity is increased automatically when the load factor exceeds the threshold.
//
//            9. Initial Capacity:
//    The initial capacity is the initial size of the HashMap when it is created. The default initial capacity is 16.
//
//            10. Resize:
//    Resizing occurs when the HashMap needs to increase its capacity to accommodate more entries. Resizing involves rehashing all the existing entries and storing them in the new, larger array.
//
//    HashMap Constructors and Methods:
//
//    Here are some important constructors and methods of the HashMap class:
//
//    Constructors:
//    HashMap(): Creates an empty HashMap with the default initial capacity (16) and load factor (0.75).
//    HashMap(int initialCapacity): Creates an empty HashMap with the specified initial capacity and default load factor (0.75).
//    HashMap(int initialCapacity, float loadFactor): Creates an empty HashMap with the specified initial capacity and load factor.
//    Methods:
//    put(K key, V value): Adds a new entry to the HashMap or updates the value of an existing entry.
//    get(K key): Retrieves the value associated with the specified key.
//    containsKey(K key): Checks if the HashMap contains the specified key.
//    containsValue(V value): Checks if the HashMap contains the specified value.
//    size(): Returns the number of entries in the HashMap.
//    isEmpty(): Checks if the HashMap is empty.
//    clear(): Removes all entries from the HashMap.
}
